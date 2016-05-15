
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.IOException;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketException;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author prashanth
 */
public class ConnectionManager {

    boolean proxyStatus = false;
    boolean authStatus = false;
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String ip, username, password, url, downloadDir, fileName, file, saveFilePath;
    int port;
    Proxy myProxy;
    URL u;
    HttpURLConnection httpConn;
    MainFrame mf;
    DownloadProgressFrame dpf = new DownloadProgressFrame();

    void proxyFetch() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proxyInfo", "root", "root");
            String sql = "select * from Proxy";
            pst = (PreparedStatement) con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                ip = rs.getString("ip");
                port = Integer.parseInt(rs.getString("port"));
                username = rs.getString("username");
                password = rs.getString("password");
                proxyStatus = rs.getBoolean("proxyStatus");
                authStatus = rs.getBoolean("authStatus");
            }
        } catch (ClassNotFoundException | SQLException | NumberFormatException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }

    void proxySet() {

    }

    public ConnectionManager() {

    }

    ConnectionManager(MainFrame mf) {
        this.mf = mf;
    }

    void connector() {
        mf.addURLDialog.dispose();
        dpf.show();
        url = mf.urlField.getText();
        this.proxyFetch();
        long contentLength;
        downloadDir = System.getProperty("user.home") + System.getProperty("file.separator") + "Downloads" + System.getProperty("file.separator");
        try {
            if (proxyStatus) {
                myProxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip, port));
                if (authStatus) {
                    Authenticator auth = new Authenticator() {
                        @Override
                        public PasswordAuthentication getPasswordAuthentication() {
                            return (new PasswordAuthentication(username, password.toCharArray()));
                        }
                    };
                    Authenticator.setDefault(auth);
                }
                httpConn = (HttpURLConnection) u.openConnection(myProxy);
            } else {
                httpConn = (HttpURLConnection) u.openConnection();
            }
            u = new URL(url);
            System.out.println(httpConn);
            httpConn.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
            if (httpConn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                dpf.downloadingTitle.setText("   Downloading...");
                System.out.println("conn. OK");
                String disposition = httpConn.getHeaderField("Content-Disposition");
                String contentType = httpConn.getContentType();
                contentLength = httpConn.getContentLength();
                if (disposition != null) {
                    int index = disposition.indexOf("filename=");
                    if (index > 0) {
                        fileName = disposition.substring(index + 10, disposition.length() - 1);
                    }
                } else {
                    fileName = java.net.URLDecoder.decode(url.substring(url.lastIndexOf("/") + 1, url.length()), "UTF-8");
                }
                
                dpf.filenameLabelDownloading.setText(fileName);
                dpf.fileTypeValueLabelDownloading.setText(contentType);
                dpf.sizeValueDownloading.setText(contentLength + " Bytes");
                if ((httpConn.getHeaderField("Accept-Ranges")).equals("bytes")) {
                    dpf.resumableValueLabelDownloading.setText("Yes");
                } else {
                    dpf.resumableValueLabelDownloading.setText("No");
                }
                
                saveFilePath = downloadDir + fileName;
                System.out.println("Completing Conn. mgr");
                DownloadManager dm = new DownloadManager(httpConn, dpf, mf, contentLength, saveFilePath);
                dm.startDownload();
                dpf.dispose();
            }
            else{
               //mf.fileValueLabel.setText(fileName);
                mf.downloadFailedDialog.show();
            }

        } catch (MalformedURLException ex) {
            dpf.dispose();
            mf.urlValueLabelInvalidUrlDialog.setText(url);
            mf.invalidUrlDialog.show();
            Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            dpf.dispose();
            mf.networkUnreachableDialog.show();
            Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

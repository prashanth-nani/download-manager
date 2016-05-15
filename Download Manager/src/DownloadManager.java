
import java.awt.Desktop;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.URL;
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
public class DownloadManager extends javax.swing.JFrame implements Runnable {
    
    String downloadDir, saveFilePath;
    public DownloadManager() {
        
    }
    
    
    @Override
    public void run() {
        initComponents();
        DownloadManager d = this;
        downloadButtonAddUrlDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (!urlField.getText().isEmpty()) {
                       
                    try {
                        String url, downloadDir, ip = null;
                        String username, password, fileName=null, saveFilePath;
                        int port = 0;
                        long contentLength;
                        Boolean authStatus = false;
                        Proxy myProxy;
                        HttpURLConnection httpConn;
                        byte[] buffer = new byte[4096];
                        int bytesRead = -1;
                        long totalBytesRead = 0;
                        int percentCompleted = 0;
                        
                        addURLDialog.dispose();
                        d.setVisible(true);
                        
                        url = urlField.getText();
                        downloadDir = System.getProperty("user.home") + System.getProperty("file.separator") + "Downloads" + System.getProperty("file.separator");
                        d.downloadDir = downloadDir;
                        ProxySettings ps = new ProxySettings();
                        ip = ps.proxy;
                        port = ps.port;
                         username = ps.username;
                         password = ps.password;
                         URL u = new URL(url);
                        // System.out.println(ip+" "+port+" "+username+" "+password);
                        if (ps.pFile.exists()) {
                            myProxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip, port));
                            if (ps.authStatus) {
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
                       
                        httpConn.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
                        if (httpConn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                            downloadManagerTitle.setText("   Downloading...");
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
                                //fileName = url.substring(url.lastIndexOf("/") + 1, url.length());
                            }
                            
                            fileNameValueLabel.setText(fileName);
                            fileTypeLabel.setText(contentType);
                            sizeValueLabel.setText(contentLength + " Bytes");
                            if ((httpConn.getHeaderField("Accept-Ranges")).equals("bytes")) {
                                resumableValueLabel.setText("Yes");
                            } else {
                                resumableValueLabel.setText("No");
                            }
                            
                            
                            filenameValueLabelCompletedDialog.setText(fileName);
                            saveFilePath = downloadDir + fileName;
                            d.saveFilePath = saveFilePath;
                            InputStream inputStream = new BufferedInputStream(httpConn.getInputStream());
                            FileOutputStream outputStream = new FileOutputStream(saveFilePath);
                            
                            while ((bytesRead = inputStream.read(buffer)) != -1) {
                                outputStream.write(buffer, 0, bytesRead);
                                totalBytesRead += bytesRead;
                                percentCompleted = (int) (totalBytesRead * 100 / contentLength);
                                progressBar.setValue(percentCompleted);
                                System.out.println("Bytes read : " + totalBytesRead + " Bytes");
                            }
                            inputStream.close();
                            outputStream.close();
                            httpConn.disconnect();                            
                            if (totalBytesRead == contentLength) {
                                d.hide();
                                downloadCompletedDialog.show();
                            }
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(DownloadManager.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                } else {
                    urlEmptyDialog.setVisible(true);
                }
            }
        });
        addURLDialog.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        downloadCompletedDialog = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        filenameValueLabelCompletedDialog = new javax.swing.JLabel();
        openButton = new javax.swing.JButton();
        openFolderButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        downloadFailedDialog = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        urlValueDownloadFailed = new javax.swing.JLabel();
        errorValueDownloadFailed = new javax.swing.JLabel();
        retryButtonDownloadFailed = new javax.swing.JButton();
        networkUnreachableDialog = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        okButtonNetworkUnreachableDialog = new javax.swing.JButton();
        invalidURLDialog = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        urlValueInvalidUrlDialog = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        okButtonInvalidUrlDialog = new javax.swing.JButton();
        addURLDialog = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        urlField = new javax.swing.JTextField();
        cancelButtonAddUrlDialog = new javax.swing.JButton();
        downloadButtonAddUrlDialog = new javax.swing.JButton();
        urlEmptyDialog = new javax.swing.JDialog();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        okButtonUrlEmptyDialog = new javax.swing.JButton();
        downloadManagerTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        fileNameValueLabel = new javax.swing.JLabel();
        sizeValueLabel = new javax.swing.JLabel();
        fileTypeLabel = new javax.swing.JLabel();
        speedValueLabel = new javax.swing.JLabel();
        resumableValueLabel = new javax.swing.JLabel();

        downloadCompletedDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        downloadCompletedDialog.setTitle("Download Complete");
        downloadCompletedDialog.setAlwaysOnTop(true);
        downloadCompletedDialog.setMinimumSize(new java.awt.Dimension(513, 187));
        downloadCompletedDialog.setResizable(false);

        jLabel8.setText("Download Completed !");

        jLabel9.setText("File : ");

        openButton.setText("Open");
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });

        openFolderButton.setText("Open Folder");
        openFolderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFolderButtonActionPerformed(evt);
            }
        });

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(50, Short.MAX_VALUE)
                        .addComponent(openButton)
                        .addGap(52, 52, 52)
                        .addComponent(openFolderButton)
                        .addGap(55, 55, 55)
                        .addComponent(closeButton)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filenameValueLabelCompletedDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {closeButton, openButton, openFolderButton});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(filenameValueLabelCompletedDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(openButton)
                    .addComponent(openFolderButton)
                    .addComponent(closeButton))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout downloadCompletedDialogLayout = new javax.swing.GroupLayout(downloadCompletedDialog.getContentPane());
        downloadCompletedDialog.getContentPane().setLayout(downloadCompletedDialogLayout);
        downloadCompletedDialogLayout.setHorizontalGroup(
            downloadCompletedDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        downloadCompletedDialogLayout.setVerticalGroup(
            downloadCompletedDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        downloadCompletedDialog.setLocationRelativeTo(null);

        downloadFailedDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        downloadFailedDialog.setTitle("Download Failed");
        downloadFailedDialog.setMinimumSize(new java.awt.Dimension(493, 186));
        downloadFailedDialog.setResizable(false);

        jLabel1.setText("Uhh...uhh..! Download Failed  :'(");

        jLabel10.setText("Url : ");

        jLabel11.setText("Error : ");

        retryButtonDownloadFailed.setText("Retry");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(urlValueDownloadFailed, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(errorValueDownloadFailed, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(retryButtonDownloadFailed, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(urlValueDownloadFailed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(errorValueDownloadFailed, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(retryButtonDownloadFailed)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout downloadFailedDialogLayout = new javax.swing.GroupLayout(downloadFailedDialog.getContentPane());
        downloadFailedDialog.getContentPane().setLayout(downloadFailedDialogLayout);
        downloadFailedDialogLayout.setHorizontalGroup(
            downloadFailedDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        downloadFailedDialogLayout.setVerticalGroup(
            downloadFailedDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        downloadFailedDialog.setLocationRelativeTo(null);

        networkUnreachableDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        networkUnreachableDialog.setMinimumSize(new java.awt.Dimension(455, 158));
        networkUnreachableDialog.setResizable(false);

        jLabel13.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel13.setText("Network Unreachable");

        jLabel14.setText("Please make sure that you are connected to the internet");

        okButtonNetworkUnreachableDialog.setText("OK");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel13))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel14))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(okButtonNetworkUnreachableDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel13)
                .addGap(26, 26, 26)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(okButtonNetworkUnreachableDialog)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout networkUnreachableDialogLayout = new javax.swing.GroupLayout(networkUnreachableDialog.getContentPane());
        networkUnreachableDialog.getContentPane().setLayout(networkUnreachableDialogLayout);
        networkUnreachableDialogLayout.setHorizontalGroup(
            networkUnreachableDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        networkUnreachableDialogLayout.setVerticalGroup(
            networkUnreachableDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        networkUnreachableDialog.setLocationRelativeTo(null);

        invalidURLDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        invalidURLDialog.setMinimumSize(new java.awt.Dimension(444, 180));
        invalidURLDialog.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        invalidURLDialog.setResizable(false);

        jLabel15.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel15.setText("Invalid URL !");

        jLabel16.setText("URL  : ");

        jLabel18.setText("Please enter a valid URL and retry");

        okButtonInvalidUrlDialog.setText("OK");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel15))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(urlValueInvalidUrlDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(okButtonInvalidUrlDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(urlValueInvalidUrlDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(okButtonInvalidUrlDialog)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout invalidURLDialogLayout = new javax.swing.GroupLayout(invalidURLDialog.getContentPane());
        invalidURLDialog.getContentPane().setLayout(invalidURLDialogLayout);
        invalidURLDialogLayout.setHorizontalGroup(
            invalidURLDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        invalidURLDialogLayout.setVerticalGroup(
            invalidURLDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        invalidURLDialog.setLocationRelativeTo(null);

        addURLDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addURLDialog.setTitle("Add URL");
        addURLDialog.setMinimumSize(new java.awt.Dimension(494, 180));
        addURLDialog.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        addURLDialog.setResizable(false);

        jPanel3.setMinimumSize(new java.awt.Dimension(494, 180));

        jLabel12.setText("URL : ");

        

        cancelButtonAddUrlDialog.setText("Cancel");
        cancelButtonAddUrlDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonAddUrlDialogActionPerformed(evt);
            }
        });

        downloadButtonAddUrlDialog.setText("Download");
        

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(2, 2, 2)
                .addComponent(urlField, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(cancelButtonAddUrlDialog)
                .addGap(74, 74, 74)
                .addComponent(downloadButtonAddUrlDialog)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelButtonAddUrlDialog, downloadButtonAddUrlDialog});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(urlField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButtonAddUrlDialog)
                    .addComponent(downloadButtonAddUrlDialog))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout addURLDialogLayout = new javax.swing.GroupLayout(addURLDialog.getContentPane());
        addURLDialog.getContentPane().setLayout(addURLDialogLayout);
        addURLDialogLayout.setHorizontalGroup(
            addURLDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        addURLDialogLayout.setVerticalGroup(
            addURLDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        addURLDialog.setLocationRelativeTo(null);

        urlEmptyDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        urlEmptyDialog.setTitle("URL is empty");
        urlEmptyDialog.setMinimumSize(new java.awt.Dimension(417, 168));
        urlEmptyDialog.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        urlEmptyDialog.setResizable(false);

        jLabel17.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel17.setText("URL Field Empty !");

        jLabel19.setText("Please fill  in the URL field");

        okButtonUrlEmptyDialog.setText("OK");
        okButtonUrlEmptyDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonUrlEmptyDialogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout urlEmptyDialogLayout = new javax.swing.GroupLayout(urlEmptyDialog.getContentPane());
        urlEmptyDialog.getContentPane().setLayout(urlEmptyDialogLayout);
        urlEmptyDialogLayout.setHorizontalGroup(
            urlEmptyDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(urlEmptyDialogLayout.createSequentialGroup()
                .addGroup(urlEmptyDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(urlEmptyDialogLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel17))
                    .addGroup(urlEmptyDialogLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel19))
                    .addGroup(urlEmptyDialogLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(okButtonUrlEmptyDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        urlEmptyDialogLayout.setVerticalGroup(
            urlEmptyDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(urlEmptyDialogLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel17)
                .addGap(28, 28, 28)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(okButtonUrlEmptyDialog)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        urlEmptyDialog.setLocationRelativeTo(null);

        setResizable(false);

        downloadManagerTitle.setText("Waiting for connection...");

        jLabel2.setText("File : ");

        jLabel3.setText("Size : ");

        jLabel4.setText("Downloaded : ");

        jLabel5.setText("Filetype : ");

        jLabel6.setText("Speed  : ");

        jLabel7.setText("Resumable : ");

        jButton1.setText("Pause");

        jButton2.setText("Stop");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(downloadManagerTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sizeValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(speedValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fileTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(resumableValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(274, 274, 274))
                                        .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(fileNameValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jButton1)
                .addGap(55, 55, 55)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(downloadManagerTitle)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fileNameValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sizeValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)
                        .addComponent(fileTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(speedValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resumableValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        downloadCompletedDialog.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed
    /*
    private void downloadButtonAddUrlDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadButtonAddUrlDialogActionPerformed
           if(!urlField.getText().isEmpty()){
     addURLDialog.dispose();
     this.setVisible(true);
               
     }else{
     urlEmptyDialog.setVisible(true);
     }
    }//GEN-LAST:event_downloadButtonAddUrlDialogActionPerformed

    private void urlFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urlFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urlFieldActionPerformed
*/
    private void openFolderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFolderButtonActionPerformed
     try {
            downloadCompletedDialog.dispose();
            Desktop.getDesktop().open(new File(downloadDir));
        } catch (IOException ex) {
            Logger.getLogger(DownloadManager.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_openFolderButtonActionPerformed

    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButtonActionPerformed
        try {
            downloadCompletedDialog.dispose();
            Desktop.getDesktop().open(new File(saveFilePath));
        } catch (IOException ex) {
            Logger.getLogger(DownloadManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_openButtonActionPerformed

    private void cancelButtonAddUrlDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonAddUrlDialogActionPerformed
        addURLDialog.dispose();
    }//GEN-LAST:event_cancelButtonAddUrlDialogActionPerformed

    private void okButtonUrlEmptyDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonUrlEmptyDialogActionPerformed
        urlEmptyDialog.dispose();
    }//GEN-LAST:event_okButtonUrlEmptyDialogActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog addURLDialog;
    private javax.swing.JButton cancelButtonAddUrlDialog;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton downloadButtonAddUrlDialog;
    private javax.swing.JDialog downloadCompletedDialog;
    private javax.swing.JDialog downloadFailedDialog;
    private javax.swing.JLabel downloadManagerTitle;
    private javax.swing.JLabel errorValueDownloadFailed;
    private javax.swing.JLabel fileNameValueLabel;
    private javax.swing.JLabel fileTypeLabel;
    private javax.swing.JLabel filenameValueLabelCompletedDialog;
    private javax.swing.JDialog invalidURLDialog;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JDialog networkUnreachableDialog;
    private javax.swing.JButton okButtonInvalidUrlDialog;
    private javax.swing.JButton okButtonNetworkUnreachableDialog;
    private javax.swing.JButton okButtonUrlEmptyDialog;
    private javax.swing.JButton openButton;
    private javax.swing.JButton openFolderButton;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel resumableValueLabel;
    private javax.swing.JButton retryButtonDownloadFailed;
    private javax.swing.JLabel sizeValueLabel;
    private javax.swing.JLabel speedValueLabel;
    private javax.swing.JDialog urlEmptyDialog;
    public javax.swing.JTextField urlField;
    private javax.swing.JLabel urlValueDownloadFailed;
    private javax.swing.JLabel urlValueInvalidUrlDialog;
    // End of variables declaration//GEN-END:variables
}

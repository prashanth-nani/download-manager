/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
import java.net.URLConnection;

/**
 *
 * @author prashanth
 */
public class DownloadManager {

    public String value;
    public boolean downloaded;
    public File downloadedFile;
    public String urlEntered;
    public String ip, username, password;
    public int port;
    String downloadDir;

    public void download() {
        try {
            URL u = new URL(urlEntered);
            Proxy myproxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip, port));
            Authenticator authenticator = new Authenticator() {

                @Override
                public PasswordAuthentication getPasswordAuthentication() {
                    return (new PasswordAuthentication(username, password.toCharArray()));
                }
            };
            Authenticator.setDefault(authenticator);

            HttpURLConnection uc = (HttpURLConnection) u.openConnection(myproxy);
            if (uc.getResponseCode() == 200) {
                System.out.println("Connection OK!");

                String contentType = uc.getContentType();
                value = contentType;
                String file = u.getFile();
                String filename = file.substring(file.lastIndexOf('/') + 1);
                System.out.println("File name: " + filename);
                System.out.println("File Type: " + contentType);
                int contentLength = uc.getContentLength();
                System.out.println("File size: " + (float) contentLength / (1024 * 1024) + "MB");

                InputStream raw = uc.getInputStream();
                InputStream in = new BufferedInputStream(raw);
                byte[] data = new byte[contentLength];
                int bytesRead = 0;
                int offset = 0;
                while (offset < contentLength) {
                    bytesRead = in.read(data, offset, data.length - offset);
                    if (bytesRead == -1) {
                        break;
                    }
                    offset += bytesRead;
                }
                in.close();

                if (offset != contentLength) {
                    throw new IOException("Only read " + offset + " bytes; Expected " + contentLength + " bytes");
                } else {
                    downloaded = true;
                    System.out.println("Download Completed !!!");
                }
                downloadDir = System.getProperty("user.home") + System.getProperty("file.separator") + "Downloads" + System.getProperty("file.separator");
                FileOutputStream out = new FileOutputStream(downloadDir + filename);
                downloadedFile = new File(downloadDir + filename);
                out.write(data);
                out.flush();
                out.close();
            } else {
                System.out.println("Connection error! Error: " + uc.getResponseCode());
            }

        } catch (Exception e) {
            e.getMessage();
        }
    }
}


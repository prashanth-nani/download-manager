
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
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
public class DownloadManager {

    private static final int BUFFER_SIZE = 4096;
    HttpURLConnection httpConn;
    DownloadProgressFrame dpf;
    MainFrame mf;
    byte[] buffer = new byte[BUFFER_SIZE];
    int bytesRead = -1;
    long totalBytesRead = 0;
    int percentCompleted = 0;
    long contentLength;
    String saveFilePath = null;

    public DownloadManager(HttpURLConnection httpConn, DownloadProgressFrame dpf, MainFrame mf, long contentLength, String saveFilePath) {
        this.httpConn = httpConn;
        this.dpf = dpf;
        this.mf = mf;
        this.contentLength = contentLength;
        this.saveFilePath = saveFilePath;
    }

    void startDownload() {
        try {
            InputStream inputStream = new BufferedInputStream(httpConn.getInputStream());
            FileOutputStream outputStream = new FileOutputStream(saveFilePath);

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
                totalBytesRead += bytesRead;
                percentCompleted = (int) (totalBytesRead * 100 / contentLength);
                dpf.progressBarDownloading.setValue(percentCompleted);
                dpf.speedValueLabelDownloading.setText(bytesRead+"");
                dpf.downloadedValueLabelDownloading.setText(totalBytesRead+" Bytes");
                System.out.println("Bytes read : "+totalBytesRead+" Bytes");
            }
            inputStream.close();
            outputStream.close();
            httpConn.disconnect(); 
            if(totalBytesRead == contentLength){
                mf.downloadCompletedDialog.show();
            }
        } catch (IOException ex) {
            Logger.getLogger(DownloadManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

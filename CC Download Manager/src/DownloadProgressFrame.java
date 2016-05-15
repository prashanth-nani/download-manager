
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prashanth
 */
public class DownloadProgressFrame extends javax.swing.JFrame {

    /**
     * Creates new form downloadManagerFrame
     */
    public DownloadProgressFrame() {
        initComponents();
    }
   /* public DownloadProgressFrame(String fileName){
        initComponents();
        filenameLabelDownloading.setText(fileName);
    }*/

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        downloadProgressPanel = new javax.swing.JPanel();
        downloadingTitle = new javax.swing.JLabel();
        fileLabelDownloading = new javax.swing.JLabel();
        filenameLabelDownloading = new javax.swing.JLabel();
        sizeLabelDownloading = new javax.swing.JLabel();
        sizeValueDownloading = new javax.swing.JLabel();
        fileTypeLabelDownloading = new javax.swing.JLabel();
        fileTypeValueLabelDownloading = new javax.swing.JLabel();
        downloadedLabelDownloading = new javax.swing.JLabel();
        downloadedValueLabelDownloading = new javax.swing.JLabel();
        speedLabelDownloading = new javax.swing.JLabel();
        speedValueLabelDownloading = new javax.swing.JLabel();
        resumableLabelDownloading = new javax.swing.JLabel();
        resumableValueLabelDownloading = new javax.swing.JLabel();
        progressBarDownloading = new javax.swing.JProgressBar();
        pauseResumeButtonDownloading = new javax.swing.JButton();
        stopButtonDownloading = new javax.swing.JButton();

        downloadingTitle.setText("Waiting for connection...");

        fileLabelDownloading.setText("File : ");

        sizeLabelDownloading.setText("Size : ");

        fileTypeLabelDownloading.setText("Type : ");

        downloadedLabelDownloading.setText("Downloaded : ");

        speedLabelDownloading.setText("Speed : ");

        resumableLabelDownloading.setText("Resumable : ");

        pauseResumeButtonDownloading.setText("Pause");

        stopButtonDownloading.setText("Stop");
        stopButtonDownloading.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonDownloadingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout downloadProgressPanelLayout = new javax.swing.GroupLayout(downloadProgressPanel);
        downloadProgressPanel.setLayout(downloadProgressPanelLayout);
        downloadProgressPanelLayout.setHorizontalGroup(
            downloadProgressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(downloadProgressPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(downloadProgressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(downloadProgressPanelLayout.createSequentialGroup()
                        .addComponent(sizeLabelDownloading)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sizeValueDownloading, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(fileTypeLabelDownloading)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fileTypeValueLabelDownloading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(downloadProgressPanelLayout.createSequentialGroup()
                        .addGroup(downloadProgressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(downloadProgressPanelLayout.createSequentialGroup()
                                .addComponent(fileLabelDownloading)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filenameLabelDownloading, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(downloadProgressPanelLayout.createSequentialGroup()
                                .addComponent(downloadedLabelDownloading)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(downloadedValueLabelDownloading, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(speedLabelDownloading)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(speedValueLabelDownloading, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(progressBarDownloading, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(downloadProgressPanelLayout.createSequentialGroup()
                                .addComponent(resumableLabelDownloading)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resumableValueLabelDownloading, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
            .addGroup(downloadProgressPanelLayout.createSequentialGroup()
                .addGroup(downloadProgressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(downloadProgressPanelLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(pauseResumeButtonDownloading, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(stopButtonDownloading))
                    .addGroup(downloadProgressPanelLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(downloadingTitle)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        downloadProgressPanelLayout.setVerticalGroup(
            downloadProgressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(downloadProgressPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(downloadingTitle)
                .addGap(11, 11, 11)
                .addGroup(downloadProgressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fileLabelDownloading)
                    .addComponent(filenameLabelDownloading, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(downloadProgressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sizeLabelDownloading)
                    .addComponent(sizeValueDownloading, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(downloadProgressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fileTypeLabelDownloading)
                        .addComponent(fileTypeValueLabelDownloading, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(downloadProgressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(downloadProgressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(downloadedLabelDownloading)
                        .addComponent(downloadedValueLabelDownloading, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(downloadProgressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(speedLabelDownloading)
                        .addComponent(speedValueLabelDownloading, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(downloadProgressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resumableLabelDownloading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resumableValueLabelDownloading, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(progressBarDownloading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(downloadProgressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pauseResumeButtonDownloading)
                    .addComponent(stopButtonDownloading))
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(downloadProgressPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(downloadProgressPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void stopButtonDownloadingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonDownloadingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stopButtonDownloadingActionPerformed

    /**
     * @param args the command line arguments
     */
   // public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DownloadProgressFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DownloadProgressFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DownloadProgressFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DownloadProgressFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
    /*    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DownloadProgressFrame().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel downloadProgressPanel;
    public javax.swing.JLabel downloadedLabelDownloading;
    public javax.swing.JLabel downloadedValueLabelDownloading;
    public javax.swing.JLabel downloadingTitle;
    public javax.swing.JLabel fileLabelDownloading;
    public javax.swing.JLabel fileTypeLabelDownloading;
    public javax.swing.JLabel fileTypeValueLabelDownloading;
    public javax.swing.JLabel filenameLabelDownloading;
    public javax.swing.JButton pauseResumeButtonDownloading;
    public javax.swing.JProgressBar progressBarDownloading;
    public javax.swing.JLabel resumableLabelDownloading;
    public javax.swing.JLabel resumableValueLabelDownloading;
    public javax.swing.JLabel sizeLabelDownloading;
    public javax.swing.JLabel sizeValueDownloading;
    public javax.swing.JLabel speedLabelDownloading;
    public javax.swing.JLabel speedValueLabelDownloading;
    public javax.swing.JButton stopButtonDownloading;
    // End of variables declaration//GEN-END:variables
}

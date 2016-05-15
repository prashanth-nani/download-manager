
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProxySettings extends javax.swing.JFrame {

    String ccdDocumentsDir, proxyFilePath, proxy, username, password;
    int port;
    boolean authStatus;
    File pFile;

    public ProxySettings() throws IOException {
        initComponents();
        ccdDocumentsDir = System.getProperty("user.home") + System.getProperty("file.separator") + "Documents" + System.getProperty("file.separator") + "CCDownloadManagerConfig" + System.getProperty("file.separator");
        proxyFilePath = ccdDocumentsDir + "proxy.ccd";
        File pFile = new File(proxyFilePath);
        this.pFile = pFile;
        fillValues();
        //this.setVisible(true);
    }

    public void fillValues() throws FileNotFoundException, IOException {
        String str = null;
        int i = 0;
        if (pFile.exists()) {
            FileInputStream fstream = new FileInputStream(proxyFilePath);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            while ((str = br.readLine()) != null) {
                switch (i) {
                    case 0:
                        proxy = str;
                        proxyField.setText(str);
                        break;
                    case 1:
                        port = Integer.parseInt(str);
                        portField.setText(str);
                        break;
                    case 2:
                        username = str;
                        usernameProxyField.setText(str);
                        break;
                    case 3:
                        password = str;
                        passwordProxyField.setText(str);
                        break;
                }
                i++;
            }
            if (i == 4) {
                authStatus = true;
            } else {
                authStatus = false;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        proxyEmptyFieldDialog = new javax.swing.JDialog();
        settingsUnsavedReason = new javax.swing.JLabel();
        okButtonProxyEmptyDialog = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        proxyPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        proxyField = new javax.swing.JTextField();
        portField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        authCheckBox = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usernameProxyField = new javax.swing.JTextField();
        passwordProxyField = new javax.swing.JPasswordField();
        okButtonProxy = new javax.swing.JButton();
        cancelButtonProxy = new javax.swing.JButton();

        settingsUnsavedReason.setText("Please fill all the mandatory proxy fields");

        okButtonProxyEmptyDialog.setText("OK");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel7.setText("Settings are not saved");

        javax.swing.GroupLayout proxyEmptyFieldDialogLayout = new javax.swing.GroupLayout(proxyEmptyFieldDialog.getContentPane());
        proxyEmptyFieldDialog.getContentPane().setLayout(proxyEmptyFieldDialogLayout);
        proxyEmptyFieldDialogLayout.setHorizontalGroup(
            proxyEmptyFieldDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proxyEmptyFieldDialogLayout.createSequentialGroup()
                .addGroup(proxyEmptyFieldDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(proxyEmptyFieldDialogLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(settingsUnsavedReason))
                    .addGroup(proxyEmptyFieldDialogLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(okButtonProxyEmptyDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(proxyEmptyFieldDialogLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel7)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        proxyEmptyFieldDialogLayout.setVerticalGroup(
            proxyEmptyFieldDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proxyEmptyFieldDialogLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(settingsUnsavedReason)
                .addGap(20, 20, 20)
                .addComponent(okButtonProxyEmptyDialog)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Proxy Settings");

        jLabel1.setText("Proxy : ");

        jLabel3.setText("Port : ");

        authCheckBox.setText("Authentication");

        jLabel4.setText("Username : ");

        jLabel5.setText("Password : ");

        okButtonProxy.setText("OK");
        okButtonProxy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonProxyActionPerformed(evt);
            }
        });

        cancelButtonProxy.setText("Cancel");
        cancelButtonProxy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonProxyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout proxyPanelLayout = new javax.swing.GroupLayout(proxyPanel);
        proxyPanel.setLayout(proxyPanelLayout);
        proxyPanelLayout.setHorizontalGroup(
            proxyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proxyPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(proxyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(proxyPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(3, 3, 3)
                        .addComponent(proxyField, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(2, 2, 2)
                        .addComponent(portField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(proxyPanelLayout.createSequentialGroup()
                        .addGroup(proxyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(proxyPanelLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(2, 2, 2)
                                .addComponent(usernameProxyField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(proxyPanelLayout.createSequentialGroup()
                                .addGap(264, 264, 264)
                                .addComponent(jLabel5)
                                .addGap(3, 3, 3)
                                .addComponent(passwordProxyField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(authCheckBox))
                        .addGap(0, 44, Short.MAX_VALUE))))
            .addGroup(proxyPanelLayout.createSequentialGroup()
                .addGroup(proxyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(proxyPanelLayout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel2))
                    .addGroup(proxyPanelLayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(cancelButtonProxy, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(okButtonProxy, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        proxyPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelButtonProxy, okButtonProxy});

        proxyPanelLayout.setVerticalGroup(
            proxyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proxyPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(proxyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(proxyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(portField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(authCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(proxyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(proxyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(usernameProxyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passwordProxyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(proxyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButtonProxy)
                    .addComponent(cancelButtonProxy))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(proxyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(proxyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonProxyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonProxyActionPerformed
        if (proxyField.getText().isEmpty() && portField.getText().isEmpty() && usernameProxyField.getText().isEmpty() && passwordProxyField.getText().isEmpty()) {
            pFile.delete();
            this.dispose();
        } else if (proxyField.getText().isEmpty() && !portField.getText().isEmpty()) {
            proxyEmptyFieldDialog.setVisible(true);
        } else if (!proxyField.getText().isEmpty() && portField.getText().isEmpty()) {
            proxyEmptyFieldDialog.setVisible(true);
        } else if (usernameProxyField.getText().isEmpty() && !passwordProxyField.getText().isEmpty()) {
            proxyEmptyFieldDialog.setVisible(true);
        } else if (!usernameProxyField.getText().isEmpty() && passwordProxyField.getText().isEmpty()) {
            proxyEmptyFieldDialog.setVisible(true);
        } else {
            boolean portValue=true;
            try {
                int i = Integer.parseInt(portField.getText());
            } catch (NumberFormatException nfe) {
                portValue = false;
                settingsUnsavedReason.setText("                      Invalid Port Number!");
                proxyEmptyFieldDialog.setVisible(true);
            }
            if (portValue) {
                PrintWriter pw = null;
                try {
                    File dir = new File(ccdDocumentsDir);
                    dir.mkdir();
                    pw = new PrintWriter(new FileWriter(proxyFilePath));
                    pw.write(proxyField.getText());
                    pw.write("\n" + portField.getText());
                    pw.write("\n" + usernameProxyField.getText());
                    pw.write("\n" + passwordProxyField.getText());
                    pw.close();
                } catch (IOException ex) {
                    Logger.getLogger(ProxySettings.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    pw.close();
                }
                this.dispose();
            }
        }
    }//GEN-LAST:event_okButtonProxyActionPerformed

    private void cancelButtonProxyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonProxyActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonProxyActionPerformed

    /* public static void main(String args[]) {
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
     java.util.logging.Logger.getLogger(ProxySettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (InstantiationException ex) {
     java.util.logging.Logger.getLogger(ProxySettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (IllegalAccessException ex) {
     java.util.logging.Logger.getLogger(ProxySettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
     java.util.logging.Logger.getLogger(ProxySettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     }
     //</editor-fold>

     /* Create and display the form */
    /*  java.awt.EventQueue.invokeLater(new Runnable() {
     public void run() {
     new ProxySettings().setVisible(true);
     }
     });
     }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox authCheckBox;
    private javax.swing.JButton cancelButtonProxy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton okButtonProxy;
    private javax.swing.JButton okButtonProxyEmptyDialog;
    private javax.swing.JPasswordField passwordProxyField;
    private javax.swing.JTextField portField;
    private javax.swing.JDialog proxyEmptyFieldDialog;
    private javax.swing.JTextField proxyField;
    private javax.swing.JPanel proxyPanel;
    private javax.swing.JLabel settingsUnsavedReason;
    private javax.swing.JTextField usernameProxyField;
    // End of variables declaration//GEN-END:variables
}

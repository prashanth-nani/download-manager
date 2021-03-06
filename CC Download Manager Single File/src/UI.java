
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
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
public class UI extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public UI() {
       initComponents();
       username.disable();
       password.disable();
    }
    
    DownloadManager d = new DownloadManager();
    String str1;
    Desktop desktop;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterUrlDialog = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        downloadCompleteDialog = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        downloadOKButton = new javax.swing.JButton();
        openFileButton = new javax.swing.JButton();
        openFolderButton = new javax.swing.JButton();
        connErrorDialod = new javax.swing.JDialog();
        connErrorTitle = new javax.swing.JLabel();
        retryButton = new javax.swing.JButton();
        proxyDialog = new javax.swing.JDialog();
        proxyPane = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ipAddressLabel = new javax.swing.JLabel();
        portLabel = new javax.swing.JLabel();
        ipAddress = new javax.swing.JTextField();
        port = new javax.swing.JTextField();
        authRequired = new javax.swing.JCheckBox();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        proxyDoneButton = new javax.swing.JButton();
        proxyCancelButton = new javax.swing.JButton();
        downloadManagerPanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        urlLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        urlField = new javax.swing.JTextField();
        fileTypeLabel = new javax.swing.JLabel();
        fileTypeValueLabel = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        menuBar = new javax.swing.JMenuBar();
        SettingsMenu = new javax.swing.JMenu();
        destinationFolderMenuItem = new javax.swing.JMenuItem();
        proxySettingsMenuItem = new javax.swing.JMenuItem();

        enterUrlDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        enterUrlDialog.setTitle("Error");
        enterUrlDialog.setLocation(new java.awt.Point(500, 250));
        enterUrlDialog.setMinimumSize(new java.awt.Dimension(440, 160));
        enterUrlDialog.setResizable(false);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("Please enter the url !");

        javax.swing.GroupLayout enterUrlDialogLayout = new javax.swing.GroupLayout(enterUrlDialog.getContentPane());
        enterUrlDialog.getContentPane().setLayout(enterUrlDialogLayout);
        enterUrlDialogLayout.setHorizontalGroup(
            enterUrlDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enterUrlDialogLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel1)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        enterUrlDialogLayout.setVerticalGroup(
            enterUrlDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enterUrlDialogLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        downloadCompleteDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        downloadCompleteDialog.setLocation(new java.awt.Point(400, 220));
        downloadCompleteDialog.setMinimumSize(new java.awt.Dimension(450, 180));
        downloadCompleteDialog.setResizable(false);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Download Completed !");

        downloadOKButton.setText("OK");
        downloadOKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadOKButtonActionPerformed(evt);
            }
        });

        openFileButton.setText("Open File");
        openFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileButtonActionPerformed(evt);
            }
        });

        openFolderButton.setText("Open Folder");
        openFolderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFolderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout downloadCompleteDialogLayout = new javax.swing.GroupLayout(downloadCompleteDialog.getContentPane());
        downloadCompleteDialog.getContentPane().setLayout(downloadCompleteDialogLayout);
        downloadCompleteDialogLayout.setHorizontalGroup(
            downloadCompleteDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(downloadCompleteDialogLayout.createSequentialGroup()
                .addGroup(downloadCompleteDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(downloadCompleteDialogLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(openFileButton)
                        .addGap(33, 33, 33)
                        .addComponent(openFolderButton)
                        .addGap(39, 39, 39)
                        .addComponent(downloadOKButton))
                    .addGroup(downloadCompleteDialogLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel2)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        downloadCompleteDialogLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {downloadOKButton, openFileButton});

        downloadCompleteDialogLayout.setVerticalGroup(
            downloadCompleteDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(downloadCompleteDialogLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(downloadCompleteDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(downloadOKButton)
                    .addComponent(openFileButton)
                    .addComponent(openFolderButton))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        connErrorDialod.setMinimumSize(new java.awt.Dimension(570, 247));
        connErrorDialod.setResizable(false);

        connErrorTitle.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        connErrorTitle.setText("Download failed! Please check your internet connection.");

        retryButton.setText("Retry");
        retryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retryButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout connErrorDialodLayout = new javax.swing.GroupLayout(connErrorDialod.getContentPane());
        connErrorDialod.getContentPane().setLayout(connErrorDialodLayout);
        connErrorDialodLayout.setHorizontalGroup(
            connErrorDialodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(connErrorDialodLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(connErrorTitle)
                .addGap(52, 52, 52))
            .addGroup(connErrorDialodLayout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(retryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        connErrorDialodLayout.setVerticalGroup(
            connErrorDialodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(connErrorDialodLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(connErrorTitle)
                .addGap(26, 26, 26)
                .addComponent(retryButton)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        proxyDialog.setLocation(new java.awt.Point(500, 220));
        proxyDialog.setMinimumSize(new java.awt.Dimension(550, 320));
        proxyDialog.setResizable(false);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setText("Proxy Settings");

        ipAddressLabel.setText("IP address: ");

        portLabel.setText("Port: ");

        ipAddress.setText("172.31.100.29");

        port.setText("3128");
        port.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portActionPerformed(evt);
            }
        });

        authRequired.setText("Authentication Required");
        authRequired.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                authRequiredItemStateChanged(evt);
            }
        });
        authRequired.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authRequiredActionPerformed(evt);
            }
        });

        usernameLabel.setText("Username: ");

        passwordLabel.setText("Password: ");

        username.setText("edcguest");

        password.setText("edcguest");
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        proxyDoneButton.setText("OK");
        proxyDoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proxyDoneButtonActionPerformed(evt);
            }
        });

        proxyCancelButton.setText("Cancel");
        proxyCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proxyCancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout proxyPaneLayout = new javax.swing.GroupLayout(proxyPane);
        proxyPane.setLayout(proxyPaneLayout);
        proxyPaneLayout.setHorizontalGroup(
            proxyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proxyPaneLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(proxyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(proxyPaneLayout.createSequentialGroup()
                        .addGroup(proxyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, proxyPaneLayout.createSequentialGroup()
                                .addComponent(ipAddressLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ipAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(proxyPaneLayout.createSequentialGroup()
                                .addGroup(proxyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(proxyPaneLayout.createSequentialGroup()
                                        .addComponent(usernameLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(proxyCancelButton))
                                .addGap(22, 22, 22)))
                        .addGroup(proxyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(proxyPaneLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(passwordLabel)
                                .addGap(1, 1, 1)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 66, Short.MAX_VALUE))
                            .addGroup(proxyPaneLayout.createSequentialGroup()
                                .addGroup(proxyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(proxyPaneLayout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(proxyDoneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(proxyPaneLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(portLabel)
                                        .addGap(4, 4, 4)
                                        .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(proxyPaneLayout.createSequentialGroup()
                        .addComponent(authRequired)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, proxyPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(197, 197, 197))
        );

        proxyPaneLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {proxyCancelButton, proxyDoneButton});

        proxyPaneLayout.setVerticalGroup(
            proxyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proxyPaneLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(29, 29, 29)
                .addGroup(proxyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipAddressLabel)
                    .addComponent(ipAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(portLabel)
                    .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(authRequired)
                .addGroup(proxyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(proxyPaneLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(proxyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(proxyDoneButton)
                            .addComponent(proxyCancelButton)))
                    .addGroup(proxyPaneLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(proxyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLabel)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout proxyDialogLayout = new javax.swing.GroupLayout(proxyDialog.getContentPane());
        proxyDialog.getContentPane().setLayout(proxyDialogLayout);
        proxyDialogLayout.setHorizontalGroup(
            proxyDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(proxyPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        proxyDialogLayout.setVerticalGroup(
            proxyDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(proxyPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Download Manager");
        setLocation(new java.awt.Point(300, 150));

        title.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        title.setText("Download Manager");

        urlLabel.setText("URL : ");

        jButton1.setText("Download");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        urlField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urlFieldActionPerformed(evt);
            }
        });

        fileTypeLabel.setText("File Type: ");

        javax.swing.GroupLayout downloadManagerPanelLayout = new javax.swing.GroupLayout(downloadManagerPanel);
        downloadManagerPanel.setLayout(downloadManagerPanelLayout);
        downloadManagerPanelLayout.setHorizontalGroup(
            downloadManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, downloadManagerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title)
                .addGap(223, 223, 223))
            .addGroup(downloadManagerPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(downloadManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(downloadManagerPanelLayout.createSequentialGroup()
                        .addComponent(fileTypeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fileTypeValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(downloadManagerPanelLayout.createSequentialGroup()
                        .addComponent(urlLabel)
                        .addGap(4, 4, 4)
                        .addComponent(urlField, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        downloadManagerPanelLayout.setVerticalGroup(
            downloadManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(downloadManagerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(20, 20, 20)
                .addGroup(downloadManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urlLabel)
                    .addComponent(jButton1)
                    .addComponent(urlField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(downloadManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fileTypeValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fileTypeLabel))
                .addGap(28, 28, 28)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        SettingsMenu.setText("Settings");

        destinationFolderMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        destinationFolderMenuItem.setText("Destination folder");
        destinationFolderMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationFolderMenuItemActionPerformed(evt);
            }
        });
        SettingsMenu.add(destinationFolderMenuItem);

        proxySettingsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        proxySettingsMenuItem.setText("Proxy Settings");
        proxySettingsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proxySettingsMenuItemActionPerformed(evt);
            }
        });
        SettingsMenu.add(proxySettingsMenuItem);

        menuBar.add(SettingsMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(downloadManagerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(downloadManagerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //statusLabel.setText("Download Button clicked!");
        if(!urlField.getText().isEmpty()){
            d.urlEntered = urlField.getText();
            setProxy();
            d.download();
            setFileTypeLabelText();
            if(d.downloaded){
                downloadCompleteDialog.show();
            }
            else
                connErrorDialod.show();
        }
        else{
            System.out.println("Please enter the url");
            enterUrlDialog.show();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    void setProxy(){
        d.ip = ipAddress.getText();
        d.port = Integer.parseInt(port.getText());
        d.username = username.getText();
        d.password = password.getText();
    }
    
    private void urlFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urlFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urlFieldActionPerformed
    
    private void downloadOKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadOKButtonActionPerformed
        // TODO add your handling code here:
        downloadCompleteDialog.dispose();
    }//GEN-LAST:event_downloadOKButtonActionPerformed

    private void retryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retryButtonActionPerformed
        // TODO add your handling code here:
        connErrorDialod.dispose();
        //statusLabel.setText("Download Button clicked!");
        if(!urlField.getText().isEmpty()){
            d.urlEntered = urlField.getText();
            setProxy();
            d.download();
            setFileTypeLabelText();
            if(d.downloaded){
                downloadCompleteDialog.show();
            }
            else
                connErrorDialod.show();
        }
        else{
            System.out.println("Please enter the url");
            enterUrlDialog.show();
        }
    }//GEN-LAST:event_retryButtonActionPerformed

    private void proxySettingsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proxySettingsMenuItemActionPerformed
        // TODO add your handling code here:
        proxyDialog.show();
    }//GEN-LAST:event_proxySettingsMenuItemActionPerformed

    private void destinationFolderMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationFolderMenuItemActionPerformed
        /*try {
            // TODO add your handling code here:
            desktop.getDesktop().browse();
        } catch (IOException ex) {
            Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_destinationFolderMenuItemActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void portActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_portActionPerformed

    private void openFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileButtonActionPerformed
        // TODO add your handling code here:
        try {
            desktop.getDesktop().open(d.downloadedFile);
        } catch (IOException ex) {
            Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_openFileButtonActionPerformed

    private void openFolderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFolderButtonActionPerformed
        // TODO add your handling code here:
        try {
            desktop.getDesktop().open(new File(d.downloadDir));
        } catch (IOException ex) {
            Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_openFolderButtonActionPerformed

    private void authRequiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authRequiredActionPerformed
        // TODO add your handling code here:
        if(authRequired.isEnabled()){
          username.enable();
            password.enable();
        }
    }//GEN-LAST:event_authRequiredActionPerformed

    private void authRequiredItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_authRequiredItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_authRequiredItemStateChanged

    private void proxyCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proxyCancelButtonActionPerformed
        // TODO add your handling code here:
        proxyDialog.dispose();
    }//GEN-LAST:event_proxyCancelButtonActionPerformed

    private void proxyDoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proxyDoneButtonActionPerformed
        // TODO add your handling code here:
        //setProxy();
        proxyDialog.dispose();
    }//GEN-LAST:event_proxyDoneButtonActionPerformed
       
    public void setFileTypeLabelText(){
        str1 = d.value;
        fileTypeValueLabel.setText(str1);
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
            
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu SettingsMenu;
    private javax.swing.JCheckBox authRequired;
    private javax.swing.JDialog connErrorDialod;
    private javax.swing.JLabel connErrorTitle;
    private javax.swing.JMenuItem destinationFolderMenuItem;
    private javax.swing.JDialog downloadCompleteDialog;
    private javax.swing.JPanel downloadManagerPanel;
    private javax.swing.JButton downloadOKButton;
    private javax.swing.JDialog enterUrlDialog;
    private javax.swing.JLabel fileTypeLabel;
    private javax.swing.JLabel fileTypeValueLabel;
    private javax.swing.JTextField ipAddress;
    private javax.swing.JLabel ipAddressLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton openFileButton;
    private javax.swing.JButton openFolderButton;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField port;
    private javax.swing.JLabel portLabel;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JButton proxyCancelButton;
    private javax.swing.JDialog proxyDialog;
    private javax.swing.JButton proxyDoneButton;
    private javax.swing.JPanel proxyPane;
    private javax.swing.JMenuItem proxySettingsMenuItem;
    private javax.swing.JButton retryButton;
    private javax.swing.JLabel title;
    private javax.swing.JTextField urlField;
    private javax.swing.JLabel urlLabel;
    private javax.swing.JTextField username;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables

}

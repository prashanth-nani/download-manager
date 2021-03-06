
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prashanth
 */
public class MainFrame extends javax.swing.JFrame {
    public MainFrame() {
        initComponents();
    }
    
    ConnectionManager cm = new ConnectionManager(this);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        urlEmptyDialog = new javax.swing.JDialog();
        urlEmptyPanel = new javax.swing.JPanel();
        urlEmptyMessageLabel = new javax.swing.JLabel();
        okButtonUrlEmptyDialog = new javax.swing.JButton();
        proxySettingsDialog = new javax.swing.JDialog();
        proxyDialogTitle = new javax.swing.JLabel();
        proxyLabel = new javax.swing.JLabel();
        proxyTextField = new javax.swing.JTextField();
        portLabel = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        authCheckbox = new javax.swing.JCheckBox();
        usernameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        proxyDialogCancelButton = new javax.swing.JButton();
        proxyDialogOkButton = new javax.swing.JButton();
        portTextField = new javax.swing.JTextField();
        proxyFieldEmptyDialog = new javax.swing.JDialog();
        proxyFieldEmptyPanel = new javax.swing.JPanel();
        proxyFieldEmptyMessageLabel = new javax.swing.JLabel();
        proxyFieldOkButton = new javax.swing.JButton();
        downloadFailedDialog = new javax.swing.JDialog();
        downloadFailedPanel = new javax.swing.JPanel();
        downloadFailedDialogTitle = new javax.swing.JLabel();
        downloadErrorLabel = new javax.swing.JLabel();
        dowloadErrorValueLabel = new javax.swing.JLabel();
        retryButton = new javax.swing.JButton();
        fileLabel = new javax.swing.JLabel();
        fileValueLabel = new javax.swing.JLabel();
        downloadProgessDialog = new javax.swing.JDialog();
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
        addURLDialog = new javax.swing.JDialog();
        addUrlPanel = new javax.swing.JPanel();
        TItle = new javax.swing.JLabel();
        urlLabel = new javax.swing.JLabel();
        urlField = new javax.swing.JTextField();
        downloadButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        choosePathButton = new javax.swing.JButton();
        exitMainWindowDialog = new javax.swing.JDialog();
        messageLabelExit1 = new javax.swing.JLabel();
        messageLabelExit2 = new javax.swing.JLabel();
        yesExitButton = new javax.swing.JButton();
        noExitButton = new javax.swing.JButton();
        networkUnreachableDialog = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        okButtonNetworkUnreachableDialog = new javax.swing.JButton();
        invalidUrlDialog = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        okButtonInvalidUrlDialog = new javax.swing.JButton();
        urlValueLabelInvalidUrlDialog = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        downloadCompletedDialog = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        openFolderButtonDownloadedDialog = new javax.swing.JButton();
        openFileButtonDownloadedDialog = new javax.swing.JButton();
        closeButtonDownloadedButton = new javax.swing.JButton();
        MainPanel = new javax.swing.JPanel();
        AddURLButton = new javax.swing.JButton();
        treeScrollPane = new javax.swing.JScrollPane();
        allDownloadsTree = new javax.swing.JTree();
        tableScrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        menuBar = new javax.swing.JMenuBar();
        settingsMenu = new javax.swing.JMenu();
        proxySettingsMenuItem = new javax.swing.JMenuItem();

        urlEmptyDialog.setMinimumSize(new java.awt.Dimension(453, 179));
        urlEmptyDialog.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        urlEmptyDialog.setResizable(false);

        urlEmptyMessageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        urlEmptyMessageLabel.setText("Please enter the URL of the file to be downloaded");

        okButtonUrlEmptyDialog.setText("OK");
        okButtonUrlEmptyDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonUrlEmptyDialogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout urlEmptyPanelLayout = new javax.swing.GroupLayout(urlEmptyPanel);
        urlEmptyPanel.setLayout(urlEmptyPanelLayout);
        urlEmptyPanelLayout.setHorizontalGroup(
            urlEmptyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(urlEmptyPanelLayout.createSequentialGroup()
                .addGroup(urlEmptyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(urlEmptyPanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(urlEmptyMessageLabel))
                    .addGroup(urlEmptyPanelLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(okButtonUrlEmptyDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        urlEmptyPanelLayout.setVerticalGroup(
            urlEmptyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(urlEmptyPanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(urlEmptyMessageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(okButtonUrlEmptyDialog)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout urlEmptyDialogLayout = new javax.swing.GroupLayout(urlEmptyDialog.getContentPane());
        urlEmptyDialog.getContentPane().setLayout(urlEmptyDialogLayout);
        urlEmptyDialogLayout.setHorizontalGroup(
            urlEmptyDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(urlEmptyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        urlEmptyDialogLayout.setVerticalGroup(
            urlEmptyDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(urlEmptyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        urlEmptyDialog.setLocationRelativeTo(null);

        proxySettingsDialog.setMinimumSize(new java.awt.Dimension(545, 237));
        proxySettingsDialog.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        proxySettingsDialog.setResizable(false);

        proxyDialogTitle.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        proxyDialogTitle.setText("Proxy Settings");

        proxyLabel.setText("Proxy : ");

        portLabel.setText("Port : ");

        authCheckbox.setText("Authentication");

        usernameLabel.setText("Username : ");

        passwordLabel.setText("Password : ");

        proxyDialogCancelButton.setText("Cancel");
        proxyDialogCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proxyDialogCancelButtonActionPerformed(evt);
            }
        });

        proxyDialogOkButton.setText("OK");
        proxyDialogOkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proxyDialogOkButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout proxySettingsDialogLayout = new javax.swing.GroupLayout(proxySettingsDialog.getContentPane());
        proxySettingsDialog.getContentPane().setLayout(proxySettingsDialogLayout);
        proxySettingsDialogLayout.setHorizontalGroup(
            proxySettingsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proxySettingsDialogLayout.createSequentialGroup()
                .addGroup(proxySettingsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(proxySettingsDialogLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(proxySettingsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(authCheckbox)
                            .addGroup(proxySettingsDialogLayout.createSequentialGroup()
                                .addComponent(proxyLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(proxyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(portLabel)
                                .addGap(3, 3, 3)
                                .addComponent(portTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(proxySettingsDialogLayout.createSequentialGroup()
                                .addComponent(usernameLabel)
                                .addGap(3, 3, 3)
                                .addGroup(proxySettingsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(proxyDialogCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(proxySettingsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(proxySettingsDialogLayout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(passwordLabel)
                                        .addGap(2, 2, 2)
                                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(proxySettingsDialogLayout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(proxyDialogOkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(proxySettingsDialogLayout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(proxyDialogTitle)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        proxySettingsDialogLayout.setVerticalGroup(
            proxySettingsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proxySettingsDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(proxyDialogTitle)
                .addGap(18, 18, 18)
                .addGroup(proxySettingsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proxyLabel)
                    .addComponent(proxyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(portLabel)
                    .addComponent(portTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(authCheckbox)
                .addGap(18, 18, 18)
                .addGroup(proxySettingsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(proxySettingsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proxyDialogOkButton)
                    .addComponent(proxyDialogCancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        proxySettingsDialog.setLocationRelativeTo(null);

        proxyFieldEmptyDialog.setMinimumSize(new java.awt.Dimension(536, 169));
        proxyFieldEmptyDialog.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        proxyFieldEmptyDialog.setResizable(false);

        proxyFieldEmptyMessageLabel.setText("Please fill all the mandatory fields !");

        proxyFieldOkButton.setText("OK");
        proxyFieldOkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proxyFieldOkButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout proxyFieldEmptyPanelLayout = new javax.swing.GroupLayout(proxyFieldEmptyPanel);
        proxyFieldEmptyPanel.setLayout(proxyFieldEmptyPanelLayout);
        proxyFieldEmptyPanelLayout.setHorizontalGroup(
            proxyFieldEmptyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proxyFieldEmptyPanelLayout.createSequentialGroup()
                .addGroup(proxyFieldEmptyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(proxyFieldEmptyPanelLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(proxyFieldEmptyMessageLabel))
                    .addGroup(proxyFieldEmptyPanelLayout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(proxyFieldOkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        proxyFieldEmptyPanelLayout.setVerticalGroup(
            proxyFieldEmptyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proxyFieldEmptyPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(proxyFieldEmptyMessageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(proxyFieldOkButton)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout proxyFieldEmptyDialogLayout = new javax.swing.GroupLayout(proxyFieldEmptyDialog.getContentPane());
        proxyFieldEmptyDialog.getContentPane().setLayout(proxyFieldEmptyDialogLayout);
        proxyFieldEmptyDialogLayout.setHorizontalGroup(
            proxyFieldEmptyDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(proxyFieldEmptyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        proxyFieldEmptyDialogLayout.setVerticalGroup(
            proxyFieldEmptyDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(proxyFieldEmptyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        proxyFieldEmptyDialog.setLocationRelativeTo(null);

        downloadFailedDialog.setMinimumSize(new java.awt.Dimension(497, 193));
        downloadFailedDialog.setResizable(false);

        downloadFailedDialogTitle.setText("Uhh...uhh..! Download Failed  :'(");

        downloadErrorLabel.setText("Error : ");

        retryButton.setText("Retry");

        fileLabel.setText("File : ");

        javax.swing.GroupLayout downloadFailedPanelLayout = new javax.swing.GroupLayout(downloadFailedPanel);
        downloadFailedPanel.setLayout(downloadFailedPanelLayout);
        downloadFailedPanelLayout.setHorizontalGroup(
            downloadFailedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(downloadFailedPanelLayout.createSequentialGroup()
                .addGroup(downloadFailedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(downloadFailedPanelLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(downloadFailedDialogTitle))
                    .addGroup(downloadFailedPanelLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(downloadFailedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(downloadFailedPanelLayout.createSequentialGroup()
                                .addComponent(fileLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fileValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(downloadFailedPanelLayout.createSequentialGroup()
                                .addComponent(downloadErrorLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dowloadErrorValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(downloadFailedPanelLayout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(retryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        downloadFailedPanelLayout.setVerticalGroup(
            downloadFailedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(downloadFailedPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(downloadFailedDialogTitle)
                .addGap(18, 18, 18)
                .addGroup(downloadFailedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fileLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fileValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(downloadFailedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(downloadErrorLabel)
                    .addComponent(dowloadErrorValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(retryButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout downloadFailedDialogLayout = new javax.swing.GroupLayout(downloadFailedDialog.getContentPane());
        downloadFailedDialog.getContentPane().setLayout(downloadFailedDialogLayout);
        downloadFailedDialogLayout.setHorizontalGroup(
            downloadFailedDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(downloadFailedPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        downloadFailedDialogLayout.setVerticalGroup(
            downloadFailedDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(downloadFailedPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        downloadFailedDialog.setLocationRelativeTo(null);

        downloadProgessDialog.setMinimumSize(new java.awt.Dimension(528, 226));
        downloadProgessDialog.setResizable(false);

        downloadingTitle.setText("Downloading...");

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
                        .addGap(177, 177, 177)
                        .addComponent(downloadingTitle))
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
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
            .addGroup(downloadProgressPanelLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(pauseResumeButtonDownloading, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(stopButtonDownloading)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        downloadProgressPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {fileLabelDownloading, fileTypeLabelDownloading, sizeLabelDownloading});

        downloadProgressPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pauseResumeButtonDownloading, stopButtonDownloading});

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
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout downloadProgessDialogLayout = new javax.swing.GroupLayout(downloadProgessDialog.getContentPane());
        downloadProgessDialog.getContentPane().setLayout(downloadProgessDialogLayout);
        downloadProgessDialogLayout.setHorizontalGroup(
            downloadProgessDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(downloadProgressPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        downloadProgessDialogLayout.setVerticalGroup(
            downloadProgessDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(downloadProgessDialogLayout.createSequentialGroup()
                .addComponent(downloadProgressPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        downloadCompletedDialog.setLocationRelativeTo(null);

        addURLDialog.setMinimumSize(new java.awt.Dimension(596, 211));
        addURLDialog.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        addURLDialog.setResizable(false);

        TItle.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        TItle.setText("CC Download Manager");

        urlLabel.setText("URL : ");

        downloadButton.setText("Download");
        downloadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");

        jLabel4.setText("Path : ");

        choosePathButton.setText("...");
        choosePathButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choosePathButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addUrlPanelLayout = new javax.swing.GroupLayout(addUrlPanel);
        addUrlPanel.setLayout(addUrlPanelLayout);
        addUrlPanelLayout.setHorizontalGroup(
            addUrlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addUrlPanelLayout.createSequentialGroup()
                .addGroup(addUrlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addUrlPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(addUrlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(urlLabel)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addUrlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(urlField, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(choosePathButton))
                    .addGroup(addUrlPanelLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(TItle))
                    .addGroup(addUrlPanelLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(downloadButton)))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        addUrlPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {downloadButton, jButton2});

        addUrlPanelLayout.setVerticalGroup(
            addUrlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addUrlPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(TItle)
                .addGap(30, 30, 30)
                .addGroup(addUrlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urlLabel)
                    .addComponent(urlField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addUrlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(choosePathButton))
                .addGap(18, 18, 18)
                .addGroup(addUrlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(downloadButton))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout addURLDialogLayout = new javax.swing.GroupLayout(addURLDialog.getContentPane());
        addURLDialog.getContentPane().setLayout(addURLDialogLayout);
        addURLDialogLayout.setHorizontalGroup(
            addURLDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addUrlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        addURLDialogLayout.setVerticalGroup(
            addURLDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addUrlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        addURLDialog.setLocationRelativeTo(null);

        exitMainWindowDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        exitMainWindowDialog.setMinimumSize(new java.awt.Dimension(429, 154));
        exitMainWindowDialog.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        exitMainWindowDialog.setResizable(false);

        messageLabelExit1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        messageLabelExit1.setText("Exiting this window stops all the downloads in progress");

        messageLabelExit2.setText("Do you want to exit?");

        yesExitButton.setText("Yes");
        yesExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesExitButtonActionPerformed(evt);
            }
        });

        noExitButton.setText("No");
        noExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout exitMainWindowDialogLayout = new javax.swing.GroupLayout(exitMainWindowDialog.getContentPane());
        exitMainWindowDialog.getContentPane().setLayout(exitMainWindowDialogLayout);
        exitMainWindowDialogLayout.setHorizontalGroup(
            exitMainWindowDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitMainWindowDialogLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(exitMainWindowDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(messageLabelExit2)
                    .addGroup(exitMainWindowDialogLayout.createSequentialGroup()
                        .addComponent(noExitButton)
                        .addGap(49, 49, 49)
                        .addComponent(yesExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitMainWindowDialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(messageLabelExit1)
                .addGap(25, 25, 25))
        );

        exitMainWindowDialogLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {noExitButton, yesExitButton});

        exitMainWindowDialogLayout.setVerticalGroup(
            exitMainWindowDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitMainWindowDialogLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(messageLabelExit1)
                .addGap(18, 18, 18)
                .addComponent(messageLabelExit2)
                .addGap(18, 18, 18)
                .addGroup(exitMainWindowDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yesExitButton)
                    .addComponent(noExitButton))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        exitMainWindowDialog.setLocationRelativeTo(null);

        networkUnreachableDialog.setMinimumSize(new java.awt.Dimension(432, 154));
        networkUnreachableDialog.setResizable(false);

        jLabel6.setText("Network Unreachable");

        jLabel7.setText("Please check your internet connection and retry");

        okButtonNetworkUnreachableDialog.setText("OK");
        okButtonNetworkUnreachableDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonNetworkUnreachableDialogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(47, 47, 47))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(okButtonNetworkUnreachableDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(okButtonNetworkUnreachableDialog)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout networkUnreachableDialogLayout = new javax.swing.GroupLayout(networkUnreachableDialog.getContentPane());
        networkUnreachableDialog.getContentPane().setLayout(networkUnreachableDialogLayout);
        networkUnreachableDialogLayout.setHorizontalGroup(
            networkUnreachableDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        networkUnreachableDialogLayout.setVerticalGroup(
            networkUnreachableDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        networkUnreachableDialog.setLocationRelativeTo(null);

        invalidUrlDialog.setMinimumSize(new java.awt.Dimension(400, 180));
        invalidUrlDialog.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        invalidUrlDialog.setResizable(false);

        jLabel8.setText("Invalid URL entered");

        jLabel9.setText("Please enter a valid URL and retry");

        okButtonInvalidUrlDialog.setText("OK");
        okButtonInvalidUrlDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonInvalidUrlDialogActionPerformed(evt);
            }
        });

        jLabel10.setText("URL : ");

        javax.swing.GroupLayout invalidUrlDialogLayout = new javax.swing.GroupLayout(invalidUrlDialog.getContentPane());
        invalidUrlDialog.getContentPane().setLayout(invalidUrlDialogLayout);
        invalidUrlDialogLayout.setHorizontalGroup(
            invalidUrlDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invalidUrlDialogLayout.createSequentialGroup()
                .addGroup(invalidUrlDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(invalidUrlDialogLayout.createSequentialGroup()
                        .addContainerGap(28, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(urlValueLabelInvalidUrlDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(invalidUrlDialogLayout.createSequentialGroup()
                        .addGroup(invalidUrlDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(invalidUrlDialogLayout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jLabel8))
                            .addGroup(invalidUrlDialogLayout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(okButtonInvalidUrlDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(invalidUrlDialogLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel9)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        invalidUrlDialogLayout.setVerticalGroup(
            invalidUrlDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invalidUrlDialogLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(invalidUrlDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(urlValueLabelInvalidUrlDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(13, 13, 13)
                .addComponent(okButtonInvalidUrlDialog)
                .addContainerGap())
        );

        invalidUrlDialog.setLocationRelativeTo(null);

        downloadCompletedDialog.setMinimumSize(new java.awt.Dimension(525, 195));
        downloadCompletedDialog.setResizable(false);

        jLabel1.setText("Download Completed !");

        jLabel2.setText("File : ");

        openFolderButtonDownloadedDialog.setText("Open Folder");
        openFolderButtonDownloadedDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFolderButtonDownloadedDialogActionPerformed(evt);
            }
        });

        openFileButtonDownloadedDialog.setText("Open File");
        openFileButtonDownloadedDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileButtonDownloadedDialogActionPerformed(evt);
            }
        });

        closeButtonDownloadedButton.setText("Close");
        closeButtonDownloadedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonDownloadedButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(openFolderButtonDownloadedDialog)
                        .addGap(39, 39, 39)
                        .addComponent(openFileButtonDownloadedDialog)
                        .addGap(50, 50, 50)
                        .addComponent(closeButtonDownloadedButton))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel1)))))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {closeButtonDownloadedButton, openFileButtonDownloadedDialog, openFolderButtonDownloadedDialog});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(openFolderButtonDownloadedDialog)
                    .addComponent(openFileButtonDownloadedDialog)
                    .addComponent(closeButtonDownloadedButton))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout downloadCompletedDialogLayout = new javax.swing.GroupLayout(downloadCompletedDialog.getContentPane());
        downloadCompletedDialog.getContentPane().setLayout(downloadCompletedDialogLayout);
        downloadCompletedDialogLayout.setHorizontalGroup(
            downloadCompletedDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        downloadCompletedDialogLayout.setVerticalGroup(
            downloadCompletedDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        downloadCompletedDialog.setLocationRelativeTo(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setFocusable(false);
        setLocation(new java.awt.Point(450, 250));
        setMaximumSize(new java.awt.Dimension(450, 250));
        setMinimumSize(new java.awt.Dimension(450, 250));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        AddURLButton.setText("Add URL");
        AddURLButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddURLButtonActionPerformed(evt);
            }
        });

        treeScrollPane.setViewportView(allDownloadsTree);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "File Name", "Size", "Status", "Transfer Rate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableScrollPane.setViewportView(table);

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(458, 458, 458))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(treeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AddURLButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddURLButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(treeScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tableScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        settingsMenu.setText("Settings");

        proxySettingsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        proxySettingsMenuItem.setText("Proxy Settings");
        proxySettingsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proxySettingsMenuItemActionPerformed(evt);
            }
        });
        settingsMenu.add(proxySettingsMenuItem);

        menuBar.add(settingsMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void proxyDialogOkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proxyDialogOkButtonActionPerformed

    }//GEN-LAST:event_proxyDialogOkButtonActionPerformed

    private void stopButtonDownloadingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonDownloadingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stopButtonDownloadingActionPerformed

    private void downloadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadButtonActionPerformed
        Thread t = new NewDownloadTask(this);
        t.start();
    }//GEN-LAST:event_downloadButtonActionPerformed

    class NewDownloadTask extends Thread {

        MainFrame mf;

        public NewDownloadTask(MainFrame mf) {
            this.mf = mf;
        }

        public void run() {
            if (!urlField.getText().isEmpty()) {
                //ConnectionManager cm = new ConnectionManager(mf);
                cm.connector();
               //downloadCompletedDialog.show();
            } else {
                urlEmptyDialog.show();
            }
        }
    }

    private void proxySettingsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proxySettingsMenuItemActionPerformed
        ConnectionManager cm = new ConnectionManager();
        cm.proxyFetch();
        proxyTextField.setText(cm.ip);
        portTextField.setText(cm.port + "");
        usernameField.setText(cm.username);
        passwordField.setText(cm.password);
        proxySettingsDialog.show();
    }//GEN-LAST:event_proxySettingsMenuItemActionPerformed

    private void choosePathButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choosePathButtonActionPerformed
        FileChooser fc = new FileChooser();
        fc.show();
    }//GEN-LAST:event_choosePathButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        exitMainWindowDialog.show();
    }//GEN-LAST:event_formWindowClosing

     private void formWindowClosed(java.awt.event.WindowEvent evt) {                                   
        
    }  
    private void noExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noExitButtonActionPerformed
        exitMainWindowDialog.dispose();
    }//GEN-LAST:event_noExitButtonActionPerformed

    private void yesExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_yesExitButtonActionPerformed

    private void okButtonUrlEmptyDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonUrlEmptyDialogActionPerformed
        urlEmptyDialog.dispose();
    }//GEN-LAST:event_okButtonUrlEmptyDialogActionPerformed

    private void proxyDialogCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proxyDialogCancelButtonActionPerformed
        proxySettingsDialog.dispose();
    }//GEN-LAST:event_proxyDialogCancelButtonActionPerformed

    private void proxyFieldOkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proxyFieldOkButtonActionPerformed
        proxyFieldEmptyDialog.dispose();
    }//GEN-LAST:event_proxyFieldOkButtonActionPerformed

    private void okButtonNetworkUnreachableDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonNetworkUnreachableDialogActionPerformed
       networkUnreachableDialog.dispose();
    }//GEN-LAST:event_okButtonNetworkUnreachableDialogActionPerformed

    private void okButtonInvalidUrlDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonInvalidUrlDialogActionPerformed
        invalidUrlDialog.dispose();
    }//GEN-LAST:event_okButtonInvalidUrlDialogActionPerformed

    private void openFolderButtonDownloadedDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFolderButtonDownloadedDialogActionPerformed
        try {
            Desktop.getDesktop().open(new File(cm.downloadDir));
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_openFolderButtonDownloadedDialogActionPerformed

    private void openFileButtonDownloadedDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileButtonDownloadedDialogActionPerformed
        try {
            Desktop.getDesktop().open(new File(cm.saveFilePath));
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_openFileButtonDownloadedDialogActionPerformed

    private void closeButtonDownloadedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonDownloadedButtonActionPerformed
        downloadCompletedDialog.dispose();
    }//GEN-LAST:event_closeButtonDownloadedButtonActionPerformed

    private void AddURLButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddURLButtonActionPerformed
        addURLDialog.show();
    }//GEN-LAST:event_AddURLButtonActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddURLButton;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel TItle;
    public javax.swing.JDialog addURLDialog;
    private javax.swing.JPanel addUrlPanel;
    private javax.swing.JTree allDownloadsTree;
    public javax.swing.JCheckBox authCheckbox;
    private javax.swing.JButton choosePathButton;
    public javax.swing.JButton closeButtonDownloadedButton;
    private javax.swing.JLabel dowloadErrorValueLabel;
    private javax.swing.JButton downloadButton;
    public javax.swing.JDialog downloadCompletedDialog;
    private javax.swing.JLabel downloadErrorLabel;
    public javax.swing.JDialog downloadFailedDialog;
    private javax.swing.JLabel downloadFailedDialogTitle;
    private javax.swing.JPanel downloadFailedPanel;
    public javax.swing.JDialog downloadProgessDialog;
    public javax.swing.JPanel downloadProgressPanel;
    public javax.swing.JLabel downloadedLabelDownloading;
    public javax.swing.JLabel downloadedValueLabelDownloading;
    public javax.swing.JLabel downloadingTitle;
    public javax.swing.JDialog exitMainWindowDialog;
    private javax.swing.JLabel fileLabel;
    public javax.swing.JLabel fileLabelDownloading;
    public javax.swing.JLabel fileTypeLabelDownloading;
    public javax.swing.JLabel fileTypeValueLabelDownloading;
    private javax.swing.JLabel fileValueLabel;
    public javax.swing.JLabel filenameLabelDownloading;
    private javax.swing.Box.Filler filler1;
    public javax.swing.JDialog invalidUrlDialog;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel messageLabelExit1;
    private javax.swing.JLabel messageLabelExit2;
    public javax.swing.JDialog networkUnreachableDialog;
    private javax.swing.JButton noExitButton;
    private javax.swing.JButton okButtonInvalidUrlDialog;
    private javax.swing.JButton okButtonNetworkUnreachableDialog;
    private javax.swing.JButton okButtonUrlEmptyDialog;
    public javax.swing.JButton openFileButtonDownloadedDialog;
    public javax.swing.JButton openFolderButtonDownloadedDialog;
    public javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    public javax.swing.JButton pauseResumeButtonDownloading;
    private javax.swing.JLabel portLabel;
    public javax.swing.JTextField portTextField;
    public javax.swing.JProgressBar progressBarDownloading;
    private javax.swing.JButton proxyDialogCancelButton;
    private javax.swing.JButton proxyDialogOkButton;
    private javax.swing.JLabel proxyDialogTitle;
    public javax.swing.JDialog proxyFieldEmptyDialog;
    private javax.swing.JLabel proxyFieldEmptyMessageLabel;
    private javax.swing.JPanel proxyFieldEmptyPanel;
    private javax.swing.JButton proxyFieldOkButton;
    private javax.swing.JLabel proxyLabel;
    public javax.swing.JDialog proxySettingsDialog;
    private javax.swing.JMenuItem proxySettingsMenuItem;
    public javax.swing.JTextField proxyTextField;
    public javax.swing.JLabel resumableLabelDownloading;
    public javax.swing.JLabel resumableValueLabelDownloading;
    private javax.swing.JButton retryButton;
    private javax.swing.JSeparator separator;
    private javax.swing.JMenu settingsMenu;
    public javax.swing.JLabel sizeLabelDownloading;
    public javax.swing.JLabel sizeValueDownloading;
    public javax.swing.JLabel speedLabelDownloading;
    public javax.swing.JLabel speedValueLabelDownloading;
    public javax.swing.JButton stopButtonDownloading;
    private javax.swing.JTable table;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JScrollPane treeScrollPane;
    public javax.swing.JDialog urlEmptyDialog;
    private javax.swing.JLabel urlEmptyMessageLabel;
    private javax.swing.JPanel urlEmptyPanel;
    public javax.swing.JTextField urlField;
    private javax.swing.JLabel urlLabel;
    public javax.swing.JLabel urlValueLabelInvalidUrlDialog;
    public javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JButton yesExitButton;
    // End of variables declaration//GEN-END:variables
}

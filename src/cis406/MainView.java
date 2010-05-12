/*
 * CIS406View.java
 */
package cis406;

import org.jdesktop.application.Action;
import org.jdesktop.application.ResourceMap;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import org.jdesktop.application.TaskMonitor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 * The application's main frame.
 */
public class MainView extends FrameView {

    private int activeTabIndex;

    public MainView(SingleFrameApplication app) {
        super(app);

        initComponents();

        activeTabIndex = mainTabbedPane.getSelectedIndex();

        // status bar initialization - message timeout, idle icon and busy animation, etc
        ResourceMap resourceMap = getResourceMap();
        int messageTimeout = resourceMap.getInteger("StatusBar.messageTimeout");
        messageTimer = new Timer(messageTimeout, new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                statusMessageLabel.setText("");
            }
        });
        messageTimer.setRepeats(false);
        int busyAnimationRate = resourceMap.getInteger("StatusBar.busyAnimationRate");
        for (int i = 0; i < busyIcons.length; i++) {
            busyIcons[i] = resourceMap.getIcon("StatusBar.busyIcons[" + i + "]");
        }
        busyIconTimer = new Timer(busyAnimationRate, new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                busyIconIndex = (busyIconIndex + 1) % busyIcons.length;
                statusAnimationLabel.setIcon(busyIcons[busyIconIndex]);
            }
        });
        idleIcon = resourceMap.getIcon("StatusBar.idleIcon");
        statusAnimationLabel.setIcon(idleIcon);
        progressBar.setVisible(false);

        // connecting action tasks to status bar via TaskMonitor
        TaskMonitor taskMonitor = new TaskMonitor(getApplication().getContext());
        taskMonitor.addPropertyChangeListener(new java.beans.PropertyChangeListener() {

            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                String propertyName = evt.getPropertyName();
                if ("started".equals(propertyName)) {
                    if (!busyIconTimer.isRunning()) {
                        statusAnimationLabel.setIcon(busyIcons[0]);
                        busyIconIndex = 0;
                        busyIconTimer.start();
                    }
                    progressBar.setVisible(true);
                    progressBar.setIndeterminate(true);
                } else if ("done".equals(propertyName)) {
                    busyIconTimer.stop();
                    statusAnimationLabel.setIcon(idleIcon);
                    progressBar.setVisible(false);
                    progressBar.setValue(0);
                } else if ("message".equals(propertyName)) {
                    String text = (String) (evt.getNewValue());
                    statusMessageLabel.setText((text == null) ? "" : text);
                    messageTimer.restart();
                } else if ("progress".equals(propertyName)) {
                    int value = (Integer) (evt.getNewValue());
                    progressBar.setVisible(true);
                    progressBar.setIndeterminate(false);
                    progressBar.setValue(value);
                }
            }
        });

    }

    @Action
    public void showAboutBox() {
        if (aboutBox == null) {
            JFrame mainFrame = MainApp.getApplication().getMainFrame();
            aboutBox = new AboutBox(mainFrame);
            aboutBox.setLocationRelativeTo(mainFrame);
        }
        MainApp.getApplication().show(aboutBox);
    }

    @Action
    public void showSettingsBox() {
        if (settingsBox == null) {
            JFrame mainFrame = MainApp.getApplication().getMainFrame();
            settingsBox = new SettingsBox(mainFrame, true);
            settingsBox.setLocationRelativeTo(mainFrame);
        }
        MainApp.getApplication().show(settingsBox);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        mainToolBar = new javax.swing.JToolBar();
        newButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        formButton = new javax.swing.JToggleButton();
        reportButton = new javax.swing.JToggleButton();
        mainTabbedPane = new javax.swing.JTabbedPane();
        internshipPanel1 = new cis406.InternshipPanel();
        contactPanel1 = new cis406.ContactPanel();
        correspondence1 = new cis406.CorrespondencePanel();
        securityLogPanel1 = new cis406.SecurityLogPanel();
        userPanel1 = new cis406.UserPanel();
        studentPanel1 = new cis406.StudentPanel();
        menuBar = new javax.swing.JMenuBar();
        javax.swing.JMenu fileMenu = new javax.swing.JMenu();
        settingsMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        javax.swing.JMenuItem exitMenuItem = new javax.swing.JMenuItem();
        javax.swing.JMenu helpMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem aboutMenuItem = new javax.swing.JMenuItem();
        statusPanel = new javax.swing.JPanel();
        javax.swing.JSeparator statusPanelSeparator = new javax.swing.JSeparator();
        statusMessageLabel = new javax.swing.JLabel();
        statusAnimationLabel = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        activeViewButtonGroup = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();

        mainPanel.setName("mainPanel"); // NOI18N

        mainToolBar.setRollover(true);
        mainToolBar.setName("mainToolBar"); // NOI18N

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(cis406.MainApp.class).getContext().getActionMap(MainView.class, this);
        newButton.setAction(actionMap.get("clickNew")); // NOI18N
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(cis406.MainApp.class).getContext().getResourceMap(MainView.class);
        newButton.setIcon(resourceMap.getIcon("NewButton.icon")); // NOI18N
        newButton.setText(resourceMap.getString("NewButton.text")); // NOI18N
        newButton.setFocusable(false);
        newButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        newButton.setName("NewButton"); // NOI18N
        newButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mainToolBar.add(newButton);

        saveButton.setAction(actionMap.get("clickSave")); // NOI18N
        saveButton.setIcon(resourceMap.getIcon("SaveButton.icon")); // NOI18N
        saveButton.setText(resourceMap.getString("SaveButton.text")); // NOI18N
        saveButton.setFocusable(false);
        saveButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        saveButton.setName("SaveButton"); // NOI18N
        saveButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mainToolBar.add(saveButton);

        loadButton.setAction(actionMap.get("clickLoad")); // NOI18N
        loadButton.setIcon(resourceMap.getIcon("LoadButton.icon")); // NOI18N
        loadButton.setText(resourceMap.getString("LoadButton.text")); // NOI18N
        loadButton.setFocusable(false);
        loadButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        loadButton.setName("LoadButton"); // NOI18N
        loadButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mainToolBar.add(loadButton);

        deleteButton.setAction(actionMap.get("clickDelete")); // NOI18N
        deleteButton.setIcon(resourceMap.getIcon("DeleteButton.icon")); // NOI18N
        deleteButton.setText(resourceMap.getString("DeleteButton.text")); // NOI18N
        deleteButton.setFocusable(false);
        deleteButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        deleteButton.setName("DeleteButton"); // NOI18N
        deleteButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mainToolBar.add(deleteButton);

        clearButton.setAction(actionMap.get("clickClear")); // NOI18N
        clearButton.setIcon(resourceMap.getIcon("ClearButton.icon")); // NOI18N
        clearButton.setText(resourceMap.getString("ClearButton.text")); // NOI18N
        clearButton.setFocusable(false);
        clearButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        clearButton.setName("ClearButton"); // NOI18N
        clearButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mainToolBar.add(clearButton);

        cancelButton.setAction(actionMap.get("clickCancel")); // NOI18N
        cancelButton.setIcon(resourceMap.getIcon("cancelButton.icon")); // NOI18N
        cancelButton.setText(resourceMap.getString("cancelButton.text")); // NOI18N
        cancelButton.setFocusable(false);
        cancelButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cancelButton.setName("cancelButton"); // NOI18N
        cancelButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mainToolBar.add(cancelButton);

        jSeparator2.setName("jSeparator2"); // NOI18N
        mainToolBar.add(jSeparator2);

        formButton.setAction(actionMap.get("clickForm")); // NOI18N
        activeViewButtonGroup.add(formButton);
        formButton.setIcon(resourceMap.getIcon("formButton.icon")); // NOI18N
        formButton.setText(resourceMap.getString("formButton.text")); // NOI18N
        formButton.setActionCommand(resourceMap.getString("formButton.actionCommand")); // NOI18N
        formButton.setFocusable(false);
        formButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        formButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        formButton.setName("formButton"); // NOI18N
        formButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mainToolBar.add(formButton);

        reportButton.setAction(actionMap.get("clickReport")); // NOI18N
        activeViewButtonGroup.add(reportButton);
        reportButton.setIcon(resourceMap.getIcon("reportButton.icon")); // NOI18N
        reportButton.setSelected(true);
        reportButton.setText(resourceMap.getString("reportButton.text")); // NOI18N
        reportButton.setActionCommand(resourceMap.getString("reportButton.actionCommand")); // NOI18N
        reportButton.setFocusable(false);
        reportButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        reportButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        reportButton.setName("reportButton"); // NOI18N
        reportButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mainToolBar.add(reportButton);

        mainTabbedPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mainTabbedPane.setName("jTabbedPane"); // NOI18N
        mainTabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mainTabbedPaneStateChanged(evt);
            }
        });

        internshipPanel1.setName("internshipPanel1"); // NOI18N
        mainTabbedPane.addTab(resourceMap.getString("internshipPanel1.TabConstraints.tabTitle"), internshipPanel1); // NOI18N

        contactPanel1.setName("contactPanel1"); // NOI18N
        mainTabbedPane.addTab(resourceMap.getString("contactPanel1.TabConstraints.tabTitle"), contactPanel1); // NOI18N

        correspondence1.setName("correspondence1"); // NOI18N
        mainTabbedPane.addTab(resourceMap.getString("correspondence1.TabConstraints.tabTitle"), correspondence1); // NOI18N

        securityLogPanel1.setName("securityLogPanel1"); // NOI18N
        mainTabbedPane.addTab(resourceMap.getString("securityLogPanel1.TabConstraints.tabTitle"), securityLogPanel1); // NOI18N

        userPanel1.setName("userPanel1"); // NOI18N
        mainTabbedPane.addTab(resourceMap.getString("userPanel1.TabConstraints.tabTitle"), userPanel1); // NOI18N

        studentPanel1.setName("studentPanel1"); // NOI18N
        mainTabbedPane.addTab(resourceMap.getString("studentPanel1.TabConstraints.tabTitle"), studentPanel1); // NOI18N

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(mainToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(mainToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainTabbedPane.getAccessibleContext().setAccessibleName(resourceMap.getString("jTabbedPane.AccessibleContext.accessibleName")); // NOI18N

        menuBar.setName("menuBar"); // NOI18N

        fileMenu.setText(resourceMap.getString("fileMenu.text")); // NOI18N
        fileMenu.setName("fileMenu"); // NOI18N

        settingsMenuItem.setAction(actionMap.get("showSettingsBox")); // NOI18N
        settingsMenuItem.setText(resourceMap.getString("settingsMenuItem.text")); // NOI18N
        settingsMenuItem.setName("settingsMenuItem"); // NOI18N
        fileMenu.add(settingsMenuItem);

        jSeparator1.setName("jSeparator1"); // NOI18N
        fileMenu.add(jSeparator1);

        exitMenuItem.setAction(actionMap.get("quit")); // NOI18N
        exitMenuItem.setName("exitMenuItem"); // NOI18N
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        helpMenu.setText(resourceMap.getString("helpMenu.text")); // NOI18N
        helpMenu.setName("helpMenu"); // NOI18N

        aboutMenuItem.setAction(actionMap.get("showAboutBox")); // NOI18N
        aboutMenuItem.setName("aboutMenuItem"); // NOI18N
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        statusPanel.setName("statusPanel"); // NOI18N

        statusPanelSeparator.setName("statusPanelSeparator"); // NOI18N

        statusMessageLabel.setName("statusMessageLabel"); // NOI18N

        statusAnimationLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        statusAnimationLabel.setName("statusAnimationLabel"); // NOI18N

        progressBar.setName("progressBar"); // NOI18N

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statusPanelSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statusMessageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 536, Short.MAX_VALUE)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusAnimationLabel)
                .addContainerGap())
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addComponent(statusPanelSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusMessageLabel)
                    .addComponent(statusAnimationLabel)
                    .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );

        jDialog1.setName("jDialog1"); // NOI18N

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setComponent(mainPanel);
        setMenuBar(menuBar);
        setStatusBar(statusPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void mainTabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mainTabbedPaneStateChanged
        if (activeTabIndex != mainTabbedPane.getSelectedIndex()) {
            ((CisPanel) mainTabbedPane.getComponentAt(activeTabIndex)).switchAway();
            activeTabIndex = mainTabbedPane.getSelectedIndex();
            String actionCommand = activeViewButtonGroup.getSelection().getActionCommand();
            ((CisPanel) mainTabbedPane.getSelectedComponent()).switchTo(actionCommand);

        }
    }//GEN-LAST:event_mainTabbedPaneStateChanged

    @Action
    public void clickNew() {
        changeButtons("Form");
        ((CisPanel) mainTabbedPane.getSelectedComponent()).clickNew();
    }

    @Action
    public void clickSave() {
        changeButtons("Report");
        ((CisPanel) mainTabbedPane.getSelectedComponent()).clickSave();
    }

    @Action
    public void clickLoad() {
        changeButtons("Form");
        ((CisPanel) mainTabbedPane.getSelectedComponent()).clickLoad();
    }

    @Action
    public void clickDelete() {
        ((CisPanel) mainTabbedPane.getSelectedComponent()).clickDelete();
    }

    @Action
    public void clickClear() {
        ((CisPanel) mainTabbedPane.getSelectedComponent()).clickClear();
    }

    @Action
    public void clickCancel() {
        changeButtons("Report");
    }

    @Action
    public void clickForm() {
        changeButtons("Form");
        ((CisPanel) mainTabbedPane.getSelectedComponent()).clickForm();
    }

    @Action
    public void clickReport() {
        changeButtons("Report");
        ((CisPanel) mainTabbedPane.getSelectedComponent()).clickReport();
    }


    public void changeButtons(String mode) {
        if (mode.equalsIgnoreCase("Form")) {
            newButton.setEnabled(false);
            saveButton.setEnabled(true);
            loadButton.setEnabled(false);
            deleteButton.setEnabled(false);
            clearButton.setEnabled(true);
            cancelButton.setEnabled(true);
        } else {
            newButton.setEnabled(true);
            saveButton.setEnabled(false);
            loadButton.setEnabled(true);
            deleteButton.setEnabled(true);
            clearButton.setEnabled(false);
            cancelButton.setEnabled(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup activeViewButtonGroup;
    private javax.swing.JButton cancelButton;
    public javax.swing.JButton clearButton;
    private cis406.ContactPanel contactPanel1;
    private cis406.CorrespondencePanel correspondence1;
    public javax.swing.JButton deleteButton;
    private javax.swing.JToggleButton formButton;
    private cis406.InternshipPanel internshipPanel1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    public javax.swing.JButton loadButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTabbedPane mainTabbedPane;
    private javax.swing.JToolBar mainToolBar;
    private javax.swing.JMenuBar menuBar;
    public javax.swing.JButton newButton;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JToggleButton reportButton;
    public javax.swing.JButton saveButton;
    private cis406.SecurityLogPanel securityLogPanel1;
    private javax.swing.JMenuItem settingsMenuItem;
    private javax.swing.JLabel statusAnimationLabel;
    private javax.swing.JLabel statusMessageLabel;
    private javax.swing.JPanel statusPanel;
    private cis406.StudentPanel studentPanel1;
    private cis406.UserPanel userPanel1;
    // End of variables declaration//GEN-END:variables
    private final Timer messageTimer;
    private final Timer busyIconTimer;
    private final Icon idleIcon;
    private final Icon[] busyIcons = new Icon[15];
    private int busyIconIndex = 0;
    private JDialog aboutBox;
    private JDialog settingsBox;
}

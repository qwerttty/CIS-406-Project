/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CompanyPanel.java
 *
 * Created on May 6, 2010, 12:25:07 AM
 */

package cis406;

import cis406.CisPanel;

/**
 *
 * @author Mark
 */
public class CompanyPanel extends javax.swing.JPanel implements CisPanel {

    /** Creates new form CompanyPanel */
    public CompanyPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabCompany = new javax.swing.JTabbedPane();
        externalCompanyPanel1 = new cis406.ExternalCompanyPanel();
        industryPanel1 = new cis406.IndustryPanel();

        setName("Form"); // NOI18N

        tabCompany.setName("tabCompany"); // NOI18N

        externalCompanyPanel1.setName("externalCompanyPanel1"); // NOI18N
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(cis406.MainApp.class).getContext().getResourceMap(CompanyPanel.class);
        tabCompany.addTab(resourceMap.getString("externalCompanyPanel1.TabConstraints.tabTitle"), externalCompanyPanel1); // NOI18N

        industryPanel1.setName("industryPanel1"); // NOI18N
        tabCompany.addTab(resourceMap.getString("industryPanel1.TabConstraints.tabTitle"), industryPanel1); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabCompany)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabCompany, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private cis406.ExternalCompanyPanel externalCompanyPanel1;
    private cis406.IndustryPanel industryPanel1;
    private javax.swing.JTabbedPane tabCompany;
    // End of variables declaration//GEN-END:variables

    public void clickNew() {
        ((CisPanel)tabCompany.getSelectedComponent()).clickNew();
    }
    public void clickSave() {
        ((CisPanel)tabCompany.getSelectedComponent()).clickSave();
    }
    public void clickLoad() {
        ((CisPanel)tabCompany.getSelectedComponent()).clickLoad();
    }
    public void clickDelete() {
        ((CisPanel)tabCompany.getSelectedComponent()).clickDelete();
    }
    public void clickClear() {
        ((CisPanel)tabCompany.getSelectedComponent()).clickClear();
    }
    public void clickForm() {
        ((CisPanel)tabCompany.getSelectedComponent()).clickForm();
    }
    public void clickReport() {
        ((CisPanel)tabCompany.getSelectedComponent()).clickReport();
    }
    public void switchTo(javax.swing.ButtonGroup activeView) {
    }
    public void switchAway() {
        ((CisPanel)tabCompany.getSelectedComponent()).switchAway();
    }
}

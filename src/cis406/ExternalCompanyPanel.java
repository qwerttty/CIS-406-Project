/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AddCompany.java
 *
 * Created on May 4, 2010, 11:54:10 AM
 */

package cis406;

import cis406.CisPanel;
import cis406.CisPanel;

/**
 *
 * @author Mark Lenser
 */
public class ExternalCompanyPanel extends javax.swing.JPanel implements CisPanel {

    /** Creates new form AddCompany */
    public ExternalCompanyPanel() {
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

        lblCompany = new javax.swing.JLabel();
        txtCompany = new javax.swing.JTextField();
        lblIndustry = new javax.swing.JLabel();
        cboIndustry = new javax.swing.JComboBox();
        txtPhoneExt = new javax.swing.JTextField();
        lblExt = new javax.swing.JLabel();

        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(cis406.MainApp.class).getContext().getResourceMap(ExternalCompanyPanel.class);
        lblCompany.setText(resourceMap.getString("lblCompany.text")); // NOI18N
        lblCompany.setName("lblCompany"); // NOI18N

        txtCompany.setName("txtCompany"); // NOI18N

        lblIndustry.setText(resourceMap.getString("lblIndustry.text")); // NOI18N
        lblIndustry.setName("lblIndustry"); // NOI18N

        cboIndustry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cal Poly Pomona", "Telecommnications", "Web Development", "Forensics", "Security" }));
        cboIndustry.setName("cboIndustry"); // NOI18N
        cboIndustry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboIndustryActionPerformed(evt);
            }
        });

        txtPhoneExt.setText(resourceMap.getString("txtPhoneExt.text")); // NOI18N
        txtPhoneExt.setName("txtPhoneExt"); // NOI18N

        lblExt.setText(resourceMap.getString("lblExt.text")); // NOI18N
        lblExt.setName("lblExt"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIndustry, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblExt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCompany, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboIndustry, 0, 143, Short.MAX_VALUE)
                    .addComponent(txtCompany, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(txtPhoneExt, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIndustry)
                    .addComponent(cboIndustry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCompany)
                    .addComponent(txtCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblExt)
                    .addComponent(txtPhoneExt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboIndustryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboIndustryActionPerformed
        int industry = cboIndustry.getSelectedIndex();
        if(industry == 0) {
            txtPhoneExt.setEnabled(true);
            lblCompany.setText("Division Name:");
        }
        else {
            txtPhoneExt.setEnabled(false);
            lblCompany.setText("Company Name:");
        }
    }//GEN-LAST:event_cboIndustryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboIndustry;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblExt;
    private javax.swing.JLabel lblIndustry;
    private javax.swing.JTextField txtCompany;
    private javax.swing.JTextField txtPhoneExt;
    // End of variables declaration//GEN-END:variables

    public void clickNew() {
    }
    public void clickSave() {
        ExternalCompany record = new ExternalCompany();
        record.setIndustry(cboIndustry.getSelectedIndex());
        record.setName(txtCompany.getText());
        record.setExt(txtPhoneExt.getText());
        record.save();
    }
    public void clickLoad() {
    }
    public void clickDelete() {
    }
    public void clickClear() {
        txtCompany.setText("");
        cboIndustry.setSelectedIndex(0);
        txtPhoneExt.setText("");
    }
    public void clickForm() {
    }
    public void clickReport() {
    }
    public void switchTo(javax.swing.ButtonGroup activeView) {
    }
    public void switchAway() {
    }
}

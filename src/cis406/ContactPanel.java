/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AddContact.java
 *
 * Created on May 4, 2010, 11:59:35 AM
 */

package cis406;

import cis406.CisPanel;

/**
 *
 * @author Mark Lenser
 */
public class ContactPanel extends javax.swing.JPanel implements CisPanel {

    /** Creates new form AddContact */
    public ContactPanel() {
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

        txtFName = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        cboCompany = new javax.swing.JComboBox();
        txtStreet = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        cboState = new javax.swing.JComboBox();
        txtZip = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPhoneArea = new javax.swing.JTextField();
        txtPhoneFirst = new javax.swing.JTextField();
        txtPhoneLast = new javax.swing.JTextField();
        txtPosition = new javax.swing.JTextField();
        cboCommMethod = new javax.swing.JComboBox();
        scpDescription = new javax.swing.JScrollPane();
        txaDescription = new javax.swing.JTextArea();
        txtPhoneDash1 = new javax.swing.JLabel();
        lblPhoneRightParenthesis1 = new javax.swing.JLabel();
        txtPhoneLeftParenthesis1 = new javax.swing.JLabel();
        lblCommMethod1 = new javax.swing.JLabel();
        lblDescription1 = new javax.swing.JLabel();
        lblPosition1 = new javax.swing.JLabel();
        lblPhone1 = new javax.swing.JLabel();
        lblEmail1 = new javax.swing.JLabel();
        lblState1 = new javax.swing.JLabel();
        lblCity1 = new javax.swing.JLabel();
        lblZip1 = new javax.swing.JLabel();
        lblStreet1 = new javax.swing.JLabel();
        lblCompanySelect1 = new javax.swing.JLabel();
        lblFName = new javax.swing.JLabel();
        lblLName1 = new javax.swing.JLabel();

        setName("Form"); // NOI18N

        txtFName.setName("txtFName"); // NOI18N

        txtLName.setName("txtLName"); // NOI18N

        cboCompany.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Edison", "JPL", "Adobe" }));
        cboCompany.setName("cboCompany"); // NOI18N

        txtStreet.setName("txtStreet"); // NOI18N

        txtCity.setName("txtCity"); // NOI18N

        cboState.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "CA", "OR", "NV", "etc" }));
        cboState.setName("cboState"); // NOI18N

        txtZip.setName("txtZip"); // NOI18N

        txtEmail.setName("txtEmail"); // NOI18N

        txtPhoneArea.setName("txtPhoneArea"); // NOI18N

        txtPhoneFirst.setMaximumSize(new java.awt.Dimension(3, 3));
        txtPhoneFirst.setName("txtPhoneFirst"); // NOI18N

        txtPhoneLast.setName("txtPhoneLast"); // NOI18N

        txtPosition.setName("txtPosition"); // NOI18N

        cboCommMethod.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Email", "Phone" }));
        cboCommMethod.setName("cboCommMethod"); // NOI18N

        scpDescription.setName("scpDescription"); // NOI18N

        txaDescription.setColumns(20);
        txaDescription.setRows(5);
        txaDescription.setName("txaDescription"); // NOI18N
        scpDescription.setViewportView(txaDescription);

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(cis406.MainApp.class).getContext().getResourceMap(ContactPanel.class);
        txtPhoneDash1.setText(resourceMap.getString("txtPhoneDash1.text")); // NOI18N
        txtPhoneDash1.setName("txtPhoneDash1"); // NOI18N

        lblPhoneRightParenthesis1.setText(resourceMap.getString("lblPhoneRightParenthesis1.text")); // NOI18N
        lblPhoneRightParenthesis1.setName("lblPhoneRightParenthesis1"); // NOI18N

        txtPhoneLeftParenthesis1.setText(resourceMap.getString("txtPhoneLeftParenthesis1.text")); // NOI18N
        txtPhoneLeftParenthesis1.setName("txtPhoneLeftParenthesis1"); // NOI18N

        lblCommMethod1.setText(resourceMap.getString("lblCommMethod1.text")); // NOI18N
        lblCommMethod1.setName("lblCommMethod1"); // NOI18N

        lblDescription1.setText(resourceMap.getString("lblDescription1.text")); // NOI18N
        lblDescription1.setName("lblDescription1"); // NOI18N

        lblPosition1.setText(resourceMap.getString("lblPosition1.text")); // NOI18N
        lblPosition1.setName("lblPosition1"); // NOI18N

        lblPhone1.setText(resourceMap.getString("lblPhone1.text")); // NOI18N
        lblPhone1.setName("lblPhone1"); // NOI18N

        lblEmail1.setText(resourceMap.getString("lblEmail1.text")); // NOI18N
        lblEmail1.setName("lblEmail1"); // NOI18N

        lblState1.setText(resourceMap.getString("lblState1.text")); // NOI18N
        lblState1.setName("lblState1"); // NOI18N

        lblCity1.setText(resourceMap.getString("lblCity1.text")); // NOI18N
        lblCity1.setName("lblCity1"); // NOI18N

        lblZip1.setText(resourceMap.getString("lblZip1.text")); // NOI18N
        lblZip1.setName("lblZip1"); // NOI18N

        lblStreet1.setText(resourceMap.getString("lblStreet1.text")); // NOI18N
        lblStreet1.setName("lblStreet1"); // NOI18N

        lblCompanySelect1.setText(resourceMap.getString("lblCompanySelect1.text")); // NOI18N
        lblCompanySelect1.setName("lblCompanySelect1"); // NOI18N

        lblFName.setText(resourceMap.getString("lblFName.text")); // NOI18N
        lblFName.setName("lblFName"); // NOI18N

        lblLName1.setText(resourceMap.getString("lblLName1.text")); // NOI18N
        lblLName1.setName("lblLName1"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDescription1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scpDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCommMethod1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboCommMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFName)
                            .addComponent(lblCompanySelect1)
                            .addComponent(lblCity1)
                            .addComponent(lblState1)
                            .addComponent(lblPhone1)
                            .addComponent(lblStreet1)
                            .addComponent(lblZip1)
                            .addComponent(lblEmail1)
                            .addComponent(lblPosition1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboState, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(lblLName1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPhoneLeftParenthesis1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPhoneArea, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPhoneRightParenthesis1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPhoneFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPhoneDash1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPhoneLast, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cboCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(84, 84, 84)
                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(208, 208, 208)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFName)
                    .addComponent(lblLName1)
                    .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCompanySelect1)
                    .addComponent(cboCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStreet1)
                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZip1)
                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity1)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblState1)
                    .addComponent(cboState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail1)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhoneLeftParenthesis1)
                    .addComponent(lblPhoneRightParenthesis1)
                    .addComponent(lblPhone1)
                    .addComponent(txtPhoneDash1)
                    .addComponent(txtPhoneArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhoneFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhoneLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPosition1)
                    .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommMethod1)
                    .addComponent(cboCommMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescription1)
                    .addComponent(scpDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(350, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboCommMethod;
    private javax.swing.JComboBox cboCompany;
    private javax.swing.JComboBox cboState;
    private javax.swing.JLabel lblCity1;
    private javax.swing.JLabel lblCommMethod1;
    private javax.swing.JLabel lblCompanySelect1;
    private javax.swing.JLabel lblDescription1;
    private javax.swing.JLabel lblEmail1;
    private javax.swing.JLabel lblFName;
    private javax.swing.JLabel lblLName1;
    private javax.swing.JLabel lblPhone1;
    private javax.swing.JLabel lblPhoneRightParenthesis1;
    private javax.swing.JLabel lblPosition1;
    private javax.swing.JLabel lblState1;
    private javax.swing.JLabel lblStreet1;
    private javax.swing.JLabel lblZip1;
    private javax.swing.JScrollPane scpDescription;
    private javax.swing.JTextArea txaDescription;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtPhoneArea;
    private javax.swing.JLabel txtPhoneDash1;
    private javax.swing.JTextField txtPhoneFirst;
    private javax.swing.JTextField txtPhoneLast;
    private javax.swing.JLabel txtPhoneLeftParenthesis1;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables

    public void clickNew() {
    }
    public void clickSave() {
        Contact record = new Contact();
        record.setFname(txtFName.getText());
        record.setLname(txtLName.getText());
        record.setCompany_id(cboCompany.getSelectedIndex());
        record.setStreet(txtStreet.getText());
        record.setZip(Integer.parseInt(txtZip.getText()));
        record.setCity(txtCity.getText());
        record.setState(cboState.getSelectedIndex());
        record.setEmail(txtEmail.getText());
        record.setPhone(Integer.parseInt(txtPhoneArea.getText()), Integer.parseInt(txtPhoneFirst.getText()), Integer.parseInt(txtPhoneLast.getText()));
        record.setPosition(txtPosition.getText());
        record.setComm_method(cboCommMethod.getSelectedIndex());
        record.setDescription(txaDescription.getText());
        record.save();
    }
    public void clickLoad() {
    }
    public void clickDelete() {
    }
    public void clickClear() {
        txtFName.setText("");
        txtLName.setText("");
        cboCompany.setSelectedIndex(0);
        txtStreet.setText("");
        txtZip.setText("");
        txtCity.setText("");
        cboState.setSelectedIndex(0);
        txtEmail.setText("");
        txtPhoneArea.setText("");
        txtPhoneFirst.setText("");
        txtPhoneLast.setText("");
        txtPosition.setText("");
        cboCommMethod.setSelectedIndex(0);
        txaDescription.setText("");
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


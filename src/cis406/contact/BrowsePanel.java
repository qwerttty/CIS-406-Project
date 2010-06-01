package cis406.contact;

import cis406.TableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Mark Lenser
 */
public class BrowsePanel extends javax.swing.JPanel {

    /** Creates new form AddContact */
    public BrowsePanel() {
        initComponents();
        //loadTable();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblReport = new javax.swing.JTable();

        setName("frmContactBrowse"); // NOI18N
        setPreferredSize(new java.awt.Dimension(681, 400));

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        tblReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblReport.setName("tblReport"); // NOI18N
        jScrollPane1.setViewportView(tblReport);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReport;
    // End of variables declaration//GEN-END:variables

    public void loadTable() {
        tblReport.setModel(Contact.generateTable());
    }
    public void delete() {
        int rowId = getSelectedRow();
        if (Contact.delete(rowId)) {
            JOptionPane.showMessageDialog(null, "Contact #" + rowId + " was deleted");
            loadTable();
        } else {
            JOptionPane.showMessageDialog(null, "Contact #" + rowId + " could not be found");
        }
    }
    /**
     * Returns 0 if no SQL row found
     * @return
     */
    public int getSelectedRow() {
        int row = tblReport.getSelectedRow();
        if (row != -1) {
            return ((TableModel) tblReport.getModel()).getRowId(row);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row first");
            return 0;
        }
    }
}
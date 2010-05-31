/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * BrowsePanel.java
 *
 * Created on May 10, 2010, 2:47:41 PM
 */
package cis406.internship;

import cis406.TableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Dean
 */
public class BrowsePanel extends javax.swing.JPanel {

    /** Creates new form BrowsePanel */
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
        reportTable = new javax.swing.JTable();

        setName("Form"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        reportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        reportTable.setName("reportTable"); // NOI18N
        reportTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        reportTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(reportTable);
        reportTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void reportTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportTableMouseClicked
       
    }//GEN-LAST:event_reportTableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable reportTable;
    // End of variables declaration//GEN-END:variables

    public void loadTable() {
        reportTable.setModel(Internship.generateTable());
    }

    public void delete() {
        int rowId = getSelectedRow();
        if (Internship.delete(rowId)) {
            JOptionPane.showMessageDialog(null, "Internship #" + rowId + " was deleted");
            loadTable();
        } else if (getSelectedRow() != 0) {
            JOptionPane.showMessageDialog(null, "Internship #" + rowId + " could not be found");
        }
    }

    /**
     * Returns 0 if no SQL row found
     * @return
     */
    public int getSelectedRow() {
        int row = reportTable.getSelectedRow();
        if (row != -1) {
            return ((TableModel) reportTable.getModel()).getRowId(row);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row first");
            return 0;
        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJPanel.java
 *
 * Created on May 29, 2010, 12:11:32 AM
 */
package cis406.student;

import cis406.PanelInterface;
import java.awt.CardLayout;

/**
 *
 * @author Owner
 */
public class TaskMainPanel extends javax.swing.JPanel implements PanelInterface {

    String activeCard = "Browse";

    /** Creates new form NewJPanel */
    public TaskMainPanel() {
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

        browsePanel = new cis406.student.TaskBrowsePanel();
        editPanel = new cis406.student.TaskEditPanel();

        setName("Form"); // NOI18N
        setLayout(new java.awt.CardLayout());

        browsePanel.setName("browsePanel"); // NOI18N
        add(browsePanel, "Browse");

        editPanel.setName("editPanel"); // NOI18N
        add(editPanel, "Edit");
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private cis406.student.TaskBrowsePanel browsePanel;
    private cis406.student.TaskEditPanel editPanel;
    // End of variables declaration//GEN-END:variables

    public void browsing() {
        CardLayout cl = (CardLayout) (getLayout());
        cl.show(this, "Browse");
        activeCard = "Browse";
        browsePanel.loadTable();
    }

    public void editing() {
        CardLayout cl = (CardLayout) (getLayout());
        cl.show(this, "Edit");
        activeCard = "Edit";
    }

    public void clickNew() {
        editPanel.newTask();
        editing();
    }

    public void clickSave() {
        if (activeCard.equals("Edit") && editPanel.save()) {
            browsing();
        }
    }

    public void clickLoad() {
       if (activeCard.equals("Browse")) {
            int record = browsePanel.getSelectedRow();
            if (record != 0) {
                editing();
                editPanel.load(record);
            }
        }
    }

    public void clickDelete() {
        if (activeCard.equals("Browse")) {
            browsePanel.delete();
        } else {
        }
    }

    public void clickReset() {
        if (activeCard.equals("Edit")) {
            editPanel.reset();
        } else {
            browsePanel.loadTable();
        }
    }

    public void clickCancel() {
        browsing();
    }

    public void switchTo() {
    }

    public Boolean switchAway() {
        /*if (activeCard.equals("Edit")) {
        if (JOptionPane.showConfirmDialog(null, "You may have unfinished changes. Save?") == JOptionPane.YES_OPTION) {
        editPanel.save();
        return false;
        }
        }*/
        return true;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * InternshipPanel.java
 *
 * Created on May 10, 2010, 5:43:34 PM
 */
package cis406;

import java.awt.CardLayout;
import javax.swing.ButtonGroup;

/**
 *
 * @author Dean
 */
public class InternshipPanel extends javax.swing.JPanel implements CisPanel {

    String activeCard = "Form";

    /** Creates new form InternshipPanel */
    public InternshipPanel() {
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

        internshipFormPanel1 = new cis406.InternshipFormPanel();
        internshipReportPanel1 = new cis406.InternshipReportPanel();

        setName("Form"); // NOI18N
        setLayout(new java.awt.CardLayout());

        internshipFormPanel1.setName("internshipFormPanel1"); // NOI18N
        add(internshipFormPanel1, "Form");

        internshipReportPanel1.setName("internshipReportPanel1"); // NOI18N
        add(internshipReportPanel1, "Report");
    }// </editor-fold>//GEN-END:initComponents

    public void clickClear() {
        internshipFormPanel1.reset();
    }

    public void clickDelete() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void clickForm() {
        CardLayout cl = (CardLayout) (getLayout());
        cl.show(this, "Form");
        activeCard = "Form";
    }

    public void clickLoad() {
        clickForm();
    }

    public void clickNew() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void clickReport() {
        CardLayout cl = (CardLayout) (getLayout());
        cl.show(this, "Report");
        activeCard = "Report";

    }

    public void clickSave() {
        internshipFormPanel1.save();
    }

    public void switchAway() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void switchTo(ButtonGroup activeView) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private cis406.InternshipFormPanel internshipFormPanel1;
    private cis406.InternshipReportPanel internshipReportPanel1;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package hotelmanagement.GUI.Components;

import javax.swing.ImageIcon;

import hotelmanagement.BLL.DatDichVuBLL;
import hotelmanagement.DTO.DichVuDTO;
import hotelmanagement.GUI.ChinhSuaPhongGUI;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 *
 * @author Haizz
 */
public class DichVuComponent extends javax.swing.JPanel {
    private DichVuDTO DichVu;
    private ChinhSuaPhongGUI GUIParent;
    
    
    private BigDecimal oldData;
    /**
     * Creates new form DichVuComponent
     */
    public DichVuComponent() {
        initComponents();
    }

    public DichVuComponent(DichVuDTO DichVu, ChinhSuaPhongGUI GUIParent) {
        this.DichVu = DichVu;
        this.GUIParent = GUIParent;
        initComponents();
        this.nameLabel.setText(DichVu.getTenDichVu());
        DecimalFormat df = new DecimalFormat("#,###");
        this.donGiaLabel.setText(df.format(DichVu.getDonGia()) + " VNĐ");

        ImageIcon iconLogo = new ImageIcon(getClass().getResource(DichVu.getThumbnail()));
        this.thumbnailLabel.setIcon(iconLogo);
    }

    public DichVuDTO getMainDTO() {
        return this.DichVu;
    }

    public void setNumData(int num) {
        this.oldData = new BigDecimal(num);
        this.jSpinner1.setValue(Integer.valueOf(num));
    }

    public int getNumData() {
        return Integer.parseInt(this.jSpinner1.getValue().toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        thumbnailLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        donGiaLabel = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(100, 100));
        setMinimumSize(new java.awt.Dimension(100, 100));
        setName(""); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(100, 100));
        setRequestFocusEnabled(false);
        setLayout(new java.awt.GridLayout(1, 0));

        thumbnailLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelmanagement/Statics/Images/MonAn/suonxaochuangot.jpg"))); // NOI18N
        add(thumbnailLabel);

        nameLabel.setText("jLabel2");
        nameLabel.setMaximumSize(new java.awt.Dimension(25, 16));
        add(nameLabel);

        donGiaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        donGiaLabel.setText("jLabel1");
        add(donGiaLabel);

        jSpinner1.setEnabled(false);
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        add(jSpinner1);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jButton3.setText("Sửa");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new java.awt.GridBagConstraints());

        jButton1.setText("Lưu");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new java.awt.GridBagConstraints());

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        this.jSpinner1.setEnabled(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        // TODO add your handling code here:
        if (Integer.parseInt(this.jSpinner1.getValue().toString()) < 0) {
            this.jSpinner1.setValue(Integer.valueOf(0));
            return;
        }
        
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        this.jSpinner1.setEnabled(false);
        
        
    }//GEN-LAST:event_jButton1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel donGiaLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel thumbnailLabel;
    // End of variables declaration//GEN-END:variables
}

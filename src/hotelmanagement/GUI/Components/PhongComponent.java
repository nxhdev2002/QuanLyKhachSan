/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package hotelmanagement.GUI.Components;

import hotelmanagement.BLL.DatPhongBLL;
import hotelmanagement.BLL.KhachHangBLL;
import hotelmanagement.BLL.PhongBLL;
import hotelmanagement.DTO.DatTraPhongDTO;
import hotelmanagement.DTO.KhachHangDTO;
import hotelmanagement.DTO.PhongDTO;
import hotelmanagement.GUI.CheckOutGUI;
import hotelmanagement.GUI.ChinhSuaPhongGUI;
import hotelmanagement.GUI.DatPhongGUI;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author Haizz
 */
public class PhongComponent extends javax.swing.JPanel {
    private PhongDTO Phong;
    private DatPhongGUI datphongGUI;
    private ChinhSuaPhongGUI ChinhSuaPhongGUI;
    private DatTraPhongDTO donDatPhong;
    private KhachHangDTO Khach;
    private CheckOutGUI Checkout;
    /**
     * Creates new form PhongComponent
     */
    public PhongComponent() {
        initComponents();
    }
    
    public PhongComponent(PhongDTO Phong) {
        initComponents();
        this.Phong = Phong;
        if (Phong.getTrangThai() == 1) {
            this.donDatPhong = DatPhongBLL.getInstance().getData(Phong);
        }
        setDataGUI();
    }
    
    public void setDataGUI() {
        this.phongLabel.setText(Integer.toString(this.Phong.getSoPhong()));
        this.setOpaque(true);
        switch (this.Phong.getTrangThai()) {
            case -1:
                this.setBackground(new Color(255,153,153));
                this.leftButton.setText("Hoàn thành");
                this.rightButton.setText("Huỷ");
                break;
            case 0:
                this.setBackground(new Color(241,196,15));
                this.leftButton.setText("Dọn dẹp");
                this.rightButton.setText("Đặt phòng");
                break;
            default:
                this.setBackground(new Color(204,0,0));
                this.leftButton.setText("Checkout");
                this.rightButton.setText("Chỉnh sửa");
                this.Khach = KhachHangBLL.getInstance().getDataFromCCCD(this.donDatPhong.getCCCD());
                this.tenKhachHangLabel.setText(Khach.getTenKhachHang()); 
                DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                this.ngayBatDauLabel.setText(df.format(this.donDatPhong.getNgayDatPhong()));
                this.ngayKetThucLabel.setText(df.format(this.donDatPhong.getNgayTraPhong()));
        }
        
        if (this.Phong.getMaLoaiPhong() == 1) {
            this.loaiphongLabel.setText("Phòng đơn");
        } else {
            this.loaiphongLabel.setText("Phòng đôi");
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        phongLabel = new javax.swing.JLabel();
        leftButton = new javax.swing.JButton();
        rightButton = new javax.swing.JButton();
        tenKhachHangLabel = new javax.swing.JLabel();
        loaiphongLabel = new javax.swing.JLabel();
        ngayBatDauLabel = new javax.swing.JLabel();
        ngayKetThucLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 153, 255));
        setMaximumSize(new java.awt.Dimension(100, 100));

        phongLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        phongLabel.setText("Phong");

        leftButton.setText("jButton1");
        leftButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftButtonMouseClicked(evt);
            }
        });
        leftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftButtonActionPerformed(evt);
            }
        });

        rightButton.setText("jButton2");
        rightButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rightButtonMouseClicked(evt);
            }
        });

        tenKhachHangLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tenKhachHangLabel.setText("   ");

        loaiphongLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loaiphongLabel.setText("jLabel1");

        ngayBatDauLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ngayBatDauLabel.setText("  ");

        ngayKetThucLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ngayKetThucLabel.setText("  ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(phongLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tenKhachHangLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(leftButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(rightButton))
                    .addComponent(loaiphongLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ngayBatDauLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ngayKetThucLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(phongLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loaiphongLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tenKhachHangLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ngayBatDauLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ngayKetThucLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leftButton)
                    .addComponent(rightButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void leftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leftButtonActionPerformed

    private void rightButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rightButtonMouseClicked
        // TODO add your handling code here:
        if (this.Phong.getTrangThai() == 0) {
            if (this.datphongGUI == null) {
                this.datphongGUI = new DatPhongGUI(this.Phong);
                this.datphongGUI.setVisible(true);
            } else {
                this.datphongGUI.setVisible(true);
            }
        } else if (this.Phong.getTrangThai() == 1){
            if (this.ChinhSuaPhongGUI == null) {
                this.ChinhSuaPhongGUI = new ChinhSuaPhongGUI(this.Phong, this.Khach, this.donDatPhong);
                this.ChinhSuaPhongGUI.setVisible(true);
            } else {
                this.ChinhSuaPhongGUI.setVisible(true);
            }            
                            
            }
        }
        
//GEN-LAST:event_rightButtonMouseClicked

    private void leftButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftButtonMouseClicked
        // TODO add your handling code here:

        if (this.Phong.getTrangThai() == 0) {
//            this.Phong.setTrangThai(1);
        } else if (this.Phong.getTrangThai() == 1){
        
            this.Checkout = new CheckOutGUI(this.Phong, this.Khach, this.donDatPhong);
            this.Checkout.setVisible(true);
        }
    }//GEN-LAST:event_leftButtonMouseClicked
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton leftButton;
    private javax.swing.JLabel loaiphongLabel;
    private javax.swing.JLabel ngayBatDauLabel;
    private javax.swing.JLabel ngayKetThucLabel;
    private javax.swing.JLabel phongLabel;
    private javax.swing.JButton rightButton;
    private javax.swing.JLabel tenKhachHangLabel;
    // End of variables declaration//GEN-END:variables
}

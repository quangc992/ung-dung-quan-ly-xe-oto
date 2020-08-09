/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.ui_Xe;

import edu.poly.model.xe.dao.xeDao;
import edu.poly.model.xe.modelXe;
import javax.swing.JOptionPane;
import java.awt.Color;
/**
 *
 * @author QUANGC
 */
public class addXePanel extends javax.swing.JPanel {

    /**
     * Creates new form addXePanel
     */
    public addXePanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtGiaThueThangAdd = new javax.swing.JTextField();
        txtTienPhatAdd = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        btnXeAdd = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        btnAddReset1 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtBienSoXeAdd = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtTenXeAdd = new javax.swing.JTextField();
        txtMaXeAdd = new javax.swing.JTextField();
        txtSoMayAdd = new javax.swing.JTextField();
        txtSoKhungAdd = new javax.swing.JTextField();
        txtSoChoAdd = new javax.swing.JTextField();
        txtHangAdd = new javax.swing.JTextField();
        txtMaLoaiXeAdd = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMaLucAdd = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtTinhTrangXeAdd = new javax.swing.JTextField();
        ac1 = new javax.swing.JLabel();
        txtTimeStartTinhTrangAdd = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtTimeEndTinhTrangAdd = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtGiaThueGioAdd = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtGiaThueNgayAdd = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        txtGiaThueThangAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaThueThangAddActionPerformed(evt);
            }
        });

        txtTienPhatAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTienPhatAddActionPerformed(evt);
            }
        });

        jLabel31.setText("Số khung :");

        jLabel32.setText("Hãng :");

        btnXeAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/poly/icon/icon/save-20.png"))); // NOI18N
        btnXeAdd.setText("Thêm");
        btnXeAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXeAddActionPerformed(evt);
            }
        });

        jLabel33.setText("Số máy :");

        btnAddReset1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/poly/icon/icon/reset-20.png"))); // NOI18N
        btnAddReset1.setText("Đặt lại");
        btnAddReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddReset1ActionPerformed(evt);
            }
        });

        jLabel34.setText("Giá xe thuê theo tháng :");

        jLabel35.setText("Giá xe thuê theo giờ :");

        txtBienSoXeAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBienSoXeAddActionPerformed(evt);
            }
        });

        jLabel36.setText("Giá xe thuê theo ngày :");

        jLabel38.setText("Biển số xe :");

        jLabel37.setText("Tiền phạt trể ngày :");

        jLabel7.setText("Mã xe :");

        jLabel25.setText("Tên xe :");

        txtTinhTrangXeAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTinhTrangXeAddActionPerformed(evt);
            }
        });

        ac1.setText("Mã loại xe :");

        txtTimeStartTinhTrangAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeStartTinhTrangAddActionPerformed(evt);
            }
        });

        jLabel26.setText("Thời gian kết thúc tình trạng :");

        txtTimeEndTinhTrangAdd.setToolTipText("");
        txtTimeEndTinhTrangAdd.setName(""); // NOI18N
        txtTimeEndTinhTrangAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeEndTinhTrangAddActionPerformed(evt);
            }
        });

        jLabel27.setText("Thời gian bắt đầu tình trạng :");

        txtGiaThueGioAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaThueGioAddActionPerformed(evt);
            }
        });

        jLabel28.setText("Số chỗ : ");

        txtGiaThueNgayAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaThueNgayAddActionPerformed(evt);
            }
        });

        jLabel29.setText("Tình trạng xe :");

        jLabel30.setText("Mã lực:");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Thêm Xe");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel38)
                                    .addComponent(ac1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMaXeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtHangAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel30)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtMaLucAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel28)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtSoChoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(txtSoKhungAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSoMayAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTenXeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBienSoXeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaLoaiXeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel27)
                                                .addComponent(jLabel29))
                                            .addComponent(jLabel26)
                                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTimeEndTinhTrangAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtGiaThueGioAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTinhTrangXeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTimeStartTinhTrangAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTienPhatAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtGiaThueNgayAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtGiaThueThangAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(293, 293, 293)
                                .addComponent(btnXeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddReset1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 47, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(366, 366, 366))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtMaXeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMaLucAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSoChoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28)
                                    .addComponent(txtHangAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel32))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenXeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSoKhungAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSoMayAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBienSoXeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaLoaiXeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ac1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(txtTinhTrangXeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(txtTimeStartTinhTrangAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTimeEndTinhTrangAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGiaThueGioAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGiaThueNgayAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGiaThueThangAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTienPhatAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXeAdd)
                    .addComponent(btnAddReset1))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTinhTrangXeAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTinhTrangXeAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTinhTrangXeAddActionPerformed

    private void txtTimeStartTinhTrangAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeStartTinhTrangAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeStartTinhTrangAddActionPerformed

    private void txtTimeEndTinhTrangAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeEndTinhTrangAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeEndTinhTrangAddActionPerformed

    private void txtGiaThueGioAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaThueGioAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaThueGioAddActionPerformed

    private void txtGiaThueNgayAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaThueNgayAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaThueNgayAddActionPerformed

    private void txtGiaThueThangAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaThueThangAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaThueThangAddActionPerformed

    private void txtTienPhatAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTienPhatAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTienPhatAddActionPerformed

    private void btnXeAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXeAddActionPerformed
        try {
            StringBuffer sb = new StringBuffer();

            /*---------------------  check dữ liệu rỗng sẽ báo đỏ -----------------------------------*/

            if (txtMaXeAdd.getText().equals("")) {
                sb.append("Trường Mã xe không thể bỏ trống ! \n");
                txtMaXeAdd.setBackground(Color.red);
                txtMaXeAdd.requestFocus();
            }else{
                txtMaXeAdd.setBackground(Color.WHITE);
            }

            if (txtTenXeAdd.getText().equals("")) {
                sb.append("Trường Tên xe không thể bỏ trống ! \n");
                txtTenXeAdd.setBackground(Color.red);
                txtTenXeAdd.requestFocus();
            }else{
                txtTenXeAdd.setBackground(Color.WHITE);
            }

            if (txtSoKhungAdd.getText().equals("")) {
                sb.append("Trường số khung không thể bỏ trống ! \n");
                txtSoKhungAdd.setBackground(Color.red);
                txtSoKhungAdd.requestFocus();
            }else{
                txtSoKhungAdd.setBackground(Color.WHITE);
            }

            if (txtSoMayAdd.getText().equals("")) {
                sb.append("Trường Số máy không thể bỏ trống ! \n");
                txtSoMayAdd.setBackground(Color.red);
                txtSoMayAdd.requestFocus();
            }else{
                txtSoMayAdd.setBackground(Color.WHITE);
            }

            if (txtMaLucAdd.getText().equals("")) {
                sb.append("Trường Mã lực không thể bỏ trống ! \n");
                txtMaLucAdd.setBackground(Color.red);
                txtMaLucAdd.requestFocus();
            }else{
                txtMaLucAdd.setBackground(Color.WHITE);
            }

            if (txtHangAdd.getText().equals("")) {
                sb.append("Trường Hãng của xe không thể bỏ trống ! \n");
                txtHangAdd.setBackground(Color.red);
                txtHangAdd.requestFocus();
            }else{
                txtHangAdd.setBackground(Color.WHITE);
            }

            if (txtSoChoAdd.getText().equals("")) {
                sb.append("Trường Số chỗ của xe không thể bỏ trống ! \n");
                txtSoChoAdd.setBackground(Color.red);
                txtSoChoAdd.requestFocus();
            }else{
                txtSoChoAdd.setBackground(Color.WHITE);
            }

            if (txtGiaThueGioAdd.getText().equals("")) {
                sb.append("Trường Giá thuê Xe theo ngày không thể bỏ trống ! \n");
                txtGiaThueGioAdd.setBackground(Color.red);
                txtGiaThueGioAdd.requestFocus();
            }else{
                txtGiaThueGioAdd.setBackground(Color.WHITE);
            }

            if (txtGiaThueNgayAdd.getText().equals("")) {
                sb.append("Trường giá thuê xe theo ngày không thể bỏ trống ! \n");
                txtGiaThueNgayAdd.setBackground(Color.red);
                txtGiaThueNgayAdd.requestFocus();
            }else{
                txtGiaThueNgayAdd.setBackground(Color.WHITE);
            }

            if (txtGiaThueThangAdd.getText().equals("")) {
                sb.append("Trường Giá thuê xe theo tháng không thể bỏ trống ! \n");
                txtGiaThueThangAdd.setBackground(Color.red);
                txtGiaThueThangAdd.requestFocus();
            }else{
                txtGiaThueThangAdd.setBackground(Color.WHITE);
            }

            if (txtTienPhatAdd.getText().equals("")) {
                sb.append("Trường Tiền phạt không thể bỏ trống ! \n");
                txtTienPhatAdd.setBackground(Color.red);
                txtTienPhatAdd.requestFocus();
            }else{
                txtTienPhatAdd.setBackground(Color.WHITE);
            }

            if (txtTinhTrangXeAdd.getText().equals("")) {
                sb.append("Trường Tình trạng Xe không thể bỏ trống ! \n");
                txtTinhTrangXeAdd.setBackground(Color.red);
                txtTinhTrangXeAdd.requestFocus();
            }else{
                txtTinhTrangXeAdd.setBackground(Color.WHITE);
            }

            //            if (txtTimeStartTinhTrangAdd.getText().equals("")) {
                //                sb.append("Trường thời gian bắt đầu tình trạng không thể bỏ trống ! \n");
                //                txtTimeStartTinhTrangAdd.setBackground(Color.red);
                //                txtTimeStartTinhTrangAdd.requestFocus();
                //            }else{
                //                txtTimeStartTinhTrangAdd.setBackground(Color.WHITE);
                //            }
            //
            //            if (txtTimeEndTinhTrangAdd.getText().equals("")) {
                //                sb.append("Trường Thời gian kết thúc tình trạng không thể bỏ trống ! \n");
                //                txtTimeEndTinhTrangAdd.setBackground(Color.red);
                //                txtTimeEndTinhTrangAdd.requestFocus();
                //            }else{
                //                txtTimeEndTinhTrangAdd.setBackground(Color.WHITE);
                //            }

            if (txtMaLoaiXeAdd.getText().equals("")) {
                sb.append("Trường Mã loại xe không thể bỏ trống ! \n");
                txtMaLoaiXeAdd.setBackground(Color.red);
                txtMaLoaiXeAdd.requestFocus();
            }else{
                txtMaLoaiXeAdd.setBackground(Color.WHITE);
            }

            if (txtBienSoXeAdd.getText().equals("")) {
                sb.append("Trường Biển số xe không thể bỏ trống ! \n");
                txtBienSoXeAdd.setBackground(Color.red);
                txtBienSoXeAdd.requestFocus();
            }else{
                txtBienSoXeAdd.setBackground(Color.WHITE);
            }

            // Hiển thị thông báo lỗi đã được đặt sẵn
            if (sb.length()>0) {
                JOptionPane.showMessageDialog(this, sb.toString());
                return;
            }
            /*-------------------------------------------------------------------------------*/

            int n =  JOptionPane.showConfirmDialog(this,
                "Bạn có chắn chắn muốn thêm Xe ?",
                "Thông báo !",
                JOptionPane.YES_NO_OPTION);

            if(n == JOptionPane.YES_OPTION){
                //set dữ liệu vào database
                modelXe mdXe = new modelXe();
                mdXe.setMaXe(txtMaXeAdd.getText());
                mdXe.setTenXe(txtTenXeAdd.getText());
                mdXe.setSoKhung(txtSoKhungAdd.getText());
                mdXe.setSoMay(txtSoMayAdd.getText());
                mdXe.setMaLuc(Integer.parseInt(txtMaLucAdd.getText()));
                mdXe.setHang(txtHangAdd.getText());
                mdXe.setSoCho(Integer.parseInt(txtSoChoAdd.getText()));
                mdXe.setGiaThueXeTheoGio(Integer.parseInt(txtGiaThueGioAdd.getText()));
                mdXe.setGiaThueXeTheoNgay(Integer.parseInt(txtGiaThueNgayAdd.getText()));
                mdXe.setGiaThueXeTheoThang(Integer.parseInt(txtGiaThueThangAdd.getText()));
                mdXe.setTienPhat(Integer.parseInt(txtTienPhatAdd.getText()));
                mdXe.setTinhTrangXe(txtTinhTrangXeAdd.getText());
                mdXe.setThoiGianBatDauTinhTrang(txtTimeStartTinhTrangAdd.getText());
                mdXe.setThoiGianKetThucTinhTrang(txtTimeEndTinhTrangAdd.getText());
                mdXe.setMaLoaiXe(txtMaLoaiXeAdd.getText());
                mdXe.setBienSoXe(txtBienSoXeAdd.getText());

                xeDao dao = new xeDao();
                if (dao.insert(mdXe)) {
                    JOptionPane.showMessageDialog(this, "Thêm xe thành công !");
                }else{
                    JOptionPane.showMessageDialog(this, "Thêm xe bị lỗi vui lòng kiểm tra lại !");
                }
            }

        } catch (Exception e) {
            e.printStackTrace(); //show lỗi
            JOptionPane.showMessageDialog(this, "Error: "+ e.getMessage()); //show lỗi

        }
    }//GEN-LAST:event_btnXeAddActionPerformed

    private void btnAddReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddReset1ActionPerformed
        try {
            txtMaXeAdd.setText("");
            txtMaXeAdd.setBackground(Color.WHITE);
            txtTenXeAdd.setText("");
            txtTenXeAdd.setBackground(Color.WHITE);
            txtSoKhungAdd.setText("");
            txtSoKhungAdd.setBackground(Color.WHITE);
            txtSoMayAdd.setText("");
            txtSoMayAdd.setBackground(Color.WHITE);
            txtMaLucAdd.setText("");
            txtMaLucAdd.setBackground(Color.WHITE);
            txtHangAdd.setText("");
            txtHangAdd.setBackground(Color.WHITE);
            txtSoChoAdd.setText("");
            txtSoChoAdd.setBackground(Color.WHITE);
            txtGiaThueGioAdd.setText("");
            txtGiaThueGioAdd.setBackground(Color.WHITE);
            txtGiaThueNgayAdd.setText("");
            txtGiaThueNgayAdd.setBackground(Color.WHITE);
            txtGiaThueThangAdd.setText("");
            txtGiaThueThangAdd.setBackground(Color.WHITE);
            txtTienPhatAdd.setText("");
            txtTienPhatAdd.setBackground(Color.WHITE);
            txtTinhTrangXeAdd.setText("");
            txtTinhTrangXeAdd.setBackground(Color.WHITE);
            txtTimeStartTinhTrangAdd.setText("");
            txtTimeStartTinhTrangAdd.setBackground(Color.WHITE);
            txtTimeEndTinhTrangAdd.setText("");
            txtTimeEndTinhTrangAdd.setBackground(Color.WHITE);
            txtMaLoaiXeAdd.setText("");
            txtMaLoaiXeAdd.setBackground(Color.WHITE);
            txtBienSoXeAdd.setText("");
            txtBienSoXeAdd.setBackground(Color.WHITE);

            //JOptionPane.showMessageDialog(this, "Vui lòng nhập lại thông tin !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnAddReset1ActionPerformed

    private void txtBienSoXeAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBienSoXeAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBienSoXeAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ac1;
    private javax.swing.JButton btnAddReset1;
    private javax.swing.JButton btnXeAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtBienSoXeAdd;
    private javax.swing.JTextField txtGiaThueGioAdd;
    private javax.swing.JTextField txtGiaThueNgayAdd;
    private javax.swing.JTextField txtGiaThueThangAdd;
    private javax.swing.JTextField txtHangAdd;
    private javax.swing.JTextField txtMaLoaiXeAdd;
    private javax.swing.JTextField txtMaLucAdd;
    private javax.swing.JTextField txtMaXeAdd;
    private javax.swing.JTextField txtSoChoAdd;
    private javax.swing.JTextField txtSoKhungAdd;
    private javax.swing.JTextField txtSoMayAdd;
    private javax.swing.JTextField txtTenXeAdd;
    private javax.swing.JTextField txtTienPhatAdd;
    private javax.swing.JTextField txtTimeEndTinhTrangAdd;
    private javax.swing.JTextField txtTimeStartTinhTrangAdd;
    private javax.swing.JTextField txtTinhTrangXeAdd;
    // End of variables declaration//GEN-END:variables
}
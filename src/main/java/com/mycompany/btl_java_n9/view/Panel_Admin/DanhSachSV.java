/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.btl_java_n9.view.Panel_Admin;

import com.mycompany.btl_java_n9.controller.admin.ThemSV_con;
import com.mycompany.btl_java_n9.data_acess.ChuyenSinhVien;
import com.mycompany.btl_java_n9.entity.SinhVien_HoSo;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Administrator
 */
public class DanhSachSV extends javax.swing.JPanel {
    
    /**
     * Creates new form DanhSachSV
     */
    public DanhSachSV() {
        initComponents();
        new ThemSV_con().dodulieu(bang);
        new ThemSV_con().setBox_diachi(box_diachi);
        new ThemSV_con().setBox_khoa(box_khoa);
       
    }

    public JTable getBang() {
        return bang;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        banght = new javax.swing.JPanel();
        nhapma = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bang = new javax.swing.JTable();
        box_diachi = new javax.swing.JComboBox<>();
        box_khoa = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        banght.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nhapma.setForeground(new java.awt.Color(153, 153, 153));
        nhapma.setText(" Nhập mã sinh viên");
        nhapma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nhapmaMouseClicked(evt);
            }
        });
        banght.add(nhapma, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 250, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/I_16/icons8-search-16.png"))); // NOI18N
        jButton1.setText("Tìm kiếm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        banght.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        bang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jScrollPane1.setViewportView(bang);
        if (bang.getColumnModel().getColumnCount() > 0) {
            bang.getColumnModel().getColumn(0).setMinWidth(150);
            bang.getColumnModel().getColumn(0).setPreferredWidth(150);
            bang.getColumnModel().getColumn(0).setMaxWidth(300);
        }

        banght.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 560, 180));

        box_diachi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All" }));
        box_diachi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                box_diachiItemStateChanged(evt);
            }
        });
        banght.add(box_diachi, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 100, -1));

        box_khoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All" }));
        box_khoa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                box_khoaItemStateChanged(evt);
            }
        });
        banght.add(box_khoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 100, -1));

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/I_16/icons8-edit-16.png"))); // NOI18N
        jButton2.setText("Sửa thông tin");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        banght.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 160, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/I_16/icons8-refresh-16.png"))); // NOI18N
        jButton3.setText("Restart");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        banght.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/I_16/icons8-home-16.png"))); // NOI18N
        banght.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/I_16/icons8-class-16 (1).png"))); // NOI18N
        banght.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, -1, -1));

        add(banght, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 720, 370));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new ThemSV_con().dodulieu(bang);
        box_diachi.setSelectedItem("All");
        box_khoa.setSelectedItem("All");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new ThemSV_con().timkiem(nhapma, bang);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nhapmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nhapmaMouseClicked
        nhapma.setText("");
        nhapma.setForeground(Color.red);
    }//GEN-LAST:event_nhapmaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(new ThemSV_con().dieukiensua(bang)){
            ghi();
        banght.removeAll();
        banght.add(new SuaTTSV(), new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 400));
        }
        else{
            JOptionPane.showMessageDialog(this, "Ban chua chon sinh vien nao!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void box_diachiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_box_diachiItemStateChanged
       new ThemSV_con().loc(box_diachi,box_khoa, bang);
       
    }//GEN-LAST:event_box_diachiItemStateChanged

    private void box_khoaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_box_khoaItemStateChanged
        new ThemSV_con().loc(box_diachi,box_khoa, bang);
    }//GEN-LAST:event_box_khoaItemStateChanged
    public void ghi(){
        new ChuyenSinhVien().ghifile(new ThemSV_con().hienThiSinhVien(bang));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bang;
    private javax.swing.JPanel banght;
    private javax.swing.JComboBox<String> box_diachi;
    private javax.swing.JComboBox<String> box_khoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nhapma;
    // End of variables declaration//GEN-END:variables
}
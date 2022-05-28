/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.btl_java_n9.view;

import com.mycompany.btl_java_n9.data_acess.SinhVien_AdminDTA;
import com.mycompany.btl_java_n9.entity.SinhVien_HoSo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class DangNhap extends javax.swing.JFrame {

    /**
     * Creates new form DangNhap
     */
    public DangNhap() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập");
        setMinimumSize(new java.awt.Dimension(400, 320));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/I_32/icons8-log-in-32.png"))); // NOI18N
        jLabel1.setText("Đăng Nhập");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 20, 124, 32);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/I_32/icons8-remove-32.png"))); // NOI18N
        jLabel2.setText("Pass:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 150, 72, 50);
        getContentPane().add(user);
        user.setBounds(140, 100, 190, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/I_32/icons8-person-32.png"))); // NOI18N
        jLabel3.setText("User:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 93, 72, 40);
        getContentPane().add(pass);
        pass.setBounds(140, 160, 150, 30);

        jButton1.setText("Đăng Nhập");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(160, 220, 100, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      if(user.getText().length()==0){
          JOptionPane.showMessageDialog(this, "Ban chua nhap User.");
      }
      else if(String.valueOf(pass.getPassword()).length()==0){
          JOptionPane.showMessageDialog(this, "Ban chua nhap Pass.");
      }
      else if(user.getText().equals("Admin")&&String.valueOf(pass.getPassword()).equals("Admin")){
          new View_Admin().setVisible(true);
          dispose();
      }
       else if(user.getText().equals("Teacher")&&String.valueOf(pass.getPassword()).equals("Teacher")){
          new View_Teacher().setVisible(true);
          dispose();
      }
       else {
           int dem=0;
           ArrayList<SinhVien_HoSo> list=new SinhVien_AdminDTA().docfile();
           for (SinhVien_HoSo s : list) {
              if(user.getText().equals(s.getMasv())&&String.valueOf(pass.getPassword()).equals(s.getPass())){
                  new View_Student().setVisible(true);dem=1;break;
              }
          }
           if(dem==0){
               JOptionPane.showMessageDialog(this, "Tai khoan hoac mat khau chua chinh xac.");
           }
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}

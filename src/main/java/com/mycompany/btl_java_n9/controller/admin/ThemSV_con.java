/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.btl_java_n9.controller.admin;

import com.mycompany.btl_java_n9.data_acess.SinhVien_AdminDTA;
import com.mycompany.btl_java_n9.entity.SinhVien_HoSo;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class ThemSV_con {
    ArrayList<SinhVien_HoSo>list=new SinhVien_AdminDTA().docfile();
    int ch;
    public ThemSV_con(){// Sap xep du lieu theo masv giam dan
         Collections.sort(list,new Comparator<SinhVien_HoSo>(){
            @Override
            public int compare(SinhVien_HoSo o1, SinhVien_HoSo o2) {
                return o2.getMasv().compareTo(o1.getMasv());
            }
            
        });
    }
    public void setKhoa(JComboBox khoa,JComboBox lop){// tao gia tri cho cmbobox Khoa
        if(khoa.getSelectedIndex()==0){
           lop.removeAllItems();
           lop.addItem("CNTT1");
           lop.addItem("CNTT2");
       }
        else if(khoa.getSelectedIndex()==1){
            lop.removeAllItems();
            lop.addItem("HTTT1");
           lop.addItem("HTTT2");
       }
        else if(khoa.getSelectedIndex()==2){
           lop.removeAllItems();
           lop.addItem("KHMT1");
           lop.addItem("KHMT2");
       }
        else if(khoa.getSelectedIndex()==3){
           lop.removeAllItems();
           lop.addItem("KTPM1");
           lop.addItem("KTPM2");
       }
    }
    public void dodulieu(JTable bang){// Do du lieu vao bang
       
        DefaultTableModel model=new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Ma SV","Pass","Ten SV","Ngay sinh","Dia chi","Khoa","Lop"});
        for (SinhVien_HoSo s : list) {
            model.addRow(new Object[]{s.getMasv(),s.getPass(),s.getHoten(),s.getNgaysinh(),s.getDiachi(),s.getKhoa(),s.getLop()});
        }
        bang.setModel(model);
        //Set do dai cho colum.
        bang.getColumnModel().getColumn(0).setPreferredWidth(120);
        bang.getColumnModel().getColumn(1).setPreferredWidth(80);
        bang.getColumnModel().getColumn(2).setPreferredWidth(200);
        bang.getColumnModel().getColumn(3).setPreferredWidth(100);
        bang.getColumnModel().getColumn(4).setPreferredWidth(100);
    }
    public void setBox_diachi(JComboBox box){ //DO du lieu vao box dia chi
        for (SinhVien_HoSo s : list) {
            if(box.getItemCount()==0){
                 box.addItem(s.getDiachi());
            }
            else{
                int dem=0;
                for(int i=0;i<box.getItemCount();++i){
                    if((box.getItemAt(i).equals(s.getDiachi()))){
                        dem=1;
                        break;
                    }
                }
                if(dem==0){
                     box.addItem(s.getDiachi());
                }
            }
           
        }
    }
    public void setBox_khoa(JComboBox box){// DO du lieu vao box khoa.
        for (SinhVien_HoSo s : list) {
            if(box.getItemCount()==0){
                 box.addItem(s.getKhoa());
            }
            else{
                int dem=0;//Kiem tra xem khoa da trung ten hay chua?neu trung thi bo qua
                for(int i=0;i<box.getItemCount();++i){
                    if((box.getItemAt(i).equals(s.getKhoa()))){
                        dem=1;
                        break;
                    }
                }
                if(dem==0){
                     box.addItem(s.getKhoa());
                }
            }
           
        }
    }
    public void timkiem(JTextField nhapma,JTable bang){
        for (SinhVien_HoSo s : list) {
            if(nhapma.getText().equals(s.getMasv())){
                bang.removeAll();//Xoa du lieu cu de them du lieu da cap nhat
                DefaultTableModel model=new DefaultTableModel();
                model.setColumnIdentifiers(new String[]{"Ma SV","Pass","Ten SV","Ngay sinh","Dia chi","Khoa","Lop"});
                model.addRow(new Object[]{s.getMasv(),s.getPass(),s.getHoten(),s.getNgaysinh(),s.getDiachi(),s.getKhoa(),s.getLop()});
                bang.setModel(model);
                bang.getColumnModel().getColumn(0).setPreferredWidth(120);
                bang.getColumnModel().getColumn(1).setPreferredWidth(80);
                bang.getColumnModel().getColumn(2).setPreferredWidth(200);
                bang.getColumnModel().getColumn(3).setPreferredWidth(100);
                bang.getColumnModel().getColumn(4).setPreferredWidth(100);
                break;
            }
        }
    }
    public boolean dieukiensua(JTable bang){// thiet lap dieu kien cho phep sua thong tin
        if(bang.getSelectedRow()>=0){
            return true;
        }
        else return false;
    }
    public SinhVien_HoSo  hienThiSinhVien(JTable bang){// Hien thi thong tin sinh vien trong khung nhins SuaTTSV.
        int ch=bang.getSelectedRow();
        return list.get(ch);
    }
    public boolean kiemtraText(JTextField hoten,JTextField pass,JFormattedTextField ngaysinh){
        //Kiem tra xem cac truong da hop le hay chua.
        boolean dem = true;
        
        // bat loi de trong
        String check = hoten.getText();
            Pattern pattern = Pattern.compile("^[a-zA-Z ]+$");
            Matcher matcher = pattern.matcher(check);
            
        if(!matcher.matches()){
            JOptionPane.showMessageDialog(null,"Ho ten khong hop le!");
            dem=false;
        }
        else if(hoten.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Trường họ tên không được để trống!");
            dem=false;
        }
        else if(pass.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Trường pass không được để trống!");
            dem=false;
        }
       try {// bat loi ngay thang sai dinh dang
         Date date = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ngay sinh khong hop le!");
            dem=false;
        }
        if(ktngay(ngaysinh).equals("")==false){
            JOptionPane.showMessageDialog(null,ktngay(ngaysinh) );
            dem=false;
        }
        if(dem){
            return true;
        }else return false;
    }
    public String ktngay(JFormattedTextField ngaysinh){
        String[] str=ngaysinh.getText().split("/");
        int ngay=Integer.parseInt(str[0]);
        int thang=Integer.parseInt(str[1]);
        int nam=Integer.parseInt(str[2]);
        String check="";
        if(LocalDate.now().getYear()-nam<=18){
            check="Lỗi năm quá lớn!"+nam+LocalDate.now().getYear();
        }
        else if(ngay>31){
            check="Loi ngay lớn hơn 31!";
        }
        else if(thang==2&&nam%4==0&&ngay>29){
            check="loi năm nhuận tháng 2 không có ngay 30";
        }
        else if(thang==2&&ngay>28){
          check="loi thang 2 khong co ngay 29";
        }
        else if((thang==4||thang==6||thang==8||thang==9||thang==11)&&ngay>30){
             check="Loi ngay 30!";
        }
        return check;
    }
    public void loc_diachi(JComboBox box_dc,JTable bang){// loc du lieu theo dia chi
        String ad=(String) box_dc.getSelectedItem();
       DefaultTableModel model=new DefaultTableModel();
       model.setColumnIdentifiers(new String[]{"Ma SV","Pass","Ten SV","Ngay sinh","Dia chi","Khoa","Lop"});
        for (SinhVien_HoSo s : list) {
                
               if(s.getDiachi().equals(ad)){
                    model.addRow(new Object[]{s.getMasv(),s.getPass(),s.getHoten(),s.getNgaysinh(),s.getDiachi(),s.getKhoa(),s.getLop()});
               }
                
        }
        bang.removeAll();
        bang.setModel(model);
                bang.getColumnModel().getColumn(0).setPreferredWidth(120);
                bang.getColumnModel().getColumn(1).setPreferredWidth(80);
                bang.getColumnModel().getColumn(2).setPreferredWidth(200);
                bang.getColumnModel().getColumn(3).setPreferredWidth(100);
                bang.getColumnModel().getColumn(4).setPreferredWidth(100);
        if(ad.equals("All")){
            dodulieu(bang);
        }
    }
    public void loc_khoa(JComboBox box_dc,JTable bang){// loc du lieu theo khoa
        String ad=(String) box_dc.getSelectedItem();
       DefaultTableModel model=new DefaultTableModel();
       model.setColumnIdentifiers(new String[]{"Ma SV","Pass","Ten SV","Ngay sinh","Dia chi","Khoa","Lop"});
        for (SinhVien_HoSo s : list) {
                
               if(s.getKhoa().equals(ad)){
                    model.addRow(new Object[]{s.getMasv(),s.getPass(),s.getHoten(),s.getNgaysinh(),s.getDiachi(),s.getKhoa(),s.getLop()});
               }
                
        }
        bang.removeAll();
        bang.setModel(model);
                bang.getColumnModel().getColumn(0).setPreferredWidth(120);
                bang.getColumnModel().getColumn(1).setPreferredWidth(80);
                bang.getColumnModel().getColumn(2).setPreferredWidth(200);
                bang.getColumnModel().getColumn(3).setPreferredWidth(100);
                bang.getColumnModel().getColumn(4).setPreferredWidth(100);
        if(ad.equals("All")){
            dodulieu(bang);
        }
    }
    public void loc(JComboBox box_dc,JComboBox box_khoa,JTable bang){//loc ket hop
        if(box_dc.getSelectedIndex()==0){
            loc_khoa(box_khoa, bang);
        }
        else if(box_khoa.getSelectedIndex()==0){
            loc_diachi(box_dc, bang);
        }
        else{
            String ad=(String) box_dc.getSelectedItem();
            String ak=(String) box_khoa.getSelectedItem();
       DefaultTableModel model=new DefaultTableModel();
       model.setColumnIdentifiers(new String[]{"Ma SV","Pass","Ten SV","Ngay sinh","Dia chi","Khoa","Lop"});
        for (SinhVien_HoSo s : list) {
                
               if(s.getKhoa().equals(ak)&&s.getDiachi().equals(ad)){
                    model.addRow(new Object[]{s.getMasv(),s.getPass(),s.getHoten(),s.getNgaysinh(),s.getDiachi(),s.getKhoa(),s.getLop()});
               }
                
        }
        bang.removeAll();
        bang.setModel(model);
                bang.getColumnModel().getColumn(0).setPreferredWidth(120);
                bang.getColumnModel().getColumn(1).setPreferredWidth(80);
                bang.getColumnModel().getColumn(2).setPreferredWidth(200);
                bang.getColumnModel().getColumn(3).setPreferredWidth(100);
                bang.getColumnModel().getColumn(4).setPreferredWidth(100);
        
        }
       
    }
    public String tao_Masv(){
        int ma=Integer.parseInt(list.get(0).getMasv());
        ma=ma+1;
        return String.valueOf(ma);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btl_java_n9.data_acess;

import com.mycompany.btl_java_n9.entity.QuanLySV;
import com.mycompany.btl_java_n9.entity.QuanLyDiemThi;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SinhVien_TeacherDTA {
    
// Hàm ghi danh sách Quản lí điểm sinh viên vào file
    public void ghiFileQuanLySV(ArrayList<QuanLySV> list){
        
// Tạo FileOutputStream và ObjectOutputStream
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
// Gán giá trị cho FileOutputStream và ObjectOutputStream
            fos = new FileOutputStream("QuanLiSV.dat", false);
            oos = new ObjectOutputStream(fos);
// Ghi dữ liệu vào file
            oos.writeObject(list);
        } catch (FileNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"loi: " + ex);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"loi: " + ex);
        } finally{
            try {
// Đóng FileOutputStream và ObjectOutputStream
                fos.close();
                oos.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null,"loi: " + ex);
            }
        }
    }
    
// Hàm ghi danh sách Quản lí điểm sinh viên vào file
    public void ghiFileQuanLyDiemThi(ArrayList<QuanLyDiemThi> list){
        
// Tạo FileOutputStream và ObjectOutputStream
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
// Gán giá trị cho FileOutputStream và ObjectOutputStream
            fos = new FileOutputStream("QuanLyDiemThi.dat", false);
            oos = new ObjectOutputStream(fos);
// Ghi dữ liệu vào file
            oos.writeObject(list);
        } catch (FileNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"loi: " + ex);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"loi: " + ex);
        } finally{
            try {
// Đóng FileOutputStream và ObjectOutputStream
                fos.close();
                oos.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null,"loi: " + ex);
            }
        }
    }
    
// Hàm đọc danh sách Quản lí điểm sinh viên từ file
    public ArrayList<QuanLySV> docFileQuanLySV(){
// Khởi tạo list QuanLySV, FileInputStream và ObjectInputStream
        ArrayList<QuanLySV> list = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        File f = new File("QuanLiSV.dat");
// Nếu tồn tại file thì mới thực hiện tiếp
        if(f.exists()){
            try {
// Gán giá trị cho FilInputStream và ObjectInputStream
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
// Nếu trong file có dữ liệu thì thực hiện đọc
            if(ois != null){
                list = (ArrayList<QuanLySV>) ois.readObject();
            }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null,"loi: " + ex);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null,"loi: " + ex);
            } finally{
                try {
// Đóng FileInputStream và ObjectInputStream
                    fis.close();
                    ois.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null,"loi: " + ex);
                }
            }
        }
// Trả về danh sách QuanLySV đã đọc
        return list;
    }
    
// Hàm đọc danh sách Quản lí điểm sinh viên từ file
    public ArrayList<QuanLyDiemThi> docFileQuanLyDiemThi(){
// Khởi tạo list QuanLySV, FileInputStream và ObjectInputStream
        ArrayList<QuanLyDiemThi> list = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        File f = new File("QuanLyDiemThi.dat");
// Nếu tồn tại file thì mới thực hiện tiếp
        if(f.exists()){
            try {
// Gán giá trị cho FilInputStream và ObjectInputStream
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
// Nếu trong file có dữ liệu thì thực hiện đọc
            if(ois != null){
                list = (ArrayList<QuanLyDiemThi>) ois.readObject();
            }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null,"loi: " + ex);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null,"loi: " + ex);
            } finally{
                try {
// Đóng FileInputStream và ObjectInputStream
                    fis.close();
                    ois.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null,"loi: " + ex);
                }
            }
        }
// Trả về danh sách QuanLySV đã đọc
        return list;
    }
    
}

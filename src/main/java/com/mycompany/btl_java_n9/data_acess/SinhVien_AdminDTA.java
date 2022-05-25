/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.btl_java_n9.data_acess;

import com.mycompany.btl_java_n9.entity.SinhVien_HoSo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class SinhVien_AdminDTA {
    File f=new File("SinhVien_HoSo.DAT");
    public void ghifile(ArrayList<SinhVien_HoSo> list)
    {
        try{
            if(!f.exists())
                f.createNewFile();
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
            oos.writeObject(list);
            oos.close();
        }   
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Loi: "+e);
        }
    }
    public ArrayList<SinhVien_HoSo> docfile() 
    {
        ArrayList<SinhVien_HoSo> list = null;
        try {
        ObjectInputStream ois =new  ObjectInputStream(new FileInputStream(f));
        list= (ArrayList<SinhVien_HoSo>)ois.readObject();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Loi: "+e);
        }
        return list;
    }
    public static void main(String[] args) {
        ArrayList<SinhVien_HoSo>list=new ArrayList<>();
        list.add(new SinhVien_HoSo("2019600001","chinh","Nguyễn Văn Chính","10/09/2001","Thanh Hóa","CNTT","CNTT6"));
        list.add(new SinhVien_HoSo("2019600002","dong","Nguyễn Văn Đông","12/05/2001","Thanh Hóa","CNTT","CNTT6"));
        list.add(new SinhVien_HoSo("2019600003","hung","Nguyễn Văn Hưng","10/06/2001","Hà Nội","CNTT","CNTT6"));
        new SinhVien_AdminDTA().ghifile(list);
        ArrayList<SinhVien_HoSo>li=new SinhVien_AdminDTA().docfile();
        for (SinhVien_HoSo s : li) {
            System.out.println(s.getMasv());
        }
    }
}

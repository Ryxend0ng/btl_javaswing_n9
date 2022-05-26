/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.btl_java_n9.data_acess;

import com.mycompany.btl_java_n9.entity.SinhVien_HoSo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class ChuyenSinhVien {
    File f=new File("ChuyenSinhVien.DAT");
    public void ghifile(SinhVien_HoSo sv)
    {
        try{
            if(!f.exists())
                f.createNewFile();
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
            oos.writeObject(sv);
            oos.close();
        }   
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Loi: "+e);
        }
    }
    public SinhVien_HoSo docfile() 
    {
        SinhVien_HoSo s = null;
        try {
        ObjectInputStream ois =new  ObjectInputStream(new FileInputStream(f));
        s= (SinhVien_HoSo) ois.readObject();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Loi: "+e);
        }
        return s;
    }
}

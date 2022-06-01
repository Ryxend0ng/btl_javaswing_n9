/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btl_java_n9.data_acess;

import com.mycompany.btl_java_n9.entity.PhanHoi;
import com.mycompany.btl_java_n9.entity.SinhVien_HoSo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 0961011310
 */
public class AdminNhanPhanHoi_DTA {
     File f=new File("ADMIN_NHAN_PHAN_HOI.DAT");
    public  void ghifile(List<PhanHoi> list)
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
    public List<PhanHoi> docfile() 
    {
        List<PhanHoi> list = null;
        try {
        ObjectInputStream ois =new  ObjectInputStream(new FileInputStream(f));
        list= (ArrayList<PhanHoi>)ois.readObject();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Loi: "+e);
        }
        return list;
    }
      public static void main(String[] args) {
          File f=new File("ADMIN_NHAN_PHAN_HOI.DAT");
          List<PhanHoi> listPh=new AdminNhanPhanHoi_DTA().docfile();
               
          System.out.println(listPh.size());
          
            
    }
}

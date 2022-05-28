/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btl_java_n9.controller.student;

import com.mycompany.btl_java_n9.data_acess.SinhVien_TeacherDTA;
import com.mycompany.btl_java_n9.entity.BangDiem;
import com.mycompany.btl_java_n9.entity.QuanLyDiemThi;
import com.mycompany.btl_java_n9.entity.QuanLySV;
import com.mycompany.btl_java_n9.entity.SinhVien_HoSo;
import com.mycompany.btl_java_n9.view.DangNhap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author 0961011310
 */
public class StudentController {
    public SinhVien_HoSo getSinhVien(){
        return DangNhap.sv;
    }
    public QuanLySV getBangDiem(){
        SinhVien_HoSo sv=DangNhap.sv;
        QuanLySV ql=null;
        List<QuanLySV> listQl=new SinhVien_TeacherDTA().docFileQuanLySV();
        for(int i=0;i<listQl.size();i++){
            if(sv.getMasv().equals(listQl.get(i).getMaSV())){
                ql=listQl.get(i);
               
            } else {
            }
        }
        return ql;
    }
    public int xepHang(){
         SinhVien_HoSo sv=DangNhap.sv;
         int rank=0;
          QuanLySV ql=null;
        List<QuanLySV> listQl=new SinhVien_TeacherDTA().docFileQuanLySV();
        for(int i=0;i<listQl.size();i++){
            if(sv.getMasv().equals(listQl.get(i).getMaSV())){
                ql=listQl.get(i);
              
            } else {
            }
        }
        Collections.sort(listQl,(QuanLySV ql1,QuanLySV ql2)->{
            float diemtb1=(ql1.getDiem1()+ql1.getDiem2())/2;
            float diemtb2=(ql2.getDiem1()+ql2.getDiem2())/2;
        return diemtb1>diemtb2?-1:diemtb1==diemtb2?0:1;});
        for (int i=listQl.size()-1;i>=0;i--) {
            //System.out.println(listQl.get(i).getMaSV());
            if(listQl.get(i).getMaSV().equals(sv.getMasv())){
                rank=i+1;
                break;
            }
        }
        return rank;
    }
    public int count(){
         List<QuanLySV> listQl=new SinhVien_TeacherDTA().docFileQuanLySV();
         int count=0;
         for(int i=0;i<listQl.size();i++){
          count ++;
           
        }
         return count;
    }
    public QuanLyDiemThi getQuanLyDiemThi(){
         SinhVien_HoSo sv=DangNhap.sv;
        QuanLyDiemThi ql=null;
        List<QuanLyDiemThi> listQl=new SinhVien_TeacherDTA().docFileQuanLyDiemThi();
        for(int i=0;i<listQl.size();i++){
            if(sv.getMasv().equals(listQl.get(i).getMaSV())){
                ql=listQl.get(i);
               
            } else {
            }
        }
        return ql;
    }
}

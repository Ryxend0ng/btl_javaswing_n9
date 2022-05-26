/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btl_java_n9.entity;



/**
 *
 * @author 0961011310
 */
public class BangDiem {
    private String maSv;
    private String tenSv;
    private float diem1;
    private float diem2;
    private  float diemThi;
    private  String trangThai;
  //  private static final Logger LOG = Logger.getLogger(BangDiem.class.getName());

    public String getMaSv() {
        return maSv;
    }

    public String getTenSv() {
        return tenSv;
    }

    public float getDiem1() {
        return diem1;
    }

    public float getDiem2() {
        return diem2;
    }

    public float getDiemThi() {
        return diemThi;
    }

    public String getTrangThai() {
        return trangThai;
    }

   

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public void setTenSv(String tenSv) {
        this.tenSv = tenSv;
    }

    public void setDiem1(float diem1) {
        this.diem1 = diem1;
    }

    public void setDiem2(float diem2) {
        this.diem2 = diem2;
    }

    public void setDiemThi(float diemThi) {
        this.diemThi = diemThi;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public BangDiem(String maSv, String tenSv, float diem1, float diem2, float diemThi, String trangThai) {
        this.maSv = maSv;
        this.tenSv = tenSv;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diemThi = diemThi;
        this.trangThai = trangThai;
    }

    public BangDiem() {
    }
    
}

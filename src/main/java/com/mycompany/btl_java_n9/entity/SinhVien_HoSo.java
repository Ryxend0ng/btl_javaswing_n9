/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.btl_java_n9.entity;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class SinhVien_HoSo implements Serializable{
    private String masv;
    private String pass;
    private String hoten;
    private String ngaysinh;
    private String diachi;
    private String khoa;
    private String lop;

  // private String chuNhiem;

    public SinhVien_HoSo(String masv, String pass, String hoten, String ngaysinh, String diachi, String khoa, String lop) {
        this.masv = masv;
        this.pass = pass;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.khoa = khoa;
        this.lop = lop;
    }

public SinhVien_HoSo(){
    
}

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

//    public void setChuNhiem(String chuNhiem) {
//        this.chuNhiem = chuNhiem;
//    }
//
//    public String getChuNhiem() {
//        return chuNhiem;
//    }



    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btl_java_n9.entity;

import java.io.Serializable;

// Tạo lớp quản lí điểm sinh viên
public class QuanLySV implements Serializable{
    private String maSV;
    private String tenSV;
    private float diem1, diem2;
    private boolean trangThai;
    private int soTietNghi;

// Tạo hàm khởi tạo 4 tham số và 2 tham số
    public QuanLySV(String maSV, String tenSV, float diem1, float diem2, int soTietNghi) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.soTietNghi = soTietNghi;
    }

    public QuanLySV(String maSV, String tenSV) {
        this.maSV = maSV;
        this.tenSV = tenSV;
    }
    
// Thêm hàm get set   
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public float getDiem1() {
        return diem1;
    }

    public void setDiem1(float diem1) {
        this.diem1 = diem1;
    }

    public float getDiem2() {
        return diem2;
    }

    public void setDiem2(float diem2) {
        this.diem2 = diem2;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public int getSoTietNghi() {
        return soTietNghi;
    }

    public void setSoTietNghi(int soTietNghi) {
        this.soTietNghi = soTietNghi;
    }
    

// Override hàm ToString
    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", tenSV=" + tenSV + ", diem1=" + diem1 + ", diem2=" + diem2+ ", soTietNgi=" + soTietNghi + ", trangThai=" + trangThai + '}';
    }
}

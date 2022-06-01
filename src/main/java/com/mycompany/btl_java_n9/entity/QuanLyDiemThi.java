/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btl_java_n9.entity;

import java.io.Serializable;

/**
 *
 * @author NguyenVanHung
 */
public class QuanLyDiemThi implements Serializable{
    private String maSV;
    private String tenSV;
    private float diemTP;
    private float diemThi;
    private float diemTB;
    private String diemChu;

    public QuanLyDiemThi(String maSV, String tenSV, float diemTP) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.diemTP = diemTP;
    }

    public QuanLyDiemThi(String maSV, String tenSV, float diemTP, float diemThi, float diemTB, String diemChu) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.diemTP = diemTP;
        this.diemThi = diemThi;
        this.diemTB = diemTB;
        this.diemChu = diemChu;
    }

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

    public float getDiemTP() {
        return diemTP;
    }

    public void setDiemTP(float diemTP) {
        this.diemTP = diemTP;
    }

    public float getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(float diemThi) {
        this.diemThi = diemThi;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public String getDiemChu() {
        return diemChu;
    }

    public void setDiemChu(String diemChu) {
        this.diemChu = diemChu;
    }
    
    public float tinhDiemTB(){
        return (float)(diemTP*0.4 + diemThi*0.6);
    }
    
    public String tinhDiemChu(){
        if(diemTB >= 8.5){
            return "A";
        }
        else if(diemTB >= 7){
            return "B";
        }
        else if(diemTB >= 5.5){
            return "C";
        }
        else if(diemTB >= 4){
            return "D";
        }
        else{
            return "F";
        }
    }

    @Override
    public String toString() {
        return "QuanLyDiemThi{" + "maSV=" + maSV + ", tenSV=" + tenSV + ", diemTP=" + diemTP + ", diemThi=" + diemThi + ", diemTB=" + diemTB + ", diemChu=" + diemChu + '}';
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btl_java_n9.entity;

import java.io.Serializable;

/**
 *
 * @author 0961011310
 */
public class PhanHoi implements  Serializable{
    private  String nguoiGui;
    private String nguoiNhan;
    private String ngayGui;
    private String noiDung;
    public String getNguoiGui() {
        return nguoiGui;
    }

    public String getNguoiNhan() {
        return nguoiNhan;
    }

    public String getNgayGui() {
        return ngayGui;
    }

    public void setNguoiGui(String nguoiGui) {
        this.nguoiGui = nguoiGui;
    }

    public void setNguoiNhan(String nguoiNhan) {
        this.nguoiNhan = nguoiNhan;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNgayGui(String ngayGui) {
        this.ngayGui = ngayGui;
    }

    public PhanHoi() {
    }

    public PhanHoi(String nguoiGui, String nguoiNhan, String ngayGui, String noiDung) {
        this.nguoiGui = nguoiGui;
        this.nguoiNhan = nguoiNhan;
        this.ngayGui = ngayGui;
        this.noiDung = noiDung;
    }

}

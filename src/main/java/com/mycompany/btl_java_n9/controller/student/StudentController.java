/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btl_java_n9.controller.student;

import com.mycompany.btl_java_n9.entity.SinhVien_HoSo;
import com.mycompany.btl_java_n9.view.DangNhap;

/**
 *
 * @author 0961011310
 */
public class StudentController {
    public SinhVien_HoSo getSinhVien(){
        return DangNhap.sv;
    }
}

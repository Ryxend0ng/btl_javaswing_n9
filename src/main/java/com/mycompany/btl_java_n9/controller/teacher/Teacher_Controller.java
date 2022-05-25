/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btl_java_n9.controller.teacher;

import com.mycompany.btl_java_n9.data_acess.SinhVien_AdminDTA;
import com.mycompany.btl_java_n9.data_acess.SinhVien_TeacherDTA;
import com.mycompany.btl_java_n9.entity.QuanLySV;
import com.mycompany.btl_java_n9.entity.SinhVien_HoSo;
import java.util.ArrayList;

public class Teacher_Controller {
// Khởi tạo các danh sách QuanLySV, SinhVien_HoSo, maSVTeacher và maSVAdmin
    ArrayList<QuanLySV> list = new ArrayList<>();
    ArrayList<QuanLySV> list1 = new ArrayList<>();
    ArrayList<SinhVien_HoSo> ls = new ArrayList<>();
    ArrayList<String> listMaSVTeacher = new ArrayList<>();
    ArrayList<String> listMaSVAdmin = new ArrayList<>();

// Hàm chuyển dữ liệu từ file SinhVien_HoSo.dat của admin sang file QuanLySV.dat của teacher
    public void chuyenDuLieu(){
// Khởi tạo new file SinhVien_AdminDTA và SinhVien_TeacherDTA
        SinhVien_AdminDTA sinhvienadmindta = new SinhVien_AdminDTA();
        SinhVien_TeacherDTA sinhvienteacherdta = new SinhVien_TeacherDTA();
// Gán ls và list1 lần lượt bằng dữ liệu trong file SinhVien_HoSo.dat và QuanLySV.dat
        ls = sinhvienadmindta.docfile();
        list1 = sinhvienteacherdta.docFile();
// Nếu file QuanLySV.dat chưa có hoặc có rồi nhưng chưa có dữ liệu thì chạy các câu lệnh ở dưới
        if(list1 == null && ls != null){
// Duyệt danh sách sinh viên do admin quản lí, lấy maSV và tenSV thêm vào danh sách sinh viên do giáo viên quản lí
            for(SinhVien_HoSo sv : ls){
                list.add(new QuanLySV(sv.getMasv(), sv.getHoten()));
            }
        }
// Nếu file QuanLySV.dat đã có dữ liệu
        else{
// Lấy maSV từ danh sách sinh viên do giáo viên quản lí thêm vào danh sách maSVTeacher
            for(QuanLySV sv : list1){
                listMaSVTeacher.add(sv.getMaSV());
            }
// Lấy maSV từ danh sách sinh viên do admin quản lí thêm vào danh sách maSVAdmin
            for(SinhVien_HoSo sv : ls){
                listMaSVAdmin.add(sv.getMasv());
// Kiểm tra xem có sinh viên nào trong danh sách sv do admin quản lí mà chưa được thêm vào danh sách sv do giáo viên quản lí hay không(trường hợp admin thêm mới sinh viên)
                if(!listMaSVTeacher.contains(sv.getMasv())){
// Thêm sinh viên đó vào danh sách sv do giáo viên quản lí
                    list1.add(new QuanLySV(sv.getMasv(), sv.getHoten()));
                }
            }
// Kiểm tra xem có sinh viên nào trong danh sách sv do giáo viên quản lí mà không có trong danh sách sv do admin quản lí hay không(trường hợp admin xóa sinh viên)
            for(QuanLySV sv : list1){
if(!listMaSVAdmin.contains(sv.getMaSV())){
// Xóa sinh viên đó khỏi danh sách sv do giáo viên quản lí
                    list1.remove(sv);
                }
            }
// Gán danh sách sinh viên do giáo viên quản lí với danh sách sinh viên sau khi đã chỉnh sửa
            list = list1;
        }
// Ghi lại vào file QuanLySV.dat
        sinhvienteacherdta.ghiFile(list);
    }
}
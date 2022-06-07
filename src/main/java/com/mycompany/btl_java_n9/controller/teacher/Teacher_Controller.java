/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btl_java_n9.controller.teacher;

import com.mycompany.btl_java_n9.data_acess.SinhVien_AdminDTA;
import com.mycompany.btl_java_n9.data_acess.SinhVien_TeacherDTA;
import com.mycompany.btl_java_n9.entity.QuanLySV;
import com.mycompany.btl_java_n9.entity.QuanLyDiemThi;
import com.mycompany.btl_java_n9.entity.SinhVien_HoSo;
import java.util.ArrayList;

public class Teacher_Controller {
// Khởi tạo các danh sách QuanLySV, SinhVien_HoSo, maSVTeacher và maSVAdmin
    ArrayList<QuanLySV> list = new ArrayList<>();
    ArrayList<QuanLySV> list1 = new ArrayList<>();
    ArrayList<QuanLyDiemThi> listDiemThi = new ArrayList<>();
    ArrayList<QuanLyDiemThi> listDiemThi1 = new ArrayList<>();
    ArrayList<SinhVien_HoSo> ls = new ArrayList<>();
    ArrayList<String> listMaSVTeacher = new ArrayList<>();
    ArrayList<String> listMaSVDiemTP = new ArrayList<>();
    ArrayList<String> listMaSVDiemThi = new ArrayList<>();
    ArrayList<String> listMaSVAdmin = new ArrayList<>();

// Hàm chuyển dữ liệu từ file SinhVien_HoSo.dat của admin sang file QuanLySV.dat của teacher
    public void chuyenDuLieuSV_DiemTP(){
// Khởi tạo new file SinhVien_AdminDTA và SinhVien_TeacherDTA
        SinhVien_AdminDTA sinhvienadmindta = new SinhVien_AdminDTA();
        SinhVien_TeacherDTA sinhvienteacherdta = new SinhVien_TeacherDTA();
// Gán ls và list1 lần lượt bằng dữ liệu trong file SinhVien_HoSo.dat và QuanLySV.dat
        ls = sinhvienadmindta.docfile();
        list1 = sinhvienteacherdta.docFileQuanLySV();
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
            for(int i=0; i< list1.size(); i++){
                if(!listMaSVAdmin.contains(list1.get(i).getMaSV())){
// Xóa sinh viên đó khỏi danh sách sv do giáo viên quản lí
                    list1.remove(list1.get(i));
                }
            }
// Gán danh sách sinh viên do giáo viên quản lí với danh sách sinh viên sau khi đã chỉnh sửa
            list = list1;
// Ghi lại vào file QuanLySV.dat
        sinhvienteacherdta.ghiFileQuanLySV(list);
        }
    }
    
// Hàm chuyển dữ liệu từ file SinhVien_HoSo.dat của admin sang file QuanLySV.dat của teacher
    public void chuyenDuLieuDiemTP_DiemThi(){
        ArrayList<QuanLyDiemThi> listDiemThi2 = new ArrayList<>();
// Khởi tạo new file SinhVien_TeacherDTA
        SinhVien_TeacherDTA sinhvienteacherdta = new SinhVien_TeacherDTA();
// Gán list1 và listDiemThi lần lượt bằng dữ liệu trong file QuanLySV.dat và QuanLyDiemThi.dat
        list1 = sinhvienteacherdta.docFileQuanLySV();
        listDiemThi1 = sinhvienteacherdta.docFileQuanLyDiemThi();
// Nếu file QuanLyDiemThi.dat chưa có hoặc có rồi nhưng chưa có dữ liệu thì chạy các câu lệnh ở dưới
        if(listDiemThi1 == null && list1 != null){
// Duyệt danh sách sinh viên do admin quản lí, lấy maSV và tenSV thêm vào danh sách sinh viên do giáo viên quản lí
            for(QuanLySV sv : list1){
                if(sv.isTrangThai()){
                    listDiemThi.add(new QuanLyDiemThi(sv.getMaSV(), sv.getTenSV(), Math.round((sv.getDiem1() + sv.getDiem1())/2)));
                }
            }
        }
// Nếu file QuanLyDiemThi.dat đã có dữ liệu
        else{
// Lấy maSV từ danh sách diem thi do giáo viên quản lí thêm vào danh sách maSVTeacher
            for(QuanLyDiemThi sv : listDiemThi1){
                listMaSVDiemThi.add(sv.getMaSV());
            }
// Lấy maSV từ danh sách diem thành phần do admin quản lí thêm vào danh sách maSVAdmin
            for(QuanLySV sv : list1){
                listMaSVDiemTP.add(sv.getMaSV());
// Kiểm tra xem có sinh viên nào trong danh sách diem thành phần mà chưa được thêm vào danh sách điểm thi hay không(trường hợp admin thêm mới sinh viên)
                if(!listMaSVDiemThi.contains(sv.getMaSV()) && sv.isTrangThai()){
// Thêm sinh viên đó vào danh sách sv do giáo viên quản lí
                    listDiemThi1.add(new QuanLyDiemThi(sv.getMaSV(), sv.getTenSV(), Math.round((sv.getDiem1() + sv.getDiem1())/2)));
                }
            }
// Kiểm tra xem có sinh viên nào trong danh sách sv do giáo viên quản lí mà không có trong danh sách sv do admin quản lí hay không(trường hợp admin xóa sinh viên)
            for(QuanLyDiemThi sv : listDiemThi1){
                if(!listMaSVDiemTP.contains(sv.getMaSV())){
// Xóa sinh viên đó khỏi danh sách sv do giáo viên quản lí
                    listDiemThi1.remove(sv);
                }
            }
            if(list1 != null && listDiemThi1 != null){
                for(QuanLySV sv : list1){
                    for(QuanLyDiemThi svDiemThi : listDiemThi1){
                        if(sv.getMaSV().equals(svDiemThi.getMaSV()) && Math.round((sv.getDiem1() + sv.getDiem1())/2) != svDiemThi.getDiemTP()){
                            svDiemThi.setDiemTP(Math.round((sv.getDiem1() + sv.getDiem1())/2));
                        }
                        if(sv.getMaSV().equals(svDiemThi.getMaSV()) && !sv.isTrangThai()){
                            listDiemThi2.add(svDiemThi);
                        }
                    }
                }
            }
            for(QuanLyDiemThi sv1 : listDiemThi2){
                if(listDiemThi1.contains(sv1)){
                    listDiemThi1.remove(sv1);
                }
            }
            listDiemThi = listDiemThi1;
        }
        // Ghi lại vào file QuanLyDiemThi.dat
        sinhvienteacherdta.ghiFileQuanLyDiemThi(listDiemThi);
    }
}



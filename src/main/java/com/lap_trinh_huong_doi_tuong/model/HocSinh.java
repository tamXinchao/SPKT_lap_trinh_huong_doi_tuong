package com.lap_trinh_huong_doi_tuong.model;

import java.util.Scanner;

public class HocSinh {
    public String HoTen;
    public String MSSV;
    public String Lop;
    public Float DiemTrungBinh;
    public Integer NamSinh;

    public HocSinh(String HoTen, String MSSV, String Lop, Float DiemTrungBinh, Integer NamSinh) {
        this.HoTen = HoTen;
        this.MSSV = MSSV;
        this.Lop = Lop;
        this.DiemTrungBinh = DiemTrungBinh;
        this.NamSinh = NamSinh;
    }
    public HocSinh() {}

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String lop) {
        Lop = lop;
    }

    public Float getDiemTrungBinh() {
        return DiemTrungBinh;
    }

    public void setDiemTrungBinh(Float diemTrungBinh) {
        DiemTrungBinh = diemTrungBinh;
    }

    public Integer getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(Integer namSinh) {
        NamSinh = namSinh;
    }
    public static HocSinh NhapThongTin(){
        Scanner sc = new Scanner(System.in);
        var newHocSinh = new HocSinh();
        System.out.print("Nhap họ tên: ");
        newHocSinh.setHoTen(sc.next());
        System.out.print("Nhap MSSV: ");
        newHocSinh.setMSSV(sc.next());
        System.out.print("Nhap lớp: ");
        newHocSinh.setLop(sc.next());
        System.out.print("Nhap điểm trung bình: ");
        newHocSinh.setDiemTrungBinh(sc.nextFloat());
        System.out.print("Nhap năm sinh: ");
        newHocSinh.setNamSinh(sc.nextInt());
        return newHocSinh;
    }
    public String InThongTinSinhVien() {
        String thongTin = "";
        thongTin += "Họ và tên: " + this.getHoTen() + "\n";
        thongTin += "MSSV: " + this.getMSSV() + "\n";
        thongTin += "Lớp: " + this.getLop() + "\n";
        thongTin += "Điểm trung bình: " + this.getDiemTrungBinh() + "\n";
        thongTin += "Năm sinh: " + this.getNamSinh() + "\n";
        return thongTin;
    }

}

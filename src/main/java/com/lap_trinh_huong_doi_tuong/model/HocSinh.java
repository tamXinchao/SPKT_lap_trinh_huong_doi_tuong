package com.lap_trinh_huong_doi_tuong.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
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
    private String XepLoai() {
        if (this.DiemTrungBinh < 5) {
            return "Yếu";
        } else if (this.DiemTrungBinh <= 7) {
            return "Khá";
        } else {
            return "Giỏi";
        }
    }
    public static ArrayList<HocSinh> XepLoai(ArrayList<HocSinh> ds) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn loại cần lọc:");
        System.out.println("1. Yếu");
        System.out.println("2. Khá");
        System.out.println("3. Giỏi");
        System.out.print("Nhập lựa chọn (1-3): ");

        int choice = sc.nextInt();
        String loai = "";

        switch (choice) {
            case 1:
                loai = "Yếu";
                break;
            case 2:
                loai = "Khá";
                break;
            case 3:
                loai = "Giỏi";
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                return new ArrayList<>(); // trả về rỗng nếu sai
        }

        ArrayList<HocSinh> ketQua = new ArrayList<>();
        for (HocSinh hs : ds) {
            if (hs.XepLoai().equalsIgnoreCase(loai)) {
                ketQua.add(hs);
            }
        }
        System.out.println("\n===== DANH SÁCH HỌC SINH " + loai.toUpperCase() + " =====");
        if (ketQua.isEmpty()) {
            System.out.println("⚠️ Không có sinh viên nào thuộc loại " + loai + ".");
        } else {
            for (HocSinh hs : ketQua) {
                System.out.println(hs.InThongTinSinhVien());
            }
        }
        return ketQua;
    }

    public static void DoiTen(ArrayList<HocSinh> hocSinhs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã số sinh viên: ");
        String mssv = sc.nextLine();

        boolean isTonTai = false;
        for(HocSinh hs : hocSinhs){
            if(hs.getMSSV().equalsIgnoreCase(mssv)){
                System.out.println("✅ Tìm thấy sinh viên:");
                System.out.println(hs.InThongTinSinhVien());

                System.out.println("Nhập tên mới: ");
                String tenMoi = sc.nextLine();

                hs.setHoTen(tenMoi);
                System.out.println("🎉 Đổi tên thành công!");
                System.out.println("Thông tin sau khi đổi:");
                System.out.println(hs.InThongTinSinhVien());
                isTonTai = true;
                break;
            }
        }
        if (!isTonTai) {
            System.out.println("❌ Không tìm thấy sinh viên có MSSV = " + mssv);
        }
    }
}

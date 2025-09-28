package com.lap_trinh_huong_doi_tuong;

import com.lap_trinh_huong_doi_tuong.model.HocSinh;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Scanner;

@SpringBootApplication
public class LapTrinhHuongDoiTuongApplication {

	public static void main(String[] args) {
		ArrayList<HocSinh> danhSach = new ArrayList<>();
		danhSach.add(new HocSinh("Nguyen Van A", "SV001", "CTK42", 4.2f, 2002));
		danhSach.add(new HocSinh("Tran Thi B", "SV002", "CTK43", 5.8f, 2001));
		danhSach.add(new HocSinh("Le Van C", "SV003", "CTK42", 7.0f, 2003));
		danhSach.add(new HocSinh("Pham Van D", "SV004", "CTK44", 8.5f, 2002));
		danhSach.add(new HocSinh("Hoang Thi E", "SV005", "CTK43", 9.1f, 2000));

		// In thông tin tất cả sinh viên
		System.out.println("===== DANH SÁCH HỌC SINH =====");
		for (HocSinh hs : danhSach) {
			System.out.println(hs.InThongTinSinhVien());
		}

		Scanner sc = new Scanner(System.in);
		int choice;
		do{
			System.out.println("\n===== MENU CHỨC NĂNG =====");
			System.out.println("1. Xếp loại sinh viên");
			System.out.println("2. Đổi tên sinh viên");
			System.out.println("0. Thoát");
			System.out.print("👉 Nhập lựa chọn: ");
			choice = sc.nextInt();
			sc.nextLine(); // bỏ ký tự xuống dòng
			switch (choice) {
				case 1 -> {
					HocSinh.XepLoai(danhSach);
				}
				case 2 -> {
					HocSinh.DoiTen(danhSach);
				}
				case 0 -> System.out.println("👋 Thoát chương trình.");
				default -> System.out.println("❌ Lựa chọn không hợp lệ, vui lòng thử lại!");
			}
			}while(choice != 0);
	}

}

package com.lap_trinh_huong_doi_tuong;

import com.lap_trinh_huong_doi_tuong.model.HocSinh;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LapTrinhHuongDoiTuongApplication {

	public static void main(String[] args) {
		SpringApplication.run(LapTrinhHuongDoiTuongApplication.class, args
		);
		var newHocSinh = HocSinh.NhapThongTin();
		System.out.println("===== THÔNG TIN HỌC SINH =====");
		System.out.println(newHocSinh.InThongTinSinhVien());
	}

}

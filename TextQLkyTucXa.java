package tuan3;

import java.time.LocalDate;

public class TextQLkyTucXa {
	public static void main(String[] args) {
		Phongn ph =new Phongn("111", 11, true);
		try {
			SinhVienSV sv1 = new SinhVienSV("SV-1", "Trường", true, LocalDate.of(2003, 3, 26));
			SinhVienSV sv2 = new SinhVienSV("SV-2", "Linh", true, LocalDate.of(2003, 4, 26));
			SinhVienSV sv3 = new SinhVienSV("SV-3", "Trung", true, LocalDate.of(2000, 3, 28));
			SinhVienSV sv4 = new SinhVienSV("SV-4", "Anh", true, LocalDate.of(2000, 3, 28));
			SinhVienSV sv5 = new SinhVienSV("SV-5", "Khoa", true, LocalDate.of(2000, 3, 28));
			
			// Them sv
			ph.themSinhVien(sv1);
			System.out.println(sv1);
			ph.themSinhVien(sv2);
			System.out.println(sv2);
			ph.themSinhVien(sv3);
			System.out.println(sv3);
			System.out.println(ph.toString());
			ph.themSinhVien(sv4);
			ph.themSinhVien(sv5);
			
			// Tim sv
			System.out.println();
			System.out.println("Tim sv co ma SV-3: \n"+ph.timSinhVien("SV-3"));
			
			// Xoa sv
			System.out.println();
			System.out.println("Xoa sv co ma SV-3: \n");
			ph.xoaSinhVien("SV-3");
			System.out.println(ph.toString());
			
			// Sap xep
			System.out.println("Sap xep theo ten");
			ph.sapXepTheoTenSV();
			System.out.println(ph);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	}



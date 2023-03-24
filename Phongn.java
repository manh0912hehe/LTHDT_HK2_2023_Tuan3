package tuan3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Phongn {
	private String maPhong;
	private int count;
	private ArrayList<SinhVienSV> ds;
	private boolean loaiPhong;
	public Phongn(String maPhong, int count, boolean loaiPhong) {
		super();
		this.maPhong = maPhong;
		this.count = count;
		this.loaiPhong = loaiPhong;
		ds =new ArrayList<SinhVienSV>();
	};
	
	public String getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(String maPhong) throws Exception {
		
		if(!maPhong.trim().equals(""))
			this.maPhong = maPhong;
		else
			throw new Exception("lỗi đê trống!");
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public boolean isLoaiPhong() {
		return loaiPhong;
	}

	public void setLoaiPhong(boolean loaiPhong) {
		this.loaiPhong = loaiPhong;
	}

	public void DanhSachPhong() {
		
		ds =new ArrayList<SinhVienSV>();
	}
	public boolean themSinhVien (SinhVienSV sv) {
		if (this.count != -1 && this.loaiPhong == sv.isGioiTinh()) {
			this.ds.add(sv);
			this.count--;
			return true;
		}
		return false;
	}
	public SinhVienSV timSinhVien (String ma) {
		for (int i = this.count; i < this.ds.size(); i++) {
			if (this.ds.get(i).getMaSV().equals(ma)) {
				return this.ds.get(i);
			}
		}
		return null;
	}
	public void xoaSinhVien (String maSV) {
		for (int i = this.count; i< ds.size(); i++) {
			if (this.ds.get(i).getMaSV().equals(maSV.trim())) {
				for (int j = i; j > this.count; j--) {
					ds.get(j);
				}
				this.count++;
				return;
			}
		}
	}
	public void sapXepTheoTenSV() {
		Collections.sort(ds,new Comparator<SinhVienSV>() {

		
			public int compare(SinhVienSV o1, SinhVienSV o2) {
		
				return o1.getMaSV().compareTo(o2.getMaSV());
			}

			
			
		});
	
		
	}
	public SinhVienSV timSinhVienTuoiLN () {
		SinhVienSV max = this.ds.get(count-1);
		for (SinhVienSV sv: ds) {
			if (sv.getNgaySinh().isBefore(max.getNgaySinh())) {
				max = sv;
			}
		}
		return max;
	}
	public String toString() {
		String s= "Danh Sách Phòng";
		for (int i=0;i<ds.size();i++)
			s+="\n"+ds.get(i);
		return s;
	}
}

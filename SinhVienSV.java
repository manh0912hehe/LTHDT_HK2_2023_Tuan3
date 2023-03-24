package tuan3;


import java.time.LocalDate;

public class SinhVienSV {
	private String maSV;
	private String tenSV;
	private boolean gioiTinh;
	private LocalDate ngaySinh;
	public SinhVienSV() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SinhVienSV(String maSV, String tenSV, boolean gioiTinh, LocalDate ngaySinh) throws Exception {
		super();
		setTenSV(tenSV);
		setMaSV(maSV);
		setNgaySinh(ngaySinh);
		setGioiTinh(gioiTinh);
	}
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) throws Exception {
		if(!maSV.trim().equals(""))
			this.maSV = maSV;
		else
			throw new Exception("lỗi đê trống!");
	}
	public String getTenSV() {
		return tenSV;
	}
	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	public boolean isGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public LocalDate getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	@Override
	public String toString() {
		return String.format("%-10s %-10s %-10s %-10s ",maSV,tenSV,gioiTinh ?"Nam":"Nu",ngaySinh);
	}
	
	
	
}

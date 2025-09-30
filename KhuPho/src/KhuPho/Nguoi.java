package KhuPho;

import java.util.Calendar;

public class Nguoi {
	private String cCCD;
	private String hoTen;
	private int namSinh;
	private String ngheNghiep;
	public Nguoi(String cCCD, String hoTen, int namSinh, String congViec) {
		super();
		this.cCCD = cCCD;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.ngheNghiep = ngheNghiep;
	}
	public String getcCCD() {
		return cCCD;
	}
	public String getHoTen() {
		return hoTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public String getngheNghiep() {
		return ngheNghiep;
	}
	
	public int getTuoi() {
		int namHienTai = Calendar.getInstance().get(Calendar.YEAR);
		return namHienTai - namSinh;
	}
	
	public void hienThiThongTin() {
		System.out.println("Số CCCD: "+cCCD+", Họ tên: "+hoTen+", Năm sinh: "+namSinh+", Nghề nghiệp: "+ngheNghiep);
	}
}

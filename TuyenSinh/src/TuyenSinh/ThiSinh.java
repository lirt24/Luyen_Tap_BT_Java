package TuyenSinh;

public abstract class ThiSinh {
	private long sBD;
	private String hoTen;
	private String diaChi;
	private String uuTien;
	
	public ThiSinh(long sBD, String hoTen, String diaChi, String uuTien) {
		super();
		this.sBD = sBD;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.uuTien = uuTien;
	}
	public long getsBD() {
		return sBD;
	}
	
	public String getHoTen() {
		return hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public String getUuTien() {
		return uuTien;
	}
	
	public abstract String getKhoiThi();
	
	public void hienThiThongTin() {
		System.out.println("SBD: "+ sBD+ "| Họ và tên: "+hoTen+ "| Địa chỉ: "+ diaChi+ "| Diện ưu tiên khu vực: "+uuTien);
	}
}

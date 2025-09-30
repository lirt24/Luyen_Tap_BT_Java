package TaiLieu;

public abstract class TaiLieu {
	protected String MaTL;
	protected String TenNSX;
	protected int SLPhatHanh;
	
	public TaiLieu(String maTL, String tenNSX, int sLPhatHanh) {
		super();
		MaTL = maTL;
		TenNSX = tenNSX;
		SLPhatHanh = sLPhatHanh;
	}
	
	public String getMaTL() {
		return MaTL;
	}
	
	public abstract void hienThi();


}

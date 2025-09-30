package TuyenSinh;

public class KhoiC extends ThiSinh {

	public final String monThi = "Văn, Sử, Địa";
	
	public KhoiC(long sBD, String hoTen, String diaChi, String uuTien) {
		super(sBD, hoTen, diaChi, uuTien);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String getKhoiThi() {
		// TODO Auto-generated method stub
		return "B ( "+ monThi+ " )"; 
	}

}

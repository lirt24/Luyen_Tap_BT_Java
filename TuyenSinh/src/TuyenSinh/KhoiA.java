package TuyenSinh;

public class KhoiA extends ThiSinh {

	public final String monThi = "Toán, Lý, Hóa";
	
	public KhoiA(long sBD, String hoTen, String diaChi, String uuTien) {
		super(sBD, hoTen, diaChi, uuTien);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String getKhoiThi() {
		// TODO Auto-generated method stub
		return "A ( "+ monThi+ " )"; 
	}

}

package TuyenSinh;

public class KhoiB extends ThiSinh {

	public final String monThi = "Toán, Hoá, Sinh";
	
	public KhoiB(long sBD, String hoTen, String diaChi, String uuTien) {
		super(sBD, hoTen, diaChi, uuTien);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String getKhoiThi() {
		// TODO Auto-generated method stub
		return "B ( "+ monThi+ " )"; 
	}

}

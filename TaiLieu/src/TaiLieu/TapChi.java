package TaiLieu;

public class TapChi extends TaiLieu {

	private int soPhatHanh;
	private int thangPhatHanh;
	
	public TapChi(String maTL, String tenNSX, int sLPhatHanh) {
		super(maTL, tenNSX, sLPhatHanh);
		// TODO Auto-generated constructor stub
	}

	public TapChi(String maTL, String tenNSX, int sLPhatHanh, int soPhatHanh, int thangPhatHanh) {
		super(maTL, tenNSX, sLPhatHanh);
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}

	@Override
	public void hienThi() {
		// TODO Auto-generated method stub
		System.out.println("[Tạp Chí] Mã Tài liệu: "+MaTL+", Nhà Xuất bản: "+ TenNSX+", Số Lượng Phát Hành: "+ SLPhatHanh+", Số phát hành: "+soPhatHanh+", Tháng Phát Hành: "+thangPhatHanh);

	}

}

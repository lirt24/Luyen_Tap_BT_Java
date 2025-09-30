package TaiLieu;

public class Bao extends TaiLieu {
	
	private String ngayPhatHanh;

	public Bao(String maTL, String tenNSX, int sLPhatHanh) {
		super(maTL, tenNSX, sLPhatHanh);
		// TODO Auto-generated constructor stub
	}

	public Bao(String maTL, String tenNSX, int sLPhatHanh, String ngayPhatHanh) {
		super(maTL, tenNSX, sLPhatHanh);
		this.ngayPhatHanh = ngayPhatHanh;
	}

	@Override
	public void hienThi() {
		// TODO Auto-generated method stub
		System.out.println("[Sách] Mã Tài liệu: "+MaTL+", Nhà Xuất bản: "+ TenNSX+", Số Lượng Phát Hành: "+ SLPhatHanh+", Ngày phát hành: "+ngayPhatHanh );

	}

}

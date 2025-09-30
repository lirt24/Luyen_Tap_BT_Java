package TaiLieu;

public class Sach extends TaiLieu {

	private String tenTacGia;
	private int soTrang;
	
	public Sach(String maTL, String tenNSX, int sLPhatHanh) {
		super(maTL, tenNSX, sLPhatHanh);
		// TODO Auto-generated constructor stub
	}
	
	public Sach(String maTL, String tenNSX, int sLPhatHanh, String tenTacGia, int soTrang) {
		super(maTL, tenNSX, sLPhatHanh);
		this.tenTacGia = tenTacGia;
		this.soTrang = soTrang;
	}

	@Override
	public void hienThi() {
		// TODO Auto-generated method stub
		System.out.println("[Sách] Mã Tài liệu: "+MaTL+", Nhà Xuất bản: "+ TenNSX+", Số Lượng Phát Hành: "+ SLPhatHanh+", Tên Tác giả: "+tenTacGia+", Số trang: "+soTrang);
	}

}

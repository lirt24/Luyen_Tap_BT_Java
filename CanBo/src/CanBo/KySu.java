package CanBo;

public class KySu extends CanBo {
	private String nganhDaoTao;

	public KySu(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String nganhDaoTao) {
		super(hoTen, ngaySinh, gioiTinh, diaChi);
		this.nganhDaoTao = nganhDaoTao;
	}

	public String getNganhDaoTao() { return nganhDaoTao; }
	public void setNganhDaoTao(String nganhDaoTao) { this.nganhDaoTao = nganhDaoTao; }

	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Ngành đào tạo: " + nganhDaoTao);
	}
}

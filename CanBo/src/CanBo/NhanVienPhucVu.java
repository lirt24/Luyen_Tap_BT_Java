package CanBo;

public class NhanVienPhucVu extends CanBo {
private String congViec;

public NhanVienPhucVu(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String congViec) {
 super(hoTen, ngaySinh, gioiTinh, diaChi);
 this.congViec = congViec;
}

public String getCongViec() { return congViec; }
public void setCongViec(String congViec) { this.congViec = congViec; }

@Override
public void hienThiThongTin() {
 super.hienThiThongTin();
 System.out.println("Công việc: " + congViec);
 }
}

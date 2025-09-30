package TaiLieu;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach implements TimKiem {

	private ArrayList<TaiLieu> DSTaiLieu = new ArrayList<TaiLieu>();
	Scanner sc = new Scanner(System.in);
	
	public void nhapThongTin() {
		System.out.println("Chọn loại tài liệu (1.Sách, 2.Tạp chí, 3.Báo: ");
		int chosen = sc.nextInt();
		
		System.out.println("Nhập mã tài liệu: ");
		String maTL = sc.nextLine();
		System.out.println("Nhập tên nhà xuất bản: ");
		String tenNXB = sc.nextLine();
		System.out.println("Nhập số bản phát hành: ");
		int sLPhatHanh = sc.nextInt();
	
		switch(chosen) {
		case 1:
            System.out.print("Tên tác giả: ");
            String tenTacGia = sc.nextLine();
            System.out.print("Số trang: ");
            int soTrang = sc.nextInt();
            sc.nextLine();
            DSTaiLieu.add(new Sach(maTL, tenNXB, sLPhatHanh, tenTacGia, soTrang));
            break;
        case 2:
            System.out.print("Số phát hành: ");
            int soPH = sc.nextInt();
            System.out.print("Tháng phát hành: ");
            int thangPH = sc.nextInt(); sc.nextLine();
            DSTaiLieu.add(new TapChi(maTL, tenNXB, sLPhatHanh, soPH, thangPH));
            break;
        case 3:
            System.out.print("Ngày phát hành: ");
            String ngayPH = sc.nextLine();
            DSTaiLieu.add(new Bao(maTL, tenNXB, sLPhatHanh, ngayPH));
            break;
    }
}

    // Tìm theo loại
    @Override
    public void timTheoLoai(String loai) {
        for (TaiLieu t : DSTaiLieu) {
            if (t.getClass().getSimpleName().equalsIgnoreCase(loai)) {
                t.hienThi();
            }
        }
    }

    // Tìm theo mã
    @Override
    public void timTheoMa(String ma) {
        for (TaiLieu t : DSTaiLieu) {
            if (t.getMaTL().equalsIgnoreCase(ma)) {
                t.hienThi();
                return;
            }
        }
        System.out.println("Không tìm thấy tài liệu mã: " + ma);
    }

    // Hiển thị tất cả
    public void hienThiTatCa() {
        for (TaiLieu t : DSTaiLieu) {
            t.hienThi();
        }
    }
}


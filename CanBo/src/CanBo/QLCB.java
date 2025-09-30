package CanBo;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    private ArrayList<CanBo> danhSach = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // Nhập thông tin mới
    public void nhapCanBo() {
        System.out.println("Chọn loại cán bộ (1-Công nhân, 2-Kỹ sư, 3-Nhân viên): ");
        int chon = sc.nextInt();
        sc.nextLine(); // bỏ qua ký tự Enter

        System.out.print("Họ tên: ");
        String hoTen = sc.nextLine();
        System.out.print("Ngày sinh: ");
        String ngaySinh = sc.nextLine();
        System.out.print("Giới tính: ");
        String gioiTinh = sc.nextLine();
        System.out.print("Địa chỉ: ");
        String diaChi = sc.nextLine();

        switch (chon) {
            case 1:
                System.out.print("Bậc: ");
                int bac = sc.nextInt();
                sc.nextLine();
                danhSach.add(new CongNhan(hoTen, ngaySinh, gioiTinh, diaChi, bac));
                break;
            case 2:
                System.out.print("Ngành đào tạo: ");
                String nganh = sc.nextLine();
                danhSach.add(new KySu(hoTen, ngaySinh, gioiTinh, diaChi, nganh));
                break;
            case 3:
                System.out.print("Công việc: ");
                String cv = sc.nextLine();
                danhSach.add(new NhanVienPhucVu(hoTen, ngaySinh, gioiTinh, diaChi, cv));
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }
    }

    // Tìm kiếm theo họ tên
    public void timKiemTheoHoTen(String ten) {
        for (CanBo cb : danhSach) {
            if (cb.getHoTen().equalsIgnoreCase(ten)) {
                cb.hienThiThongTin();
                return;
            }
        }
        System.out.println("Không tìm thấy cán bộ tên: " + ten);
    }

    // Hiển thị tất cả
    public void hienThiTatCa() {
        for (CanBo cb : danhSach) {
            cb.hienThiThongTin();
            System.out.println("-------------------");
        }
    }
}

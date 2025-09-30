package TaiLieu;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Nhập tài liệu mới");
            System.out.println("2. Tìm theo loại (Sach/TapChi/Bao)");
            System.out.println("3. Tìm theo mã tài liệu");
            System.out.println("4. Hiển thị tất cả");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            int chon = sc.nextInt(); sc.nextLine();

            switch (chon) {
                case 1 -> ql.nhapThongTin();
                case 2 -> {
                    System.out.print("Nhập loại: ");
                    String loai = sc.nextLine();
                    ql.timTheoLoai(loai);
                }
                case 3 -> {
                    System.out.print("Nhập mã: ");
                    String ma = sc.nextLine();
                    ql.timTheoMa(ma);
                }
                case 4 -> ql.hienThiTatCa();
                case 5 -> { System.out.println("Kết thúc!"); return; }
                default -> System.out.println("Chọn sai!");
            }
        }
    }
}


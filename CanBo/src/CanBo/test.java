package CanBo;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        QLCB ql = new QLCB();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Nhập cán bộ mới");
            System.out.println("2. Tìm kiếm theo họ tên");
            System.out.println("3. Hiển thị tất cả cán bộ");
            System.out.println("4. Thoát");
            System.out.print("Chọn: ");
            int chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    ql.nhapCanBo();
                    break;
                case 2:
                    System.out.print("Nhập họ tên cần tìm: ");
                    String ten = sc.nextLine();
                    ql.timKiemTheoHoTen(ten);
                    break;
                case 3:
                    ql.hienThiTatCa();
                    break;
                case 4:
                    System.out.println("Thoát chương trình!");
                    return;
                default:
                    System.out.println("Chọn sai!");
            }
        }
    }
}


package TuyenSinh;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TuyenSinh ql = new TuyenSinh();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Nhập thí sinh mới");
            System.out.println("2. Hiển thị danh sách thí sinh");
            System.out.println("3. Tìm thí sinh theo SBD");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            int chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1: ql.nhapThongTin(); break;
                case 2: ql.hienThiDS(); break;
                case 3: 
                	long sbd = sc.nextLong();
                	ql.timKiemTheoSBD(sbd); 
                	break;
                case 0: System.out.println("Kết thúc!"); return;
                default: System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}

package PhanSo;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khai báo 2 phân số
        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();

        System.out.println("Nhập phân số thứ nhất:");
        ps1.nhapPS();

        System.out.println("Nhập phân số thứ hai:");
        ps2.nhapPS();

        // Xuất ra
        System.out.print("sp1 = "); ps1.hienThi();
        System.out.print("sp2 = "); ps2.hienThi();

        // Thực hiện các phép toán
        PhanSo psTong = ps1.cong(ps2);
        System.out.print("Tổng = "); psTong.hienThi();

        PhanSo spTru = ps1.tru(ps2);
        System.out.print("Hiệu = "); spTru.hienThi();

        PhanSo spNhan = ps1.nhan(ps2);
        System.out.print("Tích = "); spNhan.hienThi();

        PhanSo spChia = ps1.chia(ps2);
        System.out.print("Thương = "); spChia.hienThi();

        sc.close();
    }
}

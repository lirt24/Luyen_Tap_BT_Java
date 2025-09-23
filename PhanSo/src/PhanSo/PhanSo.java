package PhanSo;

import java.util.Scanner;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    // Constructor mặc định
    public PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1;
    }

    // Constructor có tham số
    public PhanSo(int tuSo, int mauSo) {
        if (mauSo == 0) {
            throw new IllegalArgumentException("Mẫu số không được bằng 0!");
        }
        this.tuSo = tuSo;
        this.mauSo = mauSo;
        rutGon();
    }

    // Nhập phân số
    public void nhapPS() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập tử số: ");
            this.tuSo = sc.nextInt();
            System.out.print("Nhập mẫu số: ");
            this.mauSo = sc.nextInt();
            if (this.mauSo == 0) {
                System.out.println("Mẫu số phải khác 0, nhập lại!");
            }
        } while (this.mauSo == 0);
        rutGon();
    }

    // Xuất phân số
    public void hienThi() {
        if (mauSo == 1) {
            System.out.println(tuSo);
        } else {
            System.out.println(tuSo + "/" + mauSo);
        }
    }

    // UCLN
    private int ucln(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    // Kiểm tra tối giản
    public boolean laToiGian() {
        return ucln(tuSo, mauSo) == 1;
    }

    // Rút gọn phân số
    public void rutGon() {
        int uc = ucln(tuSo, mauSo);
        tuSo /= uc;
        mauSo /= uc;
        if (mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
    }

    // Cộng
    public PhanSo cong(PhanSo ps) {
        int ts = this.tuSo * ps.mauSo + ps.tuSo * this.mauSo;
        int ms = this.mauSo * ps.mauSo;
        return new PhanSo(ts, ms);
    }

    // Trừ
    public PhanSo tru(PhanSo ps) {
        int ts = this.tuSo * ps.mauSo - ps.tuSo * this.mauSo;
        int ms = this.mauSo * ps.mauSo;
        return new PhanSo(ts, ms);
    }

    // Nhân
    public PhanSo nhan(PhanSo ps) {
        int ts = this.tuSo * ps.tuSo;
        int ms = this.mauSo * ps.mauSo;
        return new PhanSo(ts, ms);
    }

    // Chia
    public PhanSo chia(PhanSo ps) {
        if (ps.tuSo == 0) {
            throw new ArithmeticException("Không thể chia cho phân số có tử = 0");
        }
        int ts = this.tuSo * ps.mauSo;
        int ms = this.mauSo * ps.tuSo;
        return new PhanSo(ts, ms);
    }
}

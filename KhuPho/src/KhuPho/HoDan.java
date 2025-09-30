package KhuPho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HoDan {
	public final int soNha;
	private List<Nguoi> ThanhVien;
	
	public HoDan(int soNha) {
		this.soNha = soNha;
		ThanhVien = new ArrayList<>();
	}
	Scanner sc =new Scanner(System.in);
	
	public void nhapThongTin() {
		System.out.println("Nhập số thành viên của hộ dân: ");
		int soThanhVien = sc.nextInt();
		System.out.println("Nhập thông tin từng thành viên: ");
		for(int i = 1; i< soThanhVien;i++) {
			System.out.println("Thành viên "+i+":");
			System.out.println("Nhập CCCD: ");
			String cCCD = sc.nextLine();
			System.out.println("Nhập họ tên: ");
			String hoTen = sc.nextLine();
			System.out.println("Nhập năm sinh: ");
			int namSinh = sc.nextInt();
			System.out.println("Nhập nghề nghiệp: ");
			String ngheNghiep = sc.nextLine();
			
			ThanhVien.add(new Nguoi(cCCD,hoTen,namSinh,ngheNghiep));
		}
	}
	
	public void hienThiThongTin() {
		System.out.println("Số nhà: ");
		for(Nguoi ng : ThanhVien) {
			ng.hienThiThongTin();
		}
	}
	
	public boolean coNguoiTren80() {
		for(Nguoi ng:ThanhVien) {
			if(ng.getTuoi()>=80)
				return true;
		}
		return false;
	}
}

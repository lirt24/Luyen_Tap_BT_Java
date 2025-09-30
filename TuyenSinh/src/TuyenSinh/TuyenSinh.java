package TuyenSinh;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
	private ArrayList<ThiSinh> DSTuyenSinh = new ArrayList<ThiSinh>();
	Scanner sc = new Scanner(System.in);
	public void nhapThongTin() {
		System.out.println("Nhập SBD: ");
		long sbd = sc.nextLong();
		System.out.println("Nhập họ tên thí sinh: ");
		String hoTen = sc.nextLine();
		System.out.println("Nhập địa chỉ: ");
		String diaChi = sc.nextLine();
		System.out.println("Nhập diện ưu tiên khu vực");
		String uuTien = sc.nextLine();
		System.out.println("Nhập khối thi: ");
		String khoiThi = sc.nextLine().toUpperCase();
		
		ThiSinh ts = null;
		String chose = sc.nextLine();
		switch(chose) {
			case "A":
				ts = new KhoiA(sbd, hoTen, diaChi, uuTien);
				break;
			case "B":
				ts = new KhoiA(sbd, hoTen, diaChi, uuTien);
				break;
			case "C":
				ts = new KhoiA(sbd, hoTen, diaChi, uuTien);
				break;
			default:
				System.out.println("Khối thi không hợp lý");
				return;
		}
		DSTuyenSinh.add(ts);
		System.out.println("Thêm thí sinh thành công");
	}
	public void hienThiDS() {
		if(DSTuyenSinh.isEmpty()) {
			System.out.println("Danh sách trống");
		}
		else {
			for(ThiSinh ts : DSTuyenSinh) {
				ts.hienThiThongTin();
			}
		}
	}
	
	public void timKiemTheoSBD(long sbd) {
		for(ThiSinh ts : DSTuyenSinh) {
			if(ts.getsBD() == sbd) {
				ts.hienThiThongTin();
			}
		}
	}
}

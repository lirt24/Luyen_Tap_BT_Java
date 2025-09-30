package KhuPho;

import java.util.ArrayList;
import java.util.Scanner;

public class KhuPho {
	private ArrayList<HoDan> DSHoDan = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public void nhapDS() {
		System.out.println("Nhập số hộ dân: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Nhập số nhà: ");
			int soNha = sc.nextInt();
			HoDan hd = new HoDan(soNha);
			hd.nhapThongTin();
			DSHoDan.add(hd);
		}
	}
	
	public void hienThiNguoiTren80() {
		System.out.println("Danh sách hộ dân có người trên 80 tuổi:");
		boolean found=false;
		for(HoDan hd:DSHoDan) {
			if(hd.coNguoiTren80()) {
				hd.hienThiThongTin();
				found=true;
			}
		}
		if(found==false) {
			System.out.println("Không có hộ dân nào có người trên 80 tuổi");
		}
	}
}

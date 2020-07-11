package vn.t3h.ls4;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		NhanVien[] nv = new NhanVien[2];

		
		
		System.out.println("nhap vao thong tin cua tai xe");
		
		for(int i = 0; i< nv.length; i++) {
			System.out.print("loai xe grap : ");
			String loaiXe = sc.nextLine();
			System.out.print("ten nv grap : ");
			String ten = sc.nextLine();
			System.out.print("time chay : ");
			int time = sc.nextInt();

			Address add = new Address(loaiXe);
			NhanVien nv1 = new NhanVien(ten, time);
			nv1.setAddress(add);
			
			nv[i] = nv1;
			sc.nextLine();
		}
		
		System.out.println("thong tin nhan vien");
		for (NhanVien nv1: nv) {
			System.out.println("ten nv---->" + nv1.getTen() + "<---loai xe--->" + nv1.getAddress().getLoaiXe() +"<---luongcar--->" + nv1.luong()   );
		}

	}

}

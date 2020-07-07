package vn.t3h.ls3;
import java.util.Scanner;
public class BTVN2 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("nhap vao so ho dan: ");
			n = sc.nextInt();
		}while(n<=0);
		int[] arr = new int[n];
		System.out.println("nhap vao so dien cua tung ho dan");
		for(int i =0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("so dien cua tung ho dan lan luot la : ");
		for(int i = 0; i< n; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		System.out.println("so tien dien cua tung ho dan lan luot la: ");
		for(int i = 0; i < n; i++) {
			float a = tinhTienDien(arr[i]);
			System.out.print(a + "\t");
			
		}
	}
	
	public static float tinhTienDien(int n) {
		float tienDien = 1;
		if(n > 400) {
			tienDien = (float) (2.701*(n-300) + 2.615*100 + 2.340*100 + 1.857*100 + 1.600 * 50 + 1.549*50);
		}else if(n > 300) {
			tienDien = (float) (2.615*(n-300) + 2.340*100 + 1.857*100 + 1.600 * 50 + 1.549*50);
		}else if(n>200) {
			tienDien = (float) (2.340*(n-200) + 1.857*100 + 1.600 * 50 + 1.549*50);
		}else if(n>100) {
			tienDien = (float) (1.857*(n-100) + 1.600 * 50 + 1.549*50);
		}else if(n>50) {
			tienDien = (float) (1.600 * (n-50) + 1.549*50);
		}else {
				tienDien = (float) (1.549 * n);
			}
		
		return tienDien;
		
	}

}

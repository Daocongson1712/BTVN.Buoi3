packagepackage vn.t3h.ls3;
import java.util.Arrays;
import java.util.List;

import java.util.ArrayList;
public class BTVN1 {

	public static void main(String[] args) {
		chenGiaTri();
		xoaTrungNhau();
		
	}
	public static void chenGiaTri() {

		int[] arr = {90, 90, 20 ,27, 35, 2, 2, 10, 8, 8};
		int[] arr1 = new int[arr.length + 1];
		int j = 0;
		for(int i = 0; i < arr1.length; i++) {
			if(i != 2) {
				arr1[i] = arr[j];
				j++;
			}else {
				arr1[i] = 100;
			}
		}
		System.out.println("arr1: " + Arrays.toString(arr1));
	}
	
	public static void xoaTrungNhau() {
		int[] arr = {90, 90, 20 ,27, 35, 2, 2, 10, 8, 8};
		List<Integer> list = new ArrayList<Integer>();
		boolean dem = false;
		for(int i = 0; i < arr.length - 1; i++) {
			dem = false;
			for(int j = 0;i < arr.length; j++) {
				if(arr[i] == arr[j] && i != j) {
					dem = true;
					break;
				}
			}if(dem == false) {
				list.add(arr[i]);
			}
		}
		list.add(arr[arr.length - 1]);
		Integer[] arr1 = new Integer[list.size()];
		arr1 = list.toArray(arr1);
		System.out.println("arr1: " + Arrays.toString(arr1));
		}
	}


package vn.t3h.ls5;
import java.lang.System;
import java.util.ArrayList;
import java.util.LinkedList;


public class BTVN1_ls5 {

	public static void main(String[] args) {
		final long s1 = System.currentTimeMillis();
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		for(int i = 0; i <= 2000000; i++) {
			arr1.add(i);
		}
		int t1 = arr1.get(1000000);
		final long e1 = System.currentTimeMillis();
		final long s2 = System.currentTimeMillis();
		LinkedList<Integer> arr2 = new LinkedList<Integer>();
		for(int i = 0; i <= 2000000; i++) {
			arr2.add(i);
		}
		int t2 = arr2.get(1000000);
		final long e2 = System.currentTimeMillis();

		System.out.println("ArrayList time: " + (e1 - s1) + "  mili giây");
		System.out.println("LinkedList time: " + (e2 - s2) + "  mili giây");

	}

}

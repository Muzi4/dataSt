package week5;

import java.util.Iterator;

public class ArrayEx {

	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40, 50};
		int c[] = {1, 2, 3, 4, 5};
		int []b;
		a = c;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}

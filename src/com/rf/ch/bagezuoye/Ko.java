package com.rf.ch.bagezuoye;

public class Ko {
	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 5, 6 };
		int[] b = { 2, 4, 6, 8, 10 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.print(a[i] + " ");
				}
			}
		}
	}
}
package com.rf.ch.demo1;

public class DaA {

	
	public static void main(String[] args) {
	    int n = 5;
		showA2(n);
	}
	public static void showA2(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= 2 * n; j++) {
				if (i == n / 2 + n % 2 && i <= j && (i + j) <= 2 * n) {
					System.out.print("*");
				} else if (i == j || (i + j) == 2 * n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

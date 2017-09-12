package com.rf.ch.demo3;

import java.util.Scanner;

public class Lianxi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[] = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int a = 0; a < arr.length - 1; a++) {
				if (arr[a] > arr[a + 1]) {
					int temp = arr[a];
					arr[a] = arr[a + 1];
					arr[a + 1] = temp;
				}
			}
		}
		System.out.print("{");
		for (int b = 0; b < arr.length; b++) {
			if (b != arr.length - 1) {
				System.out.print(arr[b] + ",");
			} else {
				System.out.print(arr[b] + "}");
			}
		}
	}
}
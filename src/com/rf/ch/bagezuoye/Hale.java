package com.rf.ch.bagezuoye;

public class Hale {
public static void main(String[] args) {
	//封装方法：两种
	int [] ad = {1 , 2 , 3};
	int a = 2;
	Hale.halfsearch1(ad,a);
	
//	int b = 3;
//	Hale.half(b);
}

	public static void half(int b) {

	}

	public static int halfsearch1(int[] arr, int a) {
		int min, max, mid;
		min = 0;
		max = arr.length - 1;
		mid = (min + max) / 2;
		while (arr[mid] != a) {
			if (a > arr[mid]) {
				min = mid + 1;
			} else {
				max = mid - 1;
			}
			if (min > max) {
				return -1;
			}
			mid = (max + min) / 2;
		}
		return mid;
	}
}

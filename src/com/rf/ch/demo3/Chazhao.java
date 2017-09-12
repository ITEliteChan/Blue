package com.rf.ch.demo3;
public class Chazhao {
	public static void main(String[] args) {
		String str = "abcdefj";
		int a = 0;
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(Soi(2, arr));
	}

	// 查找
//	public static int Soi(int a, int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			if (a == arr[i]) {
//				return i;
//			}
//		}
//		return -1;
//	}
//}
//折半查找
	public static int Soi(int a, int[] arr) {
		int start, mid, end;
		start = 0;
		end = arr.length - 1;
		while (start <= end) {
			mid = (start + end) / 2;
			if (a > arr[mid]) {
				start = mid + 1;
			} else if (a < arr[mid]) {
				end = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}





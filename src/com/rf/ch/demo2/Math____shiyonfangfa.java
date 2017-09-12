package com.rf.ch.demo2;

import java.util.Arrays;
import java.util.Calendar;

public class Math____shiyonfangfa {

	public static void main(String[] args) {
		System.out.println("7和9较大者:" + Math.max(7, 9));//最大数
		System.out.println(Math.min(10, 11));//最小数
		System.out.println(Math.abs(-20));//绝对值
		System.out.println(Math.ceil(7.1));//返回第一个大于等于参数的整数
		System.out.println(Math.floor(2.9));//返回第一个小于等于参数的整数
		System.out.println(Math.rint(2.4));//返回最接近参数的整数
		app(2001,2);
		int a[] = { 51, 46, 20, 18, 65, 97, 82, 30, 77, 50 };
		mergeSort(a, 0, a.length - 1);
		System.out.println("排序结果：" + Arrays.toString(a));
	}
	//推算出二月时间
	public static void app(int a,int b){
		Calendar ca =Calendar.getInstance();
		ca.set(a, b,1);
		ca.add(Calendar.DAY_OF_MONTH,-1);
		System.out.println(ca.get(Calendar.DAY_OF_MONTH));
	}
//归并排序
		public static void merge(int[] a, int low, int mid, int high) {
			int[] temp = new int[high - low + 1];
			int i = low;// 左指针
			int j = mid + 1;// 右指针
			int k = 0;
			// 把较小的数先移到新数组中
			while (i <= mid && j <= high) {
				if (a[i] < a[j]) {
					temp[k++] = a[i++];
				} else {
					temp[k++] = a[j++];
				}
			}
			// 把左边剩余的数移入数组
			while (i <= mid) {
				temp[k++] = a[i++];
			}
			// 把右边边剩余的数移入数组
			while (j <= high) {
				temp[k++] = a[j++];
			}
			// 把新数组中的数覆盖a数组
			for (int k2 = 0; k2 < temp.length; k2++) {
				a[k2 + low] = temp[k2];
			}
		}

		public static void mergeSort(int[] a, int low, int high) {
			int mid = (low + high) / 2;
			if (low < high) {
				// 左边
				mergeSort(a, low, mid);
				// 右边
				mergeSort(a, mid + 1, high);
				// 左右归并合集
				merge(a, low, mid, high);
				System.out.println(Arrays.toString(a));

			}
		}
}

package com.rf.ch.bagezuoye;

import java.util.Arrays;

public class UnionDemo {
	public static void main(String[] args) {
		
		int[] arr = {1,1,1,11,1,2,1};
		int[] arr1 = {1,2,1,1,5,2,1};
		int[] arr2 = union(arr,arr1);
		System.out.println(Arrays.toString(arr2));
	}
	//并集
	public static int[] union(int[] arr1, int[] arr2){
		int[] newarr1 =removeRepeatItem(arr1);
		int[] newarr2 =removeRepeatItem(arr2);
		int[] newarr = new int[newarr1.length+newarr2.length];
		int index = 0;
		for(int a : newarr1){
			newarr[index++] = a;
		}
		for(int b : newarr2){
			newarr[index++] = b;
		}
		newarr = removeRepeatItem(newarr);
		return newarr;
	}
	
//	去重
	public static int[] removeRepeatItem(int[] arr) {
		int index = 0;
		for (int i = 0; i < arr.length - index; i++) {
			for (int j = i + 1; j < arr.length - index; j++) {
				if (arr[i] == arr[j]) {
					// 删除 j
					int temp = arr[arr.length - 1 - index];
					while (temp == arr[j] && (j < (arr.length - 1 - index))) {
						index++;
						temp = arr[arr.length - 1 - index];
					}
					arr[arr.length - 1 - index] = arr[j];
					arr[j] = temp;
					index++;
				}
			}
		}
		int[] arr2 = Arrays.copyOf(arr, arr.length - index);
		return arr2;
	}

	
	
}
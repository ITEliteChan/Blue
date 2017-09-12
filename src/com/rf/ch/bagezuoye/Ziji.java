package com.rf.ch.bagezuoye;

import java.util.Arrays;

public class Ziji {
public static void main(String[] args) {
	int[] arr1 = {1,1,2,2,3,3};
	System.out.println(arr1);
}
	public static void subArrays2(int[] arr) {
		int[] temp = new int[arr.length];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					
					temp[index++] = arr[i];//把相同的这个数赋值给新数组
					arr[i] = arr[arr.length - 1];//把相同的这个数移到最后
					arr = Arrays.copyOf(arr, arr.length - 1);//copy数组,删除最后一个数
					Arrays.sort(arr);//排序,干啥用的??
					i--;
					break;
				}
			}
			System.out.println("arr里面的元素: "+Arrays.toString(arr));
			System.out.println("temp里面的元素: "+Arrays.toString(temp));
		}
		System.out.println("子集： " + Arrays.toString(arr));
		temp = Arrays.copyOf(temp, index);
		if (temp.length > 0) {
			subArrays2(temp);
		}
	}
}

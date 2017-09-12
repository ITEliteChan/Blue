package com.rf.ch.demo1;

import java.util.Arrays;
import java.util.Scanner;

public class Paixu {
	public static void main (String[] args){
//	int[]arr1 = new int[4];
//	arr1[0]=9;
//	int[] arr = {30,20,6,8,100};
//	//冒泡排序
////	for(int i = 0;i<arr.length-1;i++){//控制比较次数
////		for(int a= 0;a<arr.length-1-i;a++){
////			if(arr[a]>arr[a+1]){
////				int temp = 0;
////				temp = arr[a];
////				arr[a] = arr[a+1];
////				arr[a+1] = temp;
////		}
////	}
////	}
//		System.out.println(Arrays.toString(arr));  
		
	//选择循环
//		int[]arr1 = new int[4];
//		arr1[0]=9;
//		int[] arr = {30,20,6,8,100};
//	for(int i = 0;i<arr.length-1;i++){
//		for(int a = i+1;a<arr.length;a++){
//			if(arr[i]>arr[a]){
//				int teap = 0;
//				teap = arr[a];
//				arr[a] = arr[i];
//				arr[i] = teap;
//			}
//		}
//	}System.out.println(Arrays.toString(arr));
		
		
//		int array6[] = { 3, 4, 2, 1, 5, 6, 9, 8, 7, 0 };
//		/**
//		 * 2 2,3,4
//		 */
//		for (int i = 1; i < array6.length; i++) {
//			int j = i; // i = 1 ; j = 1
//			int temp = array6[i];
//			while (j > 0 && temp < array6[j - 1]) {
//				int a = array6[j];
//				array6[j] = array6[j - 1]; // array6[2] = array6[1];
//				array6[j - 1] = a;
//				j--;
//			}
//			System.out.println("第" + i + "次移动后:");
//			for (int i1 = 0; i1 < array6.length; i1++) {
//				System.out.print("," + array6[i1]);
//			}
//			System.out.println();
//			array6[j] = temp;
//		}
//		System.out.println("array6 直接插入排序之后：");
//		for (int i = 0; i < array6.length; i++) {
//			System.out.println("array6[" + i + "] = " + array6[i]);
//		}
		//循环遍历：
		   int[] arr = {1,2,3,5};
		    System.out.print("{");
		    for(int i = 0;i < arr.length;i++){
		        if(i != arr.length-1){
		        	
		         System.out.print(arr[i]+",");
		        
		        }else{
		    
		        System.out.print(arr[i]+"}");   
		        
		        }
		    }   
//		System.out.println(Arrays.toString(arr));
	}
	}

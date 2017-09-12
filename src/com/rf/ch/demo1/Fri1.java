package com.rf.ch.demo1;

import java.util.Arrays;
import java.util.Scanner;

public class Fri1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				while(true){
					int  a =scanner.nextInt();
					System.out.println("第" + a + "个月共有" + function(a) + "兔子");
				}
	}
	public static int function(int a){
		  if(a == 1  ||a == 2){
			  return 1;
		  }else{
			  return function(a - 1) + function(a - 2);
		
	}		
		//数组
//		int[] app = {4,6,7,8,9};
//		System.out.println(app.length);
//		int[] app = {1,2,3,4};
//		for( int a =0; a < app.length; a++){
//			System.out.println(app[a]);
//		}
		//循环数组
//		int[]arr = {2,4,6,8};
////		System.out.println(Arrays.toString(arr));
//		System.out.print("{");
//		for(int a=0; a<arr.length;a++){
//			if(a == arr.length -1){
//				System.out.print(arr[a]);
//			}else{
//				System.out.print(arr[a]+",");
//			}
//		}
//		System.out.println("}");
//		System.out.println(app[0	]);
//		System.out.println(app[1]);
//		System.out.println(app[2]);
//		System.out.println(app[3]);
//		System.out.println(app[4]);
		  
//		int[] arr1 = new int[4];
//		arr1[0] = 9;
//		int []arr= {23,24,100,200,3,4};
//		int a = 0;
//		for(int i = 0; i<arr.length;i++){
//			if(a<arr[i]){
//				a = arr[i];
//			}
//		}
//		System.out.println(a);
	}
}
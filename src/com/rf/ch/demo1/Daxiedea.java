package com.rf.ch.demo1;

import java.util.Scanner;

public class Daxiedea{
	public static void main (String[] args){
		
//	function1();
//	
//}
//	public static void function1(){
//		for(int a = 1;a < 10 ;a++){
//			for(int b = 1;b<=a;b++){
//				System.out.print(b+"x"+a+"="+b*a+"\t");
//			}
//			System.out.println("\n");
//	}
		//大写A
//		while (true) {
//			System.out.println("请输入多少行");
//			Scanner scan = new Scanner(System.in);
//			int num = scan.nextInt();
//			for (int i = num; i > 0; i--) {
//				if (i == num) {
//					for (int a = 1; a <= i; a++) {
//						System.out.print(" ");
//					}
//					System.out.println("*");
//				} else {
//					for (int a = 1; a <= i; a++) {
//						System.out.print(" ");
//					}
//					System.out.print("*");
//					for (int c = 1; c <= 2 * (num - i) - 1; c++) {
//						if (i == num / 2 + num % 2) {
//							System.out.print("*");
//						} else {
//							System.out.print(" ");
//						}
//					}
//					System.out.println("*");
//				}
//			}
//		}

		for (int i = 8; i > 0; i--) {
			if (i == 8) {
				for (int a = 1; a <= i; a++) {
					System.out.print(" ");
				}
				System.out.println("*");
			} else {
				for (int a = 1; a <= i; a++) {//这个循环是第二排左边后面的空格和*号
					System.out.print(" ");
				}
				System.out.print("*");
				for (int c = 1; c <= 2 * (8 - i) - 1; c++) {
					if (i == 4) {
						System.out.print("*");
					} else {
						System.out.print(" ");//第二排两个*号之间的空格         
					}
				}
				System.out.println("*");//输出*号后返回第一步
			}
		}	
		
//		for (int i = 6; i > 0; i--) {
//			if (i == 6) {
//				for (int a = 1; a <= i; a++) {
//		i++	System.out.println("*");
//			} else {
//				for (int a = 1; a <= i; a++) {
//					System.out.print(" ");
//				}
//				System.out.print("*");
//				for (int c = 1; c <= 2 * (6 - i) - 1; c++) {
//					if (i == 3) {
//						System.out.print("*");
//					} else {
//						System.out.print(" ");
//					}
//				}
//				System.out.println("*");
//			}
		while(true) {
			System.out.println("请输入行数");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
		for(int i = num;i>0;i--) {
			if(i == num) {
				for(int a= 1;a<=i;a++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}else {
				for(int b = 1;b<=i;b++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for(int c =1 ;c<=2*(num-i)-1;c++) {
					if(i == 3) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println("*");
			}
		}
		}	
}
}
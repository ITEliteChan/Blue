package com.rf.ch.ATM;

import java.util.Scanner;

public class Yanghuisanjiao {
	
public static void main(String[] args) {
	
	System.out.println("请输入杨辉三角的行数");
//	Scanner sc = new Scanner(System.in);
//	int n = sc.nextInt();
	int n = 5;
	int[][] a= new int[n][n];;
	for (int i = 0; i < n; i++) {//数组下标是从0开始，因为这里需要给两条边全部赋值为1
		a[i][i] = 1;//左边的数
		a[i][0] = 1;//右边斜杠的数；
	}
	for (int i = 2; i < n; i++) {//这个循环是中间的数，而且杨辉三角的定律是本身的数等于上面两个数相加，一没有数相加
		for (int j = 1; j < i; j++) {//这个数指的是中间数2的角标；
			a[i][j] = a[i - 1][j - 1] + a[i - 1][j];//为中间的a[i][j]赋值  比如a[i][j]=2，a[i-1][j-1]=1 a[i-1][j]
		}
	}
	for (int i = 0; i < n; i++) {//打印数组：从0.0开始打印   i指的是左边的下标，J指的右边的下标，循环时j是重新赋值
		for (int j = 0; j <i+1 ; j++) {//外面的的for循环是看你打印了多少列，里面for循环是看你打印了多少行
			System.out.print("  " + a[i][j]);
		}
		System.out.println();
	}
}
}

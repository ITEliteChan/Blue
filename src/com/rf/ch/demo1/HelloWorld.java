package com.rf.ch.demo1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class HelloWorld {
public static void main(String[] args){
    /**
     * 块注释
     */
    
    //单行注释
    
    /*
     * 多行注释
     */
    
    //十进制转换为二进制，我们采用的是除余法(除数为2 取余数的方法）
    //二进制转换为十进制，采用的是根据二进制位，从右至左
    //相反数去二进制码，是他本身的二进制码 补码+1
    
        int a = (int)(Math.random()*7)+1;
    	System.out.println(a);
    	
    	float b = (float)1.1;
    	float b1 = 1.9f;
    	int a1=0;
    	a1 = (int)b1;
   	System.out.println(b1);
	
	
	
//		byte by = 127;
//		int a = 6;
//		int b = 5;
//		System.out.println(a > b ? true : false);
//		System.out.println("输入一个数字");
//		Scanner scanner = new Scanner(System.in);
//		int a = scanner.nextInt();
//		System.out.println("你输入的数字是水仙花数:" + a);
//		if (a > 99 && a < 1000) {
//			int a = b / 100;
//			int b = c / 1000;
//			System.out.println("是三位数");
//		} else {
//			System.out.println("不是三位数");
//		}
	
	
	
//①	输出方式: 
//	System.out.println("请输入一个三位数");
//	Scanner scanner= new Scanner(System.in);
//	int s = scanner.nextInt();
	
//	②输出方式:  
//	String str = JOptionPane.showInputDialog("请输入一个数：");
//	int s = Integer.parseInt(str);
	
	//百位
//	int a = s/100;
//	//十位
//	int b = (s/10)%10;
//	//个位
//	int c = s%10;
//	if(s > 99 && s<1000){
//		boolean bo = a*a*a + b*b*b + c*c*c ==s;
//		if(bo){
//			System.out.println("你输入的是"+s+"它是水仙花数" );
//		}else{
//			System.out.println("你输入的是"+s+"它不是水仙花数");
//		}
//	}else{
//		System.out.println("你输入的不是三位数！");
//	}

	
//	System.out.println("输入你的名字");
//	Scanner scanner =new Scanner(System.in);
//	String.name = scanner.next();
//
//    	int b  = 4;
//    	System.out.println("+b ="+(++b));
//	short a = 6;
//    	System.out.println("a++ ="+(a++));
//    	int b =5;
//    	System.out.println("--b="+(--b));
}
}
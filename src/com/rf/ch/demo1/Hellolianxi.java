package com.rf.ch.demo1;

import java.util.Arrays;
import java.util.Scanner;

public class Hellolianxi {
public static void main (String[] args){
//	Scanner scanner = new Scanner (System.in);
//	int a = scanner.nextInt();
//	if(a>=0 && a<=50){
//	}
//		if(a>10 && a<20){
//		}
//		System.out.println("你输入的数字为" +a+ "不正确");
//	{	
//	}
	
	//九九乘法表
//	for(int a = 9;a > 0;a--){//a赋值9，从9开始，a>0，表示区间在0到9之间，a--，表示执行一次减1；
//		
//		for(int b = 1;b <= a;b++){//b赋值1，从1开始，b<=a,表示区间一直在变化，每次执行b++，表示执行一次加1；
//			
//		System.out.print(a + "x" + b +"="+a*b+"\t");//("\t")代表字表符。
//	}
//	System.out.println();
//}
	  int[] arr = new int[8];

	    System.out.print("{");
	    for(int i = 0;i < arr.length;i++){
	        if(i != arr.length-1){
	        
	         System.out.print(arr[i]+",");
	        
	        }else{
	    
	        System.out.print(arr[i]+"}");   
	        
	        }
	    }    
	System.out.println(Arrays.toString(arr));
}
}
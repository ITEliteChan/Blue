package com.rf.ch.bagezuoye;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fanhui {
	public static void main(String[] args){
	Scanner scanner =new Scanner(System.in);
	System.out.println("输入两个数字:");
	int a = scanner.nextInt();
	int b = scanner.nextInt();
//	System.out.println(a>b?a:b);
	System.out.println(max(a,b));//调用方法。
	String[] arr = {"1","2","2","3","3"};
	delete(arr);
	}
	//返回较大值
	public static int max(int a,int b){
		return a>b?a:b;
	}
	//删除重复数组
	public static void delete(String[] de){
		List<String> li = new ArrayList<String>();
		for(String c:de){
			if(!li.contains(c)){
				li.add(c);
			}
		}
		System.out.println(li);
	}
}
	

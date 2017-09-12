package com.rf.ch.bagezuoye;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Sanjiao {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		char a = scan.next().charAt(0);
//		dabianxiao(a);
    kaigen(4,5);
//    System.out.println(kaigen(4,5));
//    
	}
	
	public static double kaigen(int a, int b) {
		double c = Math.pow(a, 2) + Math.pow(b, 2);
		double s = Math.sqrt(c);
		return s;
	}
	//字母转换大小写的另一种方法。
	public static void dabianxiao(char a){
		if(Character.isUpperCase(a)){//判断输入的字母，是否为大写
			System.out.println(Character.toLowerCase(a));//把大写字母转换为小写字母
		}else if(Character.isLowerCase(a)){
			System.out.println(Character.toUpperCase(a));
		}
	}
	
}

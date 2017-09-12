package com.rf.ch.demo4;

import java.util.Scanner;

public class Denglu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		System.out.println("请输入密码");
		int s = scanner.nextInt();
		if ("张三".equals(a) && s == 123) {
			System.out.println("登陆成功");
		} else {
			System.out.println("登陆失败");
		}
	}
}


//方法2
//    public static void main(String[] args){
//	Scanner scanner = new Scanner(System.in);
//	String a = scanner.next();
//	if ("张三".equals(a)) {
//		System.out.println("请输入密码");
//		int s = scanner.nextInt();
//		if (s == 123) {
//			System.out.println("你输入的密码正确");
//		} else {
//			System.out.println("你输入的密码错误");
//		}
//	} else {
//		System.out.println("此账号无效");
//	}	
//}
//	}

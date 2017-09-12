package com.rf.ch.demo1;

import java.util.Scanner;

import org.omg.PortableServer.ImplicitActivationPolicyValue;

public class Panduan {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int s = scanner.nextInt();
//		if (s >= 0 && s <= 100) {
//			if (s >= 90 && s <= 100) {
//				System.out.println("你输入的成绩为" + s + "该同学成绩优秀");
//			} else if (s <= 89 && s >= 70) {
//				System.out.println("你输入的成绩为" + s + "该同学成绩良好");
//			} else if(s <= 69 && s >= 60)
//				System.out.println("你输入的成绩为" +s+"该同学成绩合格");
//			}
//		System.out.println("你输入的不是合格成绩");
//			}
		Scanner scan = new Scanner (System.in);
		String str = scan.next();
		switch(str){
		case"A":System.out.println("你选择的是A等");break;
		case"B":System.out.println("你选择的是B等");break;
		case"C":System.out.println("你选择的是C等");break;
		case"D":System.out.println("你选择的是D等");break;
		default:
			System.out.println("没有选项");
			break;
		}
	}
}
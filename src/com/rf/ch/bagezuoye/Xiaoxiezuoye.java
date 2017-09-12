package com.rf.ch.bagezuoye;

import java.util.Scanner;

public class Xiaoxiezuoye {
public static void main(String[] args){
//	Scanner scanner =new Scanner(System.in);
//	String a = scanner.next();
//	char b = a.charAt(0);
//	int c =(int)b;
//	if(b>=65&&b<=90){
//		System.out.println((char)(b + 32));
//}
//	else if(b>=97&&b<=122){
//		System.out.println((char)(b -32));
//	}
	Scanner scanner = new Scanner(System.in);
	String a = scanner.next();
	char b = a.charAt(0);
	int c = (int)b;
	if(b>=65&&b<=90){
		System.out.println((char)(b+32));
	}else if(b>=97 && b<=122){
		System.out.println((char)(b-32));
	}
	
}
}


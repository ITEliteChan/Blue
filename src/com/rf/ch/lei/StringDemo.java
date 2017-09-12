package com.rf.ch.lei;

import java.io.UnsupportedEncodingException;

public class StringDemo {

	public static void main(String[] args) {
		String str = "a,b,c,d,e,f";
		//切割字符串
//		String[] strs = str.split(",");
//		for(String s:strs) {
//			System.out.println(s);
//		}
		
		String newstr = str.substring(2);//获取新的字符串，从二开始
		String newstr1 = str.substring(2,5);
		System.out.println(newstr);
		System.out.println(newstr1);
		System.out.println(str.concat(",h,q"));//字符串拼接,concat将指定字符连接到字符串的结尾
		
		
		String str1 = "张三";
		try {
			byte[] by = str1.getBytes("UTF-8");
			System.out.println(new String(by,0,3));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package com.rf.ch.lei;

import java.io.UnsupportedEncodingException;

public class StringDemo {

	public static void main(String[] args) {
		String str = "a,b,c,d,e,f";
		//�и��ַ���
//		String[] strs = str.split(",");
//		for(String s:strs) {
//			System.out.println(s);
//		}
		
		String newstr = str.substring(2);//��ȡ�µ��ַ������Ӷ���ʼ
		String newstr1 = str.substring(2,5);
		System.out.println(newstr);
		System.out.println(newstr1);
		System.out.println(str.concat(",h,q"));//�ַ���ƴ��,concat��ָ���ַ����ӵ��ַ����Ľ�β
		
		
		String str1 = "����";
		try {
			byte[] by = str1.getBytes("UTF-8");
			System.out.println(new String(by,0,3));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

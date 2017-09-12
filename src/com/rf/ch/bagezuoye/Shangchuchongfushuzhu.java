package com.rf.ch.bagezuoye;

import java.util.ArrayList;
import java.util.List;

public class Shangchuchongfushuzhu {
	public static void main(String[] args) {
//		String[] a = { "1", "1", "2", "2","3", "4"};
//		List<String> b = new ArrayList<String>();
//		for (String c : a) {
//			if (!b.contains(c)) {
//				b.add(c);
//			}
//		}
//		System.out.println(b);
		String[] arr={ "1", "1","2","2","3","3","5"};
		shanchu(arr);
	}

//	public static void shanchu(String[] a) {
//		List<String> b = new ArrayList<String>();
//		for (String c : a) {
//			if (!b.contains(c)) {
//				b.add(c);
//			}
//		}
//		System.out.println(b);
//	}
	public static void shanchu(String[] a){
		List<String> b =new ArrayList<String>();
		for(String c : a){
			if(!b.contains(c)){
				b.add(c);
			}
		}
		System.out.println(b);
	}
	
	
	
}
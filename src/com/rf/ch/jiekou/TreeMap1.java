package com.rf.ch.jiekou;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		TreeMap<String,String> tm = new TreeMap<String,String>();
		tm.put("05", "zahngsnan03");
		tm.put("02", "zahngsnan03");
		tm.put("01", "zahngsnan03");
		tm.put("00", "zahngsnan03");
		tm.put("00", "zahngsnan03");
		Set<Map.Entry<String,String>> set = tm.entrySet();
		Iterator<Map.Entry<String, String>> it = set.iterator();
		while(it.hasNext()){
			Map.Entry<String, String> mm =it.next();
			System.out.println(mm);
		}
	}
}

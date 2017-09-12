package com.rf.ch.jiekou;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		Person e1 = new Person("zhan03", 16);
		Person e2 = new Person("zhan04", 12);
		Person e3 = new Person("zhan02", 13);
		TreeSet<Person> ts = new TreeSet<Person>(new Compare1<Person>());
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		System.out.println(ts);
	}

//	public static void print(TreeSet<Person> ts) {
//		Iterator<Person> it = ts.iterator();
//		while (it.hasNext()) {
//			Person p = it.next();
//			if (!ts.contains(p)) {
//				ts.add(p);
//			}
//		}
//	}
}
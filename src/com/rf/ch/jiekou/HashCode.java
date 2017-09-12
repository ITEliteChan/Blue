package com.rf.ch.jiekou;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashCode {

	public static void main(String[] args){
	
		HashSet <Person1> hs = new HashSet<Person1>();
		hs.add(new Person1("王五",'男'));
		hs.add(new Person1("王五",'男'));
		hs.add(new Person1("王六",'男'));
		HashSet<Person1> hs1 = qvchong(hs);
		System.out.println(hs1);
	}
	public static HashSet<Person1> qvchong(HashSet<Person1> list) {
		HashSet<Person1> hs1 = new HashSet<Person1>();
		Iterator<Person1> it = list.iterator();
		while (it.hasNext()) {
			Person1 p = it.next();
			if (!hs1.contains(p)) {
				hs1.add(p);
			}
		}
		return hs1;
	}
}

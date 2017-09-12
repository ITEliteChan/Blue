package com.rf.ch.jiekou;

import java.util.Comparator;

public class Compare1<T> implements Comparator<T> {

	@Override
	public int compare(T o1, T o2) {
		// TODO Auto-generated method stub
		Person pe = (Person) o1;
		Person pe1 = (Person) o2;
		int num = pe.getName().compareTo(pe1.getName());
		if (num == 0) {
			if (pe.getAge() > pe1.getAge()) {
				return 1;
			}
			if (pe.getAge() == pe1.getAge()) {
				return 0;
			}
			return -1;
		}
		return num;
	}
}

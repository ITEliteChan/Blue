package com.rf.ch.jiekou;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		Person1 p1 = new Person1("张三", 30);
		Person1 p2 = new Person1("张三", 30);
		Person1 p3 = new Person1("李四", 20);
		Person1 p4 = new Person1("李四", 20);
		Person1 p5 = new Person1("李五", 20);
		ArrayList<Person1> list = new ArrayList<Person1>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		ArrayList<Person1> list1 = quchong(list);
		System.out.println(list1);
	}

	public static ArrayList<Person1> quchong(ArrayList<Person1> list) {
		ArrayList<Person1> list1 = new ArrayList<Person1>();
		ListIterator<Person1> it = list.listIterator();
		while (it.hasNext()) {
			Person1 p = it.next();
			if (!list1.contains(p)) {
				list1.add(p);
			}
		}
		return list1;
	}
}

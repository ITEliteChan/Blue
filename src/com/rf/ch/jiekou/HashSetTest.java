package com.rf.ch.jiekou;

import java.util.HashSet;
import java.util.Iterator;


class HashSetTest {
	public static void main(String[] args) {
		HashSet hs = new HashSet();

		hs.add(new Person3("zhangsan1", 16));
		hs.add(new Person3("zhangsan2", 19));
		hs.add(new Person3("zhangsan3", 26));
		hs.add(new Person3("zhangsan4", 28));
		hs.add(new Person3("zhangsan2", 19));

		Iterator it = hs.iterator();

		while (it.hasNext()) {
			Person3 p = (Person3) it.next();// add方法添加的是object类型，所以要向下转型
			System.out.println(p.getName() + "," + p.getAge());
		}
	}
}

package com.rf.ch.demo2;

public class Test {
	public static void main(String[] args) {
		Student stu = new Student("张三",18);
		System.out.println(stu.getName());
//		System.out.println(stu.name);
//		stu.name = "李四";
		stu.setName("李四");
		stu.setAge(18);
		System.out.println(stu.getName());
//		System.out.println(stu.age);
	}
}
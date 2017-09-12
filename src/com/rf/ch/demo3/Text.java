package com.rf.ch.demo3;

public class Text {
	public static void main(String[] args) {
		//通过关键字 new 创建一个 Person对象，创建时调用的是对象对应的构造方法
		Person201774 person = new Person201774();
		person.name = "张三";
		person.age = 20;
		
		//设置张三的身高为1.8f
		person.setHeight(1.8f);
		//得到张三的身高为1.8f
		System.out.println(person.getHeight());
		
		person.phoneNumber = "12345865456";
		person.speak();
		
		Person201774 lisi = new Person201774();
		lisi.name = "李四";
		lisi.speak();
		
		System.out.println(person.toString());
		System.out.println(lisi.toString());
	}
}

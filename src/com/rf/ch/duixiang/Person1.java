package com.rf.ch.duixiang;

public class Person1 {
	String name;

	public Person1(String name) {
		this.name = name;
		System.out.println("我是构造方法");
	}

	{
		System.out.println("我是构造代码块");
	}
	static {
		System.out.println("我是静态代码块");
	}
}

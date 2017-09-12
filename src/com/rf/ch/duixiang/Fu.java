package com.rf.ch.duixiang;

public abstract class Fu {
	String name;

	public Fu() {
		System.out.println("Fu中的无参构造方法");
	}

	public Fu(String name) {
		this.name = name;
		System.out.println("Fu中的有参构造方法");
	}

	public abstract void add();{
		System.out.println("这是子类的实现");
	}
	
}

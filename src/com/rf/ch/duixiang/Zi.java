package com.rf.ch.duixiang;

public  abstract class Zi extends Fu {
	String name;

	public Zi() {
		super();
		System.out.println("Zi中的无参构造方法");
	}

	public Zi(String name) {
		super(name);
		System.out.println("Zi中的有参构造方法");
	}

	public abstract void add();
	
}

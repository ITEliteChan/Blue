package com.rf.ch.jiekou;

public class Person1 {
 
	private String name;
	private int age;
	public Person1(String name,int age){
		this.name = name;
		this.age = age;
	}
	public Person1(String name){
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof/*因为他默认是比较我们的哈希值，这里需要比较对象的值，重写覆盖他的哈希值*/ Person1){
			Person1 p = (Person1)obj;
			return this.name.equals(p.name) && this.age ==p.age;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}

	
}

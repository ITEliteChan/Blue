package com.rf.ch.jiekou;

class Person3 {
	private String name;
	private int age;

	Person3(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public int hashCode()// 重写hashCode方法
	{
		/*
		 * 两个对象不一样，但是name.hashCode()+this.age可能一样，
		 * 所以最好是name.hashCode()+this.age*数字
		 */
		return this.name.hashCode() + age * 37;
	}

	public boolean equals(Object obj)// 重写equals方法
	{
		if (!(obj instanceof Person3)) {
			return false;
		}
		Person3 p = (Person3) obj;
		return this.name.equals(p.name) && this.age == p.age;
	}
}
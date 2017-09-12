package ao.rf.ch.di4zhou;

import java.util.Comparator;

public class Person implements Comparable<Person>, Comparator<Person> {
	String name;
	int age;

	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// compareto使用this方法进行比较。
	@Override
	public int compareTo(Person o1) {
		// TODO Auto-generated method stub
		if (this.getAge() < o1.getAge()) {
			return -1;
		} else if (this.getAge() > o1.getAge()) {
			return 1;
		}
		return o1.getName().compareTo(this.getName());// *String字符串使用compareTo进行比较；
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		int a = o1.getName().compareTo(o2.getName());
		if (a == 0) {
			if (o1.getAge() > o2.getAge()) {
				return -1;
			} else if (o1.getAge() < o2.getAge()) {
				return 1;
			}
			return 0;
		}
		return a;
	}

}

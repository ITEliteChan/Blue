package ao.rf.ch.di4zhou;

import javax.xml.crypto.dsig.CanonicalizationMethod;

public class Duixiang implements Comparable{
	private String name;
	private int age;
	
	public Duixiang(String name , int age){
		super();
		this.name = name;
		this.age = age;
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


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(o instanceof Duixiang){
			Duixiang dx = (Duixiang)o;
			int num = this.name.compareTo(dx.name);
			if(num ==0 ){
				if(this.age > dx.age){
					return 1;
				}
				if(this.age ==dx.age){
					return 0;
				}
				return -1;
			}
			return num;
		}
		return 0;	
	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + "";
	}
	
}

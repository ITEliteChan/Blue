package ao.rf.ch.di4zhou;

public class Stu implements Comparable{

	private String name;
	private int age;
	
public Stu(String name,int age){
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
	if(o instanceof Stu){
		Stu st = (Stu)o;
		int num = this.name.compareTo(st.name);
		if(num ==0 ){
			if(this.age > st.age){
				return 1;
			}
			if(this.age ==st.age){
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
	return "Stu [name=" + name + ", age=" + age + "]";
}

}

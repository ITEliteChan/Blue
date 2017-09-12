package ao.rf.ch.di4zhou;

import java.util.Comparator;

public class Bijiao implements Comparator<Bijiao>{
  private String name;
  private int age;
  
  public Bijiao(String name,int age){
	  this.age = age;
	  this.name = name;
  }
  
  public String getName(){
	  return name;
  }
  public void setName(String name){
	  this.name = name;
  }
  public int getAge(){
	  return age;
  }
  public void setAge(int age){
	  this.age = age;
  }
	@Override
	public int compare(Bijiao o1, Bijiao o2) {
		// TODO Auto-generated method stub
		int c = o1.getName().compareTo(o2.getName());
		if (c == 0) {
			if (o1.getAge() > o2.getAge()) {
				return 1;
			} else if (o1.getAge() < o2.getAge()) {
				return -1;
			}
			return 0;
		}
		return c;
	}

}

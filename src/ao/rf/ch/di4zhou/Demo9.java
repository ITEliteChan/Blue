package ao.rf.ch.di4zhou;

import java.util.Iterator;
import java.util.TreeSet;

public class Demo9 {
	public static void main(String[] args) {

	    TreeSet<Person> wo = new TreeSet<Person>(new Person(null,123));
	    wo.add(new Work ("a2",19));
	    wo.add(new Work("b1",18));
	    wo.add(new Student("chen1",20));
	    wo.add(new Student("zhao1",16));
	    wo.add(new Student("zha1",16));
	    bijiao(wo);
	}
	public static <T> void bijiao(TreeSet<T> tr){
		Iterator<T> it = tr.iterator();
		while(it.hasNext()){
	     Person ps = (Person) it.next();
	     System.out.println(ps);
		}
	                  
	}
}

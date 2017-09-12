package ao.rf.ch.di4zhou;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Hashmmmm {

	public static void main(String[] args) {
		HashMap<Stu,String> ha = new HashMap<Stu,String>();
		ha.put(new Stu("zhang1",18),"上海");
		ha.put(new Stu("wang",19),"四川");
		ha.put(new Stu("cheng",23),"福建");
		Set<Stu> set = ha.keySet();
		TreeSet<Stu> te = new TreeSet<Stu>();
		te.addAll(set);
		Iterator<Stu> it = te.iterator();
		while(it.hasNext()){
			Stu st = it.next();
			System.out.println(st + "   "+ha.get(st));
		}
	}
}
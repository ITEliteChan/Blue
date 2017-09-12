package ao.rf.ch.di4zhou;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Arr1 {

	public static void mian(String[] args){	

		HashMap<Duixiang,String> hm = new HashMap<Duixiang,String>();
		hm.put(new Duixiang("abc02", 17),"上海");
		hm.put(new Duixiang("cba03", 18),"福建");  
		hm.put(new Duixiang("cba01", 16),"四川");
		Set<Duixiang> set = hm.keySet();
//		TreeSet<Duixiang> ts = new TreeSet<Duixiang>(set);第一种方法
		TreeSet<Duixiang> ts = new TreeSet<Duixiang>();//第二种方法
		ts.addAll(set);
		Iterator<Duixiang> it= ts.iterator(); 
		while(it.hasNext()){
			Duixiang dx = it.next();
			System.out.println(dx + "   "+hm.get(dx));
	}
}
}

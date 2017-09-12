package ao.rf.ch.di4zhou;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Student1 {

	public static void main(String[] args) {
		ArrayList<Duixiang> j1704 = new ArrayList<Duixiang>();
		j1704.add(new Duixiang("张三", 66));
		j1704.add(new Duixiang("李四", 23));
		j1704.add(new Duixiang("王三", 22));
		ArrayList<Duixiang> j1702 = new ArrayList<Duixiang>();
		j1702.add(new Duixiang("王一", 24));
		j1702.add(new Duixiang("王二", 25));
		j1702.add(new Duixiang("王三", 26));
		HashMap<String, ArrayList<Duixiang>> hm = new HashMap<String, ArrayList<Duixiang>>();
		hm.put("J1702", j1702);
		hm.put("J1704", j1704);
		print(hm);
	}

	public static void print(HashMap<String, ArrayList<Duixiang>> hm) {
		Set<String> set = hm.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key);
			// System.out.println(hm.get(key));
			ArrayList<Duixiang> list = hm.get(key);
			getArrayList(list);
		}

	}

	public static void getArrayList(ArrayList<Duixiang> list) {
		Iterator<Duixiang> it = list.iterator();
		while (it.hasNext()) {
			Duixiang dx = it.next();
			System.out.println(dx.getName() + "\t" + dx.getAge());
		}
	}
}

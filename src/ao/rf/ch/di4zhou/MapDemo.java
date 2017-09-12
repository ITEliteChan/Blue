package ao.rf.ch.di4zhou;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
//		HashMap<Integer,Integer> he = new HashMap<Integer,Integer>();
//		he.put(01, 100);
//		he.put(02, 200);
//		he.put(03, 300);
//		he.put(04, 400);
//		System.out.println(he);
//		System.out.println(he.size());
//		System.out.println(he.values());
//		System.out.println(he.keySet());//获取键值的set集合
//		System.out.println(he.get(03));
		
		
		//思路：1，把key转换成Set集合；
		// 2,通过set集合的迭代器取出key值
		//3,通过map集合里面的get（key）方法得到value值
//		HashMap<Integer,Integer> he = new HashMap<Integer,Integer>();
//		he.put(1,100);
//		he.put(2, 200);
//		he.put(3, 300);
//		Set<Integer> set = he.keySet();
//		Iterator<Integer> it = he.keySet().iterator();
//		while(it.hasNext()){
//			Integer key = it.next();
//			Integer value = he.get(key);
//			System.out.println("key="+key+"  value ="+value);
//		}
		HashMap<Integer,Integer>ha = new HashMap<Integer,Integer>();
		ha.put(1, 100);
		ha.put(2, 200);
		ha.put(3, 300);
//		Set<Integer> set = ha.keySet();
		Iterator<Integer> it = ha.keySet().iterator();
		while(it.hasNext()){
			Integer key = it.next();
			Integer value = ha.get(key);
			System.out.println("key="+key+"  value = "+value);
		}
	
	}
}

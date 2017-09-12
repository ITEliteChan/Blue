package ao.rf.ch.di4zhou;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;

public class Type {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("02");
		list.add("01");
		list.add("09");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println("反转"+list);
	}
}

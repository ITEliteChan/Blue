package com.rf.ch.jiekou;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class In {
	
public static void main(String[] args) {
	Calendar ca = Calendar.getInstance();
//	ca.add(Calendar.DATE, -1);
//	String yesterday =new SimpleDateFormat("yy-MM-ss E hh-dd-ss").format(ca.getTime());
//	System.out.println(yesterday);
	System.out.println(ca.get(Calendar.MONDAY)+1);
	ca.set(2018,2,1);
	ca.add(Calendar.DAY_OF_MONTH, -1);
	System.out.println(ca.get(Calendar.DAY_OF_MONTH));
	System.out.println(ca.getActualMaximum(Calendar.DAY_OF_MONTH));
}
}

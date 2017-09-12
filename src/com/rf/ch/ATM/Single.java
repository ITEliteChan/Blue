package com.rf.ch.ATM;

public class Single {

	private static Single s = null;
	private Single(){
		
	}
	public static Single getSingle(){
		if(s == null){
			synchronized (Single.class) {
				if(s == null){
					s = new Single();
				}
			}
		}
		return s;
	}
}

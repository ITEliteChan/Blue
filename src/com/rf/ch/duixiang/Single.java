package com.rf.ch.duixiang;

public class Single {
	// 把沟通方法私有化 懒汉式
	private static Single ss = null;
	private Single(){	
	}
	public Single getSingle(){
		if(ss == null){
			//synchronized:锁
			synchronized(Single.class){
				if(ss == null){
					ss =new Single();
				}
			}
		}
		return ss;
	}

	// 把构造方法私有化 单例模式之饿汉式
	// private Single() {
	//
	// }
	//
	// static single ss = new Single();
	//
	// public Single getsingle() {
	// return ss;
	// }
	}

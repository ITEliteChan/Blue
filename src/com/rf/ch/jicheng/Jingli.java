package com.rf.ch.jicheng;

public class Jingli extends Yuangong{
	private long money;

	public long getMoney() {
		return money;
	}

	public void setMoney(long money) {
		this.money = money;
	}

	public Jingli(String name,long number,int wage){
		super(name,number,wage);
		this.money = money;
	}

	@Override
	public String toString() {
		return "Gongren [money=" + money + "]";
	}
	
}

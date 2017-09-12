package com.rf.ch.ATM;

public class Ao

{
	public String name;
	public int attack;
	public int blood;

	public void attack(Master m) 

	{

		m.blood -= attack; 

		System.out.println(name + "正在攻击" + m.name + "," + m.name + "剩余的血量是" + m.blood);
		if (m.blood <= 0)

		{
			System.out.println(name + "胜利！");
		}
	}
}

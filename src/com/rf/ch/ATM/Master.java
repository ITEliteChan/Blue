package com.rf.ch.ATM;

public class Master

{
	public String name;
	public int attack;
	public int blood;

	public void attack(Ao a)

	{
		a.blood -= attack;
		System.out.println(name + "正在攻击" + a.name + "," + a.name + "剩余的血量是" + a.blood);
		if (a.blood <= 0)

		{
			System.out.println(name + "胜利！");
		}
	}
}
package com.rf.ch.ATM;

public class Manger

{
	public static void main(String[] args)

	{
		Ao a = new Ao();
		a.name = "奥特曼";
		a.attack = 3;
		a.blood = 30;
		Master m = new Master();
		m.name = "小怪兽";
		m.attack = 2;
		m.blood = 30;
		while (a.blood > 0 && m.blood > 0)

		{
			a.attack(m);
			if (m.blood <= 0)
			{
				break; 
			}
			m.attack(a);
			if (m.blood <= 0)
			{
				break;
			}

		}

	}
}
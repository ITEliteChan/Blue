package ao.rf.ch.aoteman;

import java.util.ArrayList;

public class BP {

	public static void main(String[] args) {
		ArrayList<Man> a = new ArrayList<Man>();
		ArrayList<Master> b = new ArrayList<Master>();
		a.add(new Man(100, 9));// 集合
		a.add(new Man(100, 9));
		a.add(new Man(100, 9));
		a.add(new Man(100, 9));
		a.add(new Man(100, 9));
		b.add(new Master(100, 8));
		b.add(new Master(100, 8));
		b.add(new Master(100, 8));
		b.add(new Master(100, 8));
		b.add(new Master(100, 8));
		pk(a, b);
	}

	public static void pk(ArrayList<Man> a, ArrayList<Master> b) {
		int i = 0;
		int m1 = (int) (Math.random() * 5);// 生成一个随机奥特曼；
		int g1 = (int) (Math.random() * 5);// 生成一个随机小怪兽；
		while (i < 100) {// 循环打架不超过100次；
			i++;// 增加打架的次数
			while (a.get(m1).getHp() > 0 && b.get(g1).getHp() > 0) {// 当奥特曼与小怪兽Hp都大于0时，开始执行
				int max = (int) (Math.random() * 10);// 随机出来一个数，判断是奥特曼打怪兽，还是怪兽打奥特曼
				if (max > 5) {// 当MAX大于5的时候，小怪兽被打
					b.get(g1).setHp(b.get(g1).getHp() - a.get(m1).getAttack());// 小怪兽掉血，掉的血是奥特曼的攻击力；
					System.out.println("小怪兽" + g1 + "被奥特曼" + m1 + "打了，还剩" + b.get(g1).getHp());// 输出
					if (b.get(g1).getHp() < 0) {// 判断小怪兽的Hp小于0时，开始执行
						System.out.println("小怪兽死" + g1 + "了");
						b.get(g1).setHp(-1);// 小怪兽的血量值为-1，证明它死了
						g1 = (int) (Math.random() * 5);// 重写随机生成一个小怪兽
					}
				} else {
					a.get(m1).setHp(a.get(m1).getHp() - b.get(g1).getAttack());
					System.out.println("奥特曼" + m1 + "被小怪兽" + g1 + "打了，还剩" + a.get(m1).getHp());
					if (a.get(m1).getHp() < 0) {
						System.out.println("奥特曼" + m1 + "死了");
						a.get(m1).setHp(-1);
						m1 = (int) (Math.random() * 5);
					}
				}
			}
			if (a.get(m1).getHp() < 0) {// 当上面while语句条件不成立的时候，判断奥特曼或小怪兽哪一个血量低于0
				m1 = (int) (Math.random() * 5);// 随机生成一个奥特曼，直到不是已经死亡的奥特曼
				continue;// 跳回while循环语句
			} else if (b.get(g1).getHp() < 0) {
				g1 = (int) (Math.random() * 5);
				continue;
			}
		}
	}
}

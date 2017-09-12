package com.rf.ch.ATM;

import java.util.Scanner;

public class ATM {
	public static  void main(String[] args) {
		System.out.println("欢迎来到");
		User2017 user=login();
		xuanzhe(user);
	}
//菜单选项
	public static void xuanzhe(User2017 user) {
		System.out.println("1.取款 2.存款 3.查询 4.修改密码 5.退出");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if (a == 1) {
			qukuan(user);
			xuanzhe(user);
		} else if (a == 2) {
			cunkuan(user);
			xuanzhe(user);
		} else if (a == 3) {
			chaxun(user);
			xuanzhe(user);
		} else if (a == 4) {
			xiugaimima(user);
			xuanzhe(user);
		} else if (a == 5) {
			tuichu(user);

		}
	}	

//登陆
	public static User2017 login() {
		int j = 3;
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入用户名：");
			String name = scanner.next();
			System.out.println("请输入密码");
			int password = scanner.nextInt();
			User2017 user1 = new User2017("李四", 123, 1000.1f);
			User2017 user2 = new User2017("王五", 124, 1000.2f);
			User2017 user3 = new User2017("李六", 125, 1000.3f);
			User2017[] user = { user1, user2, user3 };
			for (int i = 0; i < user.length; i++) {
				if (user[i].userName.equals(name) && user[i].password == (password)) {
					System.out.println("登陆成功");
					return user[i];
				}
			}
			j--;
			if (j == 0) {
				System.out.println("你的登陆次数已用完，卡已被锁，请联系柜台");
				System.exit(0);// 退出程序。
			}
			System.out.println("登陆失败,还有" + j + "次机会");
		}
	}

	// 取款
	public static void qukuan(User2017 user) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入想取款的金额");
		int a = scanner.nextInt();
		if (a <= user.balanceof) {
			user.balanceof = user.balanceof - a;
			System.out.println("取款" + a + "你的余额还剩" + user.balanceof);
		} else {
			System.out.println("你的取款失败");
		}
	}

	// 存款
	public static void cunkuan(User2017 user) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入想存入的金额");
		int c = scanner.nextInt();
			user.balanceof = user.balanceof + c;
			System.out.println("存款" + c + "你的余额还剩" + user.balanceof);
		}

	// 查询
	public static void chaxun(User2017 user) {
		System.out.println(user.balanceof);
	}

	// 修改密码
	public static void xiugaimima(User2017 user) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入密码");
		int b = scanner.nextInt();
		System.out.println("请重复密码");
		int s = scanner.nextInt();
			if(b == s && b != user.password){
				System.out.println("密码修改成功");
				user.password = b;
		} else {
			System.out.println("密码修改失败");
		}
	}

	// 退出
	public static void tuichu(User2017 user) {
		System.out.println("你已成功退出");
	}

}

	

package com.rf.ch.bagezuoye;

import java.util.Random;

public class Suijishu {
	public static void main(String[] args) {
		int a = 10;// 数组大小
		int[] b = new int[a];
		int num = 100;// 生成的整数在0-99之间，包括0和99
		int sum = 0;// 总和
		Random ran = new Random();
		int c = 0;// 每次产生的随机数
		for (int i = 0; i < b.length; i++) {
			c = ran.nextInt(num);
			b[i] = c;
			sum += c;
			System.out.println("随机数为：" + c);
		}
		System.out.println("总和为：" + sum);
	}
}
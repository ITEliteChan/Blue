package aom.rf.mianshi;

import java.util.Scanner;

public class Xiangjia {

	public static void main(String[] args) {
		jia(0,5);
		ch(0,1);
	}
	
	public static void jia(int num,int i) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		for(int a = 1;a<=s;a++){//控制循环次数
			num = i +num;
			i=i*10+5;			
		}
		System.out.println(num);
	}
	public static void ch(int num1,int b) {
		Scanner sc = new Scanner(System.in);
		long s = sc.nextInt();
		
		for(long a = 1; a <= s;a++){
			long k= b*a;
			b = (b*10+1);
			System.out.println(k);
			num1 = (int)k + num1;
		}
		System.out.println(num1);
		
	}
}

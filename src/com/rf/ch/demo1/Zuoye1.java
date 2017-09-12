package com.rf.ch.demo1;

public class Zuoye1 {
	public static void main(String[] args) {
		// for(int a=9;a>=1;a--){
		// for(int b=1;b<=9;b++){
		// System.out.print(a+"*"+b+"="+a*b+"\t");
		// }
		// System.out.print("\n");
		for (int a = 1; a < 10; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print(a + "x" + b + "=" + a * b + "\t");
			}
			System.out.println();
		}
	}
}

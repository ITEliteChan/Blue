package com.rf.ch.lei;

public class Demo {

	public static void main(String[] args) {
		Demo d = new Demo();
		Inner1 i1 = d.getInner1();
//		Inner i = d.getInner();
//		i.eat();
	}
public Inner getInner() {//�õ��ڲ��ࣨInner���Ķ���
	return new Inner();
}
	
 class Inner{
		public void eat() {
			System.out.println("���緹");
		}
	}
 
 public Inner1 getInner1() {
	 class Inner1Class implements Inner1{
		 public void print() {
			 System.out.println("�ֲ��ڲ���");
		 }
	 }
	 return new Inner1Class();
 }
 interface Inner1{
	 
 }
}

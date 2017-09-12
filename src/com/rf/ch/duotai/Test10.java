package com.rf.ch.duotai;

public class Test10 {

	public static void main(String[] args){
	//	一.
//		Dog dog = new Dog();
//		dog.eat();
//		Cat cat = new Cat();
//		cat.eat();
		
//		Animal a =new Cat();
//		Adi(a);
//		Animal b = new Dog();
//		Adi(b);
		Animal a = new Cat();
		Cat c = (Cat)a;//强转类！！！
		Aoie(a);
		Animal b = new Dog();
		Aoie(b);
	}
//	public static void Adi(Animal animal){
//		animal.eat();
//	}
	public static void Aoie(Animal animal){
		animal.eat();
	}
}


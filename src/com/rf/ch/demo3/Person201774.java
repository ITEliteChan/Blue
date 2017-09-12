package com.rf.ch.demo3;
//人对象
public class Person201774 {
String name;//名字属性
int age;//年龄属性
char sex;//性别属性
private float height;//身高属性 pricate：修饰符私有的
String phoneNumber;//电话属性

//建立一个对象必须要有构造方法，java程序中，默认有一个无参构造方法

//无参构造方法
public Person201774() {
	
}
//属性是私有的 private 修饰符只能在本类当中访问
//对外提供设置身高的方法
public void setHeight(float ff){
	this.height = ff;//把设置的值赋值给当前对象
}
//对外提供获取身高的方法
public float getHeight(){
	return this.height;//返回当前对象的身高
	
}

//this关键字 代表的是本对象
public void speak(){
	System.out.println(this.name+"是Person中的一员");
}


@Override
public String toString() {
	return "Person201774 [name=" + name + ", age=" + age + ", sex=" + sex + ", height=" + height + ", phoneNumber="
			+ phoneNumber + "]";
}

}

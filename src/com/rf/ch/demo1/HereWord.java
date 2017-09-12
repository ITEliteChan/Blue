//声明这个类是在此（com.rf.ch.demo1)包下
package com.rf.ch.demo1;

//public 公共的 表示外界可以访问的
//class 代表这是一个类（一个java类）
//HereWord 代表我的类名
/*
 *多行注释
 */
/**
 * 
 * @author admin 文本注释
 *
 */

public class HereWord {
	//main方法(main函数) 虚拟机(jvm)唯一识别的入口
	public static void main(String[] args) {
		//控制台输出语句 print 不换行
     System.out.print("hello world！");
     //println 换行
     System.out.println(25);
     System.out.println("下午好");
     //涉及到计算的表达式，直接计算输出结果
     System.out.println("明年"+2*5+"今年"+10*20);
     System.out.println("今天"+10/2);
     System.out.print("明天"+8/3);
     //拼接，连接字符串 用+号连接
     System.out.println("大家好"+"我叫陈豪"+"我今年23"+"我的电话号码是:"+1234567891);
     System.out.println("你好");
     System.out.print("字体"+5*2+"文字");
	}
     }
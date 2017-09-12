package com.rf.ch.duixiang;

public class User20171 {
String userName;
String password;
float balanceof;

public User20171(String userName,String password,float balanceof){
	this.userName = userName;
	this.password =password;
	this.balanceof = balanceof;
}
@Override
public String toString() {
	return "User2017 [userName=" + userName + ", password=" + password + ", balanceof=" + balanceof + "]";
}
}

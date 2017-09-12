package com.rf.ch.ATM;

public class User2017 {
String userName;
int password;
float balanceof;

public User2017(String userName,int password,float balanceof){
	this.userName = userName;
	this.password =password;
	this.balanceof = balanceof;
}
@Override
public String toString() {
	return "User2017 [userName=" + userName + ", password=" + password + ", balanceof=" + balanceof + "]";
}
}

package com.rf.ch.duixiang;

public class User9 {
private String userName;
private int password;
private float money;

public User9(String userName,int password,float money){
	this.userName = userName;
}


////public void setUserName(String userName){
////	this.userName =userName;
//}
public void setUserName(String userName){
	this.userName = userName;
}

public String getUserName(){
	return this.userName;
}

public int getPassword() {
	return password;
}


public void setPassword(int password) {
	this.password = password;
}


public float getMoney() {
	return money;
}


public void setMoney(float money) {
	this.money = money;
}
}

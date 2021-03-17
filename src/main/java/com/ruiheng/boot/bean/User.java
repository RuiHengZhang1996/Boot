package com.ruiheng.boot.bean;

public class User {

	private String user;
	private int age;
	
	
	
	public User() {
	}



	public User(String user, int age) {
		// TODO Auto-generated constructor stub
		this.user = user;
		this.age = age;
	}



	@Override
	public String toString() {
		return "User [user=" + user + ", age=" + age + "]";
	}
	
	
}

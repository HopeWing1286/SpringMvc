package com.testfan.spring;

public class UserBean {
	
	private String name;
	private String pass;
	
	public UserBean() {
		super();
	}
	
	public UserBean(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

}

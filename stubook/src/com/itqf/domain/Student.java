package com.itqf.domain;

public class Student {
	private String username;
	private String password;
	public Student() {
		super();
	}
	public Student(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Student [username=" + username + ", password=" + password + "]";
	}
	
}
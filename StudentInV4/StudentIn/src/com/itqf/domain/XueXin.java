package com.itqf.domain;

public class XueXin {
	private String fileurl;
	private String username;
	private String sex;
	private int age;
	private String email;
	private String major;
	private String level;
	private String hometown;
	private String hoby;
	public XueXin() {
		super();
	}
	public XueXin(String fileurl, String username, String sex, int age, String email, String major, String level,
			String hometown, String hoby) {
		super();
		this.fileurl = fileurl;
		this.username = username;
		this.sex = sex;
		this.age = age;
		this.email = email;
		this.major = major;
		this.level = level;
		this.hometown = hometown;
		this.hoby = hoby;
	}
	public String getFileurl() {
		return fileurl;
	}
	public void setFileurl(String fileurl) {
		this.fileurl = fileurl;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	public String getHoby() {
		return hoby;
	}
	public void setHoby(String hoby) {
		this.hoby = hoby;
	}
	@Override
	public String toString() {
		return "XueXin [fileurl=" + fileurl + ", username=" + username + ", sex=" + sex + ", age=" + age + ", email="
				+ email + ", major=" + major + ", level=" + level + ", hometown=" + hometown + ", hoby=" + hoby + "]";
	}
	
	
}

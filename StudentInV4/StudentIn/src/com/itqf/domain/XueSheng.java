package com.itqf.domain;

public class XueSheng {
	private String username;
	private String resone;
	private String date;

	public XueSheng() {
		super();
	}

	public XueSheng(String username, String resone, String date) {
		super();
		this.username = username;
		this.resone = resone;
		this.date = date;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getResone() {
		return resone;
	}

	public void setResone(String resone) {
		this.resone = resone;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "XueSheng [username=" + username + ", resone=" + resone + ", date=" + date + "]";
	}

}

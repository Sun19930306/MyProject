package com.itqf.domain;

public class ProductAndStudent {
	private String username;
	private String product_id;
	private String product_name;
	private String product_url;
	public ProductAndStudent() {
		super();
	}
	public ProductAndStudent(String username, String product_id, String product_name, String product_url) {
		super();
		this.username = username;
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_url = product_url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_url() {
		return product_url;
	}
	public void setProduct_url(String product_url) {
		this.product_url = product_url;
	}
	@Override
	public String toString() {
		return "ProductAndStudent [username=" + username + ", product_id=" + product_id + ", product_name="
				+ product_name + ", product_url=" + product_url + "]";
	}
	
}

package com.product.bean;

public class User {
	
	private String uname;
	private String pwd;
	private String role;
	
	public User() {
		super();
	}

	public User(String uname, String pwd, String role) {
		super();
		this.uname = uname;
		this.pwd = pwd;
		this.role = role;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [uname=" + uname + ", pwd=" + pwd + ", role=" + role + "]";
	}
	
	
	

}

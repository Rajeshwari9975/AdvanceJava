package com.demo.beans;

public class Account {
	private int aid;
	private String name;
	private String email;
	private double balance;
	public Account() {
		super();
	}
	public Account(int aid, String name, String email, double balance) {
		super();
		this.aid = aid;
		this.name = name;
		this.email = email;
		this.balance = balance;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [aid=" + aid + ", name=" + name + ", email=" + email + ", balance=" + balance + "]";
	}
	

}

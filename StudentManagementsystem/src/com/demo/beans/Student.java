package com.demo.beans;

import java.time.LocalDate;

public class Student {

	private int id;
	private String fname;
	private String lname;
	private LocalDate date;
	private String email;
	public Student() {
		super();
	}
	public Student(int id, String fname, String lname, LocalDate date, String email) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.date = date;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", date=" + date + ", email=" + email
				+ "]";
	}
	

}

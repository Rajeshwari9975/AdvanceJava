package com.demo.beans;

import java.sql.Date;
import java.time.LocalDate;

public class Student {
	private int sid;
	private String fname;
	private String lname;
	private LocalDate dob;
	private String email;
	public Student() {
		super();
	}
	public Student(int sid, String fname, String lname, LocalDate dob, String email) {
		super();
		this.sid = sid;
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.email = email;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
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
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", fname=" + fname + ", lname=" + lname + ", dob=" + dob + ", email=" + email
				+ "]";
	}
	
	

}

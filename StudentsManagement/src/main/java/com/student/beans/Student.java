package com.student.beans;

import java.time.LocalDate;

public class Student {
	
	private int id;
	private String fName;
	private String lName;
	private LocalDate dob;
	private String email;
	
	public Student() {
		super();
	}

	public Student(int id, String fName, String lName, LocalDate dob, String email) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.dob = dob;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
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
		return "Student [id=" + id + ", fName=" + fName + ", lName=" + lName + ", dob=" + dob + ", email=" + email
				+ "]";
	}
	
	
	

}

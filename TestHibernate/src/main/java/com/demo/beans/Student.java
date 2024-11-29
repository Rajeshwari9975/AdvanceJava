package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student2711")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String namefirst;
	private String namelast;
	private LocalDate dob;
	private String email;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String namefirst, String namelast, LocalDate dob, String email) {
		super();
		//this.id = id;
		this.namefirst = namefirst;
		this.namelast = namelast;
		this.dob = dob;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNamefirst() {
		return namefirst;
	}

	public void setNamefirst(String namefirst) {
		this.namefirst = namefirst;
	}

	public String getNamelast() {
		return namelast;
	}

	public void setNamelast(String namelast) {
		this.namelast = namelast;
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
		return "Student [id=" + id + ", namefirst=" + namefirst + ", namelast=" + namelast + ", dob=" + dob + ", email="
				+ email + "]";
	}
	
	

}

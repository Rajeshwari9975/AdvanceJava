package com.demo.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name = "StudentMany")
public class Student {
	@Id
	private int sid;
	private String sname;
	private String lname;
	@ManyToMany
	private List<Course> c;
	public Student() {
		super();
	}
	public Student(int sid, String sname, String lname, List<Course> c) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.lname = lname;
		this.c = c;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public List<Course> getC() {
		return c;
	}
	public void setC(List<Course> c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", lname=" + lname + ", c=" + c + "]";
	}
	

}

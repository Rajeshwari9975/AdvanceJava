package com.products.bean;

public class Register {
	private int uname;
	private String branch;
	private double mark;
	private String course;
	public Register() {
		super();
	}
	public Register(int uname, String branch, double mark, String course) {
		super();
		this.uname = uname;
		this.branch = branch;
		this.mark = mark;
		this.course = course;
	}
	public int getUname() {
		return uname;
	}
	public void setUname(int uname) {
		this.uname = uname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Register [uname=" + uname + ", branch=" + branch + ", mark=" + mark + ", course=" + course + "]";
	}
	

}

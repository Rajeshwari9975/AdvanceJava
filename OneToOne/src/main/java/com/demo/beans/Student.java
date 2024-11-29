package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "Studenttable")
public class Student {
@Id
private int sid;
private String sname;
private String lname;
@OneToOne
private Course c;
public Student() {
	super();
}
public Student(int sid, String sname, String lname, Course c) {
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
public Course getC() {
	return c;
}
public void setC(Course c) {
	this.c = c;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", lname=" + lname + ", c=" + c + "]";
}

}
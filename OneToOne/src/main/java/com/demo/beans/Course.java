package com.demo.beans;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "coursetable")
public class Course {
@Id
private int cid;
private String cname;
private int duration;

public Course() {
	super();
}
public Course(int cid, String cname, int duration) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.duration = duration;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
@Override
public String toString() {
	return "Course [cid=" + cid + ", cname=" + cname + ", duration=" + duration + "]";
}

}

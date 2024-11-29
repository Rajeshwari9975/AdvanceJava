package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "Coursedemo1")
public class Course {
	@Id
	private int cid;
	private String cname;
	private int duration;
	@OneToOne
	private Student s;
	
	public Course() {
		super();
	}
	public Course(int cid, String cname, int duration, Student s) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.duration = duration;
		this.s = s;
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
	public Student getS() {
		return s;
	}
	public void setS(Student s) {
		this.s = s;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", duration=" + duration + ", s=" + s + "]";
	}
	


}

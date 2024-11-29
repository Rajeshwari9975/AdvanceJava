package com.student.beans;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "StudentDemo")
public class Student {
	
	@Id
	@Column(name = "student_id")
	private int sid;
	@Column(name = "student_name")
	private String sname;
	@Column(name = "student_rollNo")
	private int rollNo;
	@ManyToMany
	private Set<Course> courseSet;
	
	public Student() {
		super();
	}

	public Student(int sid, String sname, int rollNo, Set<Course> courseSet) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.rollNo = rollNo;
		this.courseSet = courseSet;
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

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public Set<Course> getCourseSet() {
		return courseSet;
	}

	public void setCourseSet(Set<Course> courseSet) {
		this.courseSet = courseSet;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", rollNo=" + rollNo + ", courseSet=" + courseSet + "]";
	}
	
	
	

}

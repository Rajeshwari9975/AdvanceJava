package com.student.beans;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CourseDemo")
public class Course {
	
	@Id
	@Column(name = "course_id")
	private int cid;
	@Column(name = "course_name")
	private String cName;
	@Column(name = "course_duration")
	private int cDuration;
//	@ManyToMany(mappedBy = "courseSet")
//	private Set<Student> studSet;
	
	public Course() {
		super();
	}

	public Course(int cid, String cName, int cDuration) {
		super();
		this.cid = cid;
		this.cName = cName;
		this.cDuration = cDuration;
		//this.studSet = studSet;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getcDuration() {
		return cDuration;
	}

	public void setcDuration(int cDuration) {
		this.cDuration = cDuration;
	}

//	public Set<Student> getStudSet() {
//		return studSet;
//	}
//
//	public void setStudSet(Set<Student> studSet) {
//		this.studSet = studSet;
//	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cName=" + cName + ", cDuration=" + cDuration +  "]";
	}
	
	
	

}

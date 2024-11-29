package com.demo.dao;

import java.util.List;

import com.demo.beans.Student;

public interface StudentDao {

	public void save(Student s);

	public List<Student> display();

	public int deletebyid(int id);

	

}

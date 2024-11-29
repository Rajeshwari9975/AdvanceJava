package com.student.dao;

import java.sql.ResultSet;
import java.util.List;

import com.student.beans.Student;

public interface StudentDao {

	int save(Student s1);

	List<Student> getStudents();
	
	int deleteStudentById(int id);

	ResultSet getStudentById(int id);

	String checkCredentials(String username, String password);

}

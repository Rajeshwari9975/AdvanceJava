package com.student.dao;

import java.sql.ResultSet;

import com.student.beans.Student;

public interface StudentDao {

	int save(Student s1);

	ResultSet getStudents();
	
	int deleteStudentById(int id);

	ResultSet getStudentById(int id);

}

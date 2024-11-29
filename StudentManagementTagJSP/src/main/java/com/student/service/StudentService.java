package com.student.service;

import java.util.List;

import com.student.beans.Student;

public interface StudentService {

	

	List<Student> displayAllStudents();

	int deleteStudentById();

	void findById();

	void addNewStudent(Student s1);

}

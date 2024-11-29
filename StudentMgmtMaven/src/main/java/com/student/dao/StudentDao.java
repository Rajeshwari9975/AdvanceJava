package com.student.dao;

import java.util.Set;

import com.student.beans.Course;
import com.student.beans.Student;

public interface StudentDao {

	void save(Student s);

	void save(Course c);

	Set<Student> getStudents();

}

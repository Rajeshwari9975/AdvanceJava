package com.student.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.student.beans.Student;
import com.student.dao.StudentDao;
import com.student.dao.StudentDaoImpl;

public class StudentServiceImpl implements StudentService {

	private StudentDao stud;

	public StudentServiceImpl() {
		stud = new StudentDaoImpl();
	}

	@Override
	public void addNewStudent(Student s1) {
		stud.save(s1);
	}

	@Override
	public List<Student> displayAllStudents() {
		 return stud.getStudents();
	}

	@Override
	public int deleteStudentById() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student ID which is to be deleted");
		int id = sc.nextInt();
		
		int n = stud.deleteStudentById(id);
		
		return n;
	}

	@Override
	public void findById() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student ID");
		int id = sc.nextInt();
		
		ResultSet rs = stud.getStudentById(id);
		
		try {
			while (rs.next()) {
				System.out.println("ID:: " + rs.getInt(1));
				System.out.println("First Name:: " + rs.getString("namefirst"));
				System.out.println("Last Name:: " + rs.getString("namelast"));
				System.out.println("Date of Birth:: " + rs.getDate("dob"));
				System.out.println("Email ID:: " + rs.getString(5));
				System.out.println(".............................................................");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

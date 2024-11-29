package com.student.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
	public int addNewStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student ID");
		int id = sc.nextInt();
		System.out.println("Enter Student First Name");
		sc.nextLine();
		String fName = sc.nextLine();
		System.out.println("Enter Student Last Name");
		String lName = sc.nextLine();
		System.out.println("Enter Student DOB dd/mm/yyyy");
		String dt = sc.nextLine();
		LocalDate ldt = LocalDate.parse(dt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("Enter Student Email");
		String email = sc.nextLine();

		Student s1 = new Student(id, fName, lName, ldt, email);

		int n = stud.save(s1);
		return n;
	}

	@Override
	public void displayAllStudents() {
		ResultSet rs = stud.getStudents();

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

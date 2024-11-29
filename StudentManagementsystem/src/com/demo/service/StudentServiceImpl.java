package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;


public class StudentServiceImpl implements Studentservice {
private StudentDao sdao ;

	public StudentServiceImpl() {
	sdao=new StudentDaoImpl();
}

	@Override
	public void addstudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a student id");
		int id = sc.nextInt();
		System.out.println("Enter a student fname");
		String fname = sc.next();
		System.out.println("Enter a lname");
		String lname = sc.next();
		System.out.println("Dob");
		String dob = sc.next();
		LocalDate ltd = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("Enter email");
		String email = sc.next();
		Student s = new Student(id,fname,lname,ltd,email);
		sdao.save(s);
				
		
	}

	@Override
	public void displaydata() {
		List<Student> lst = sdao.display();
		for(Student s : lst) {
			System.out.println("ID : "+s.getId());
			System.out.println("fname:"+s.getFname());
			System.out.println("lname:"+s.getLname());
			System.out.println("Dob:"+s.getDate());
			System.out.println("email:"+s.getEmail());
				
			}
		}

	@Override
	public int deletestudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student id");
		int id = sc.nextInt();
		int n = sdao.deletebyid(id);
		if(n>0) {
			return n;
		}
		else {
			return 0;
		}
		
	}
		
	}



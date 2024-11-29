package com.student.service;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.student.beans.Course;
import com.student.beans.Student;
import com.student.dao.StudentDao;
import com.student.dao.StudentDaoImpl;

public class StudentServiceImpl implements StudentService {

	private StudentDao sdao;
	
	public StudentServiceImpl() {
		sdao = new StudentDaoImpl();
	}



	@Override
	public void addNewStudent() {
		Scanner sc = new Scanner(System.in); 
		String choice = "y";
		System.out.println("Enter Student ID");
		int sid = sc.nextInt();
		System.out.println("Enter Student Name");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Enter Student Roll Number");
		int roll = sc.nextInt();
		
		Set<Course> cset = new HashSet<Course>();
		do {
			System.out.println("Enter Course ID");
			int cid = sc.nextInt();
			System.out.println("Enter Course Name");
			sc.nextLine();
			String cname = sc.nextLine();
			System.out.println("Enter Course Duration");
			int duration = sc.nextInt();
			Course c = new Course(cid, cname, duration);
			sdao.save(c);
			cset.add(c);
			System.out.println("Do you want to add more courses");
			choice = sc.next();
			System.out.println(choice);
			
		}while(choice.equals("y"));
		
		Student s = new Student(sid, name, roll, cset);
		sdao.save(s);
	}



	@Override
	public Set<Student> displayAllStudents() {
		return sdao.getStudents();
	}



	

}

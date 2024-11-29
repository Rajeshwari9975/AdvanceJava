package com.student.test;

import java.util.Scanner;

import com.student.dao.DBUtil;
import com.student.service.StudentService;
import com.student.service.StudentServiceImpl;

public class TestStudent {

	public static void main(String[] args) {
		StudentService ss = new StudentServiceImpl();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("1.Add New Student\n2.Display All Students\n3.Delete Student By ID");
			System.out.println("4.Find Student By ID\n5.Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				int n = ss.addNewStudent();
				if (n > 0) {
					System.out.println("Student Added Successfully");
				} else {
					System.out.println("Failed to add Student");
				}
				break;
			case 2:
				ss.displayAllStudents();
				break;
			case 3:
				int n1 = ss.deleteStudentById();
				if(n1 > 0) {
					System.out.println("Deleted Successfully");
				}
				else {
					System.out.println("Failed to Delete Student");
				}
				break;
			case 4:
				ss.findById();
				break;
			case 5:
				System.out.println("Thank You!");
				DBUtil.closeMyConnection();
				break;
			default:
				System.out.println("Wrong Input");
				break;
			}
		} while (choice != 5);
	}

}

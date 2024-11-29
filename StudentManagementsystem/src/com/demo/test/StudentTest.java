package com.demo.test;

import java.util.Scanner;

import com.demo.service.StudentServiceImpl;
import com.demo.service.Studentservice;

public class StudentTest {
	private static Studentservice ss = new StudentServiceImpl();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice =0;
		do {
			System.out.println("1.addStudent \n \n 2.display data 3.deleteStudent \n 4.exit");
		    choice = sc.nextInt();
		    switch(choice){
		    case 1:
		    	ss.addstudent();
		    	
		    	break;
		    	
		    case 2:
		    	ss.displaydata();
		    	break;
		    case 3:
		    	ss.deletestudent();
		    	break;
		    default:
		    	System.out.println("Thank you");
		    }
		}while(choice!=4);
	}

}

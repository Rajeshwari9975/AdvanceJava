package com.student.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.student.beans.Student;
import com.student.dao.StudentDao;
import com.student.dao.StudentDaoImpl;
import com.student.service.StudentService;
import com.student.service.StudentServiceImpl;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet {
	
	StudentService ss = new StudentServiceImpl();
	
	
	List<Student> studLst = ss.displayAllStudents();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<table><thead><tr><th>ID</th><th>First Name</th><th>Last Name</th><th>DOB</th><th>Email</th></tr></thead><tbody>");
		
		for(Student s : studLst) {
			out.println("<tr><td>"+s.getId()+"</td><td>"+s.getfName()+"</td><td>"+s.getlName()+"</td><td>"+s.getDob()+"</td><td>"+s.getEmail()+"</td></tr>");
		}
		out.println("</tbody></table>");
	}

}

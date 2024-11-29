package com.student.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.student.dao.StudentDao;
import com.student.dao.StudentDaoImpl;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	private StudentDao sdao = new StudentDaoImpl();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("uname");
		String password = request.getParameter("pwd");
		String role = sdao.checkCredentials(username,password);
		if(role != null) {
			if(role.equals("admin")) {
				out.println("Welcome To Admin Dashboard");
				out.println("<br>");
				out.println("<a href='studentdata'>Get Student Data</a>");
				out.println("<br>");
				out.println("<a href='addnewstudent.html'>Add New Student</a>");
				
			}
			else if(role.equals("user")) {
				out.println("Welcome To Student Dashboard");
				out.println("<br>");
				out.println("<a href='studentdata'>Get Student Data</a>");
			}
		}else {
			out.println("Login Failed");
		}
		
		
	}

}

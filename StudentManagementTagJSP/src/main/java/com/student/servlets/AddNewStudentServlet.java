package com.student.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.student.beans.Student;
import com.student.service.StudentService;
import com.student.service.StudentServiceImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addnew")
public class AddNewStudentServlet extends HttpServlet {
	
	private StudentService ss = new StudentServiceImpl();
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String sid = request.getParameter("id");
		int id = Integer.parseInt(sid);
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String sdob = request.getParameter("dob");
		LocalDate dob = LocalDate.parse(sdob, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		String email = request.getParameter("email");
		
		Student s = new Student(id, fname, lname, dob, email);
		
		ss.addNewStudent(s);
		
		RequestDispatcher rd = request.getRequestDispatcher("index.html");
		out.println("Added Successfully");
		out.println("<br>");
		rd.include(request, response);
	}

}

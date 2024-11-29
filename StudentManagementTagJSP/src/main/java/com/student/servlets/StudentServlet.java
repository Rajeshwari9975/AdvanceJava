package com.student.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.student.beans.Student;
import com.student.dao.StudentDao;
import com.student.dao.StudentDaoImpl;
import com.student.service.StudentService;
import com.student.service.StudentServiceImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/showALL")
public class StudentServlet extends HttpServlet {
	
	StudentService ss = new StudentServiceImpl();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		List<Student> studLst = ss.displayAllStudents();
		request.setAttribute("studLst", studLst);
		RequestDispatcher rd = request.getRequestDispatcher("DisplayStudent.jsp");
		rd.forward(request, response);
	}

}

package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String pwd = request.getParameter("pwd");
		String uname = request.getParameter("uname");
	
		if(uname.equals("admin") && pwd.equals("admin")) {
			out.println("Login");
		}
		else {
			out.println("Failed");
		}
	}

}

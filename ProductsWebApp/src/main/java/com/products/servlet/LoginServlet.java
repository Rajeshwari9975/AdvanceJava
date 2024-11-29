package com.products.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.products.bean.User;
import com.products.service.UserService;
import com.products.service.UserServiceImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	private UserService us = new UserServiceImpl();
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		
		User user = us.validateCred(uname,pwd);
		
		if(user.getRole().equals("admin")) {
			out.println("<h1>Login Successful</h1>");
			try {
				RequestDispatcher rd = request.getRequestDispatcher("ShowProducts");
				rd.include(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

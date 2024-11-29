package com.demo.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.demo.beans.User;
import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;

@WebServlet("/validate")
public class ValidateData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private LoginService ls = new LoginServiceImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		User user = ls.validateUser(uname,pwd);
		if(user.getRole().equals("admin")) {
			RequestDispatcher rd = request.getRequestDispatcher("showBookCategory.jsp");
			rd.forward(request, response);
		}
	}

}

package com.demo.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.demo.service.AccountService;
import com.demo.service.AccountServiceImpl;

@WebServlet("/deleteAccount")
public class DeleteAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private AccountService ac = new AccountServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int aid = Integer.parseInt(request.getParameter("aid"));
		int status = ac.deleteById(aid);
		if(status > 0) {
			out.println("<h3>Account Deleted Successfully</h3>");
			RequestDispatcher rd = request.getRequestDispatcher("ShowAccounts");
			rd.include(request, response);
		}else {
			out.println("<h3>Account ID not Found...</h3>");
			RequestDispatcher rd = request.getRequestDispatcher("ShowAccounts");
			rd.include(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

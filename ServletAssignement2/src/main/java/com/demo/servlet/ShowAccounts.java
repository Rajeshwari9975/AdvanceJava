package com.demo.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.demo.beans.Account;
import com.demo.service.AccountService;
import com.demo.service.AccountServiceImpl;

/**
 * Servlet implementation class ShowAccounts
 */
@WebServlet("/ShowAccounts")
public class ShowAccounts extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private AccountService ac = new AccountServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Account> acList = ac.getAllAccounts();
		request.setAttribute("acList", acList);
		RequestDispatcher rd = request.getRequestDispatcher("showAccounts.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

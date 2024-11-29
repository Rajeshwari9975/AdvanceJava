package com.demo.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calculate")
public class CalculateEMI extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int loanAmt = Integer.parseInt(request.getParameter("loanAmt"));
		int yrs = Integer.parseInt(request.getParameter("yrs"));
		int roi = 10;
		double interest = loanAmt * roi;
		double totalAmt = loanAmt + interest;
		double emi = totalAmt/36;
		
		out.println("<h3>Loan Amount : "+loanAmt+"</h3>");
		out.println("<h3>Interest Rate : "+roi+"</h3>");
		out.println("<h3>Interest Amount : "+interest+"</h3>");
		out.println("<h3>Total Amount to be Paid : "+totalAmt+"</h3>");
		out.println("<h3>EMI : "+emi+"</h3>");
	}

}

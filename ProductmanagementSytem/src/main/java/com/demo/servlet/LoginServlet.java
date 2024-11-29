package com.demo.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.demo.beans.User;
import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet({"/LoginServlet","/validation"})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LoginService ls =new LoginServiceImpl();
   
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("html/text");
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		User  user = ls.validateData(uname,pwd);
		if(user!= null && user.getRole().equals("admin")) {
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(20);
			session.setAttribute("uname", uname);
			session.setAttribute("role", user.getRole());
			RequestDispatcher rd = request.getRequestDispatcher("showProductsServlet");
			rd.forward(request,response);
			
			
		}
		else if(user != null && user.getRole().equals("user")){
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(10);
			session.setAttribute("uname",uname );
			session.setAttribute("role", user.getRole());
			RequestDispatcher rd = request.getRequestDispatcher("showproductservelet");
			rd.forward(request, response);
			
			
			
		}
		else {
			out.println("wrong credaential");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
			
		}
	}

}

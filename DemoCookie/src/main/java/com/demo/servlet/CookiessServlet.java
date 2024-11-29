package com.demo.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CookiessServlet
 */
@WebServlet("/CookiessServlet")
public class CookiessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
   
    public CookiessServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String button = request.getParameter("btn");
		switch(button) {
		case "add":
			String name = request.getParameter("name");
			String value = request.getParameter("val");
			Cookie c1 = new Cookie(name,value);
			response.addCookie(c1);
			out.println("Cookiess added.......");
			RequestDispatcher rd = request.getRequestDispatcher("Cookiess.html");
			rd.include(request, response);
			
			break;
		case "show":
			Cookie[] arr=request.getCookies();
					
					for(Cookie c:arr) {
						out.println(c.getName()+"---->"+c.getValue()+"---->"+c.getMaxAge());
					}
					 rd=request.getRequestDispatcher("Cookiess.html");
					rd.include(request, response);
					break;
		case "del":
			name = request.getParameter("name");
			arr= request.getCookies();
			for(Cookie c:arr) {
				if(c.getName().equals(name)) {
					c.setMaxAge(0);
					response.addCookie(c);
					out.println("Cookiess deleted.......");
					RequestDispatcher rd1 = request.getRequestDispatcher("Cookiess.html");
					rd1.include(request, response);
					break;
				}
			
			}
			
			
			
			break;
	
			
			
		}
		
	}

	

}

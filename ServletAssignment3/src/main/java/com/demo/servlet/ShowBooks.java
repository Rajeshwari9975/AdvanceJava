package com.demo.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.demo.beans.Book;
import com.demo.service.BookService;
import com.demo.service.BookServiceImpl;

@WebServlet("/showBooks")
public class ShowBooks extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private BookService bs = new BookServiceImpl();
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String btn = request.getParameter("btn");
		switch(btn) {
		case "showBooks" :
			String cat = request.getParameter("books");
			List<Book> blst =  bs.findBooksByCategory(cat);
			request.setAttribute("blst", blst);
			RequestDispatcher rd = request.getRequestDispatcher("showBooks.jsp");
			rd.forward(request, response);
			break;
		case "showCart" :
			RequestDispatcher rd1 = request.getRequestDispatcher("showCart.jsp");
			rd1.forward(request, response);
			RequestDispatcher rd2 = request.getRequestDispatcher("showBookCategory.jsp");
			rd2.include(request, response);
			break;
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

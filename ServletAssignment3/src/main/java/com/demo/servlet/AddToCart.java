package com.demo.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Book;
import com.demo.beans.CartItem;
import com.demo.service.BookService;
import com.demo.service.BookServiceImpl;

@WebServlet("/addToCart")
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private BookService bs = new BookServiceImpl();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String btn = request.getParameter("btn");
		switch(btn) {
		case "add":
			HttpSession session = request.getSession();
			
			List<CartItem> blist = (List<CartItem>) session.getAttribute("cart");
			
			if(blist == null) {
				blist = new ArrayList<CartItem>();
			}
			
			String[] bArr = request.getParameterValues("books");
			for(String id : bArr) {
				Book b = bs.getById(Integer.parseInt(id));
				int orderQty = Integer.parseInt(request.getParameter("b"+id));
				CartItem cartItem = new CartItem(b.getBookName(), b.getType(), b.getCost(), orderQty);
				blist.add(cartItem);
			}
			
			session.setAttribute("cart", blist);
			
			RequestDispatcher rd = request.getRequestDispatcher("showBookCategory.jsp");
			rd.forward(request, response);
			break;
		case "show":
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

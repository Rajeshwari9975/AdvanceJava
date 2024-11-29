package com.product.servlet;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;

import com.product.service.ProductService;
import com.product.service.ProductServiceImpl;
 

/**
 * Servlet implementation class AddtoCart
 */
@WebServlet("/addtocart")
public class AddtoCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
  

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  String btn = request.getParameter("btn");
	  ProductService pservice = new ProductServiceImpl();
	  switch(btn) {
	  case "add":
		  
		 
	      break;
	  case "show":
		  break;
		  
	  }
	  
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

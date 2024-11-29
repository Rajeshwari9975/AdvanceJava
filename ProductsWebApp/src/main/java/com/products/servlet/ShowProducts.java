package com.products.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.products.bean.Product;
import com.products.service.ProductService;
import com.products.service.ProductServiceImpl;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ShowProducts extends HttpServlet {
	
	private ProductService ps = new ProductServiceImpl();
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		List<Product> products =  ps.getProducts();
		
		if(products != null) {
			out.println("<table style=\"border: 2px, solid,black;\"><tr><th>Product ID</th><th>Product Description</th><th>Product Price</th><th>Actions</th></tr>");
			for(Product p : products) {
				out.println("<tr><td>"+p.getProdId()+"</td><td>"+p.getDesc()+"</td><td>"+p.getPrice()+"</td><td><a href='#'>Update</a>/<a href='#'>Delete</a></td></tr>");
			}
			out.println("</table>");
			out.println("<button>Add New Product</button>");
		}
	}

	
}

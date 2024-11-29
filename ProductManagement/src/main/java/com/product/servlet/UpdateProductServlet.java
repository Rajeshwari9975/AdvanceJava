package com.product.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.product.bean.Product;
import com.product.service.ProductService;
import com.product.service.ProductServiceImpl;

/**
 * Servlet implementation class UpdateProductServlet
 */
@WebServlet({ "/UpdateProductServlet", "/updateProd" })
public class UpdateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pid =Integer.parseInt(request.getParameter("pid"));
		String pname =request.getParameter("pname");
		int price=Integer.parseInt(request.getParameter("price"));
	
		Product p = new Product(pid, pname, price);
		ProductService ps = new ProductServiceImpl();
		ps.updateProduct(p);
		
		RequestDispatcher rd = request.getRequestDispatcher("ShowProductsServlet");
		rd.forward(request, response);
		
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

}

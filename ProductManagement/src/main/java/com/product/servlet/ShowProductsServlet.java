package com.product.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import com.product.bean.Product;
import com.product.service.ProductService;
import com.product.service.ProductServiceImpl;

@WebServlet("/ShowProductsServlet")
public class ShowProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ShowProductsServlet() {
        super();
     
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductService ps = new ProductServiceImpl();
		List<Product> pList = ps.showProducts();
		request.setAttribute("pList", pList);
		HttpSession session = request.getSession();
		String role = (String) session.getAttribute("role");
		if(role.equals("admin")) {
			RequestDispatcher rd = request.getRequestDispatcher("showProducts.jsp");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("showProductsForUser.jsp");
			rd.forward(request, response);
		}
		
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
}

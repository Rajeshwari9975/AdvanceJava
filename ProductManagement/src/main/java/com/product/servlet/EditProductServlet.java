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

@WebServlet({ "/EditProductServlet", "/editProd" })
public class EditProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ProductService ps = new ProductServiceImpl();
       
    public EditProductServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("pid"));
		Product p = ps.getProductById(id);
		request.setAttribute("prod", p);
		System.out.println(p.getProdId());
		System.out.println(p.getProdDesc());
		RequestDispatcher rd = request.getRequestDispatcher("updateProduct.jsp");
		rd.forward(request, response);
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

}

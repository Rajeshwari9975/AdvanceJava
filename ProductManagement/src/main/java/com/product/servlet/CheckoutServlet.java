package com.product.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.product.bean.ProductCheckOut;

@WebServlet({ "/CheckoutServlet", "/checkout" })
public class CheckoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public CheckoutServlet() {
        super();
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int finalAmt = 0;
		
		
		int pid = Integer.parseInt(request.getParameter("prodId"));
		String qtyy = request.getParameter("p"+pid);
		System.out.println(qtyy);
		int qty = 0;
		if(qtyy != null) {
			qty = Integer.parseInt(qtyy);
			System.out.println(qty);
		}
		int price = Integer.parseInt(request.getParameter("prodPrice"));
		String desc = request.getParameter("prodDesc");
		int totalPrice = price * qty;
		finalAmt = finalAmt + totalPrice;
		
		System.out.println(qty);
		
		ProductCheckOut pc = new ProductCheckOut(pid, desc, qty, price, totalPrice);
		
		List<ProductCheckOut> pcList = new ArrayList<ProductCheckOut>();
		
		pcList.add(pc);
		
		request.setAttribute("pcList", pcList);
		request.setAttribute("finalAmt", finalAmt);
		
		RequestDispatcher rd = request.getRequestDispatcher("checkout.jsp");
		rd.forward(request, response);
		
		RequestDispatcher rd1 = request.getRequestDispatcher("showProductsForUser.jsp");
		rd1.include(request, response);
		
		
		
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

}

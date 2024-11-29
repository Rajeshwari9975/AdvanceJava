package com.demo.service;

import java.util.List;

import com.demo.Dao.ProductServiceDao;
import com.demo.Dao.ProductServiceDaoImpl;
import com.demo.beans.Product;

public class ProductServiceImpl implements ProductService {
	private ProductServiceDao pdao;
	



	public ProductServiceImpl() {
		pdao = new ProductServiceDaoImpl();
	}




	@Override
	public List<Product> showProducts() {
		
		return pdao.display();
	}

}

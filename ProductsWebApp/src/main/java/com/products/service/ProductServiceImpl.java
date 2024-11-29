package com.products.service;

import java.util.List;

import com.products.bean.Product;
import com.products.dao.ProductDao;
import com.products.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {
	
	private ProductDao pdao;
	
	public ProductServiceImpl() {
		pdao = new ProductDaoImpl();
	}



	@Override
	public List<Product> getProducts() {
		return pdao.getProducts();
	}

}

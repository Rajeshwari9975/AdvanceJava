package com.product.service;

import java.util.List;

import com.product.bean.Product;
import com.product.dao.ProductDao;
import com.product.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService{
	
	private ProductDao pdao;
	
	

	public ProductServiceImpl() {
		pdao = new ProductDaoImpl();
	}



	@Override
	public List<Product> showProducts() {
		return pdao.displayAll();
		
	}



	@Override
	public Product getProductById(int id) {
		return pdao.getProductById(id);
	}



	@Override
	public void updateProduct(Product p) {
		pdao.modifyProduct(p);
	}



	@Override
	public void deleteProductById(int id) {
		pdao.deleteProductById(id);
	}

}

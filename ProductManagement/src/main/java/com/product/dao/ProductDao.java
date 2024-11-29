package com.product.dao;

import java.util.List;

import com.product.bean.Product;

public interface ProductDao {

	List<Product> displayAll();

	Product getProductById(int id);

	void modifyProduct(Product p);

	void deleteProductById(int id);

}

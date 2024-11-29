package com.product.service;

import java.util.List;

import com.product.bean.Product;

public interface ProductService {

	List<Product> showProducts();

	Product getProductById(int id);

	void updateProduct(Product p);

	void deleteProductById(int id);

}

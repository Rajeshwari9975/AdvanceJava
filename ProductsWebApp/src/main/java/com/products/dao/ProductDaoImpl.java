package com.products.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.products.bean.Product;

public class ProductDaoImpl implements ProductDao {
	
	private static Connection conn;
	private static PreparedStatement showProd;
	
	static {
		try {
			conn = DBUtil.getConnection();
			showProd = conn.prepareStatement("select * from product");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Product> getProducts() {
		List<Product> plst = new ArrayList();
		try {
			ResultSet rs = showProd.executeQuery();
			while(rs.next()) {
				int prodId = rs.getInt(1);
				String desc = rs.getString(2);
				int price = rs.getInt(3);
				
				Product p = new Product(prodId, desc, price);
				plst.add(p);
			}
			return plst;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return plst;
	}

}

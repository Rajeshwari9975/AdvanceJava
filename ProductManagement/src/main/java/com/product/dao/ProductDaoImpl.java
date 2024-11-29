package com.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.product.bean.Product;

public class ProductDaoImpl implements ProductDao {
	
	private static Connection conn;
	private static PreparedStatement displayProd,showProdUsingId,modifyProd,deleteProdById;
	
	static {
		
		try {
			conn = DBUtil.getConnection();
			displayProd = conn.prepareStatement("select * from product");
			showProdUsingId = conn.prepareStatement("select * from product where prodid=?");
			modifyProd = conn.prepareStatement("update product set prodid=?,descrip=?,price=? where prodid=?");
			deleteProdById = conn.prepareStatement("delete from product where prodid=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Product> displayAll() {
		List<Product> pList = new ArrayList<Product>();
		try {
			ResultSet rs = displayProd.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(1);
				String desc = rs.getString(2);
				int price = rs.getInt(3);
				
				Product p = new Product(id, desc, price);
				pList.add(p);
			}
			return pList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pList;
		
	}

	@Override
	public Product getProductById(int id) {
		try {
			showProdUsingId.setInt(1, id);
			ResultSet rs = showProdUsingId.executeQuery();
			if(rs.next()) {
				int pid = rs.getInt(1);
				String desc = rs.getString(2);
				int price = rs.getInt(3);
				
				Product p = new Product(pid, desc, price);
				return p;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void modifyProduct(Product p) {
		try {
			modifyProd.setInt(1, p.getProdId());
			modifyProd.setString(2, p.getProdDesc());
			modifyProd.setInt(3, p.getProdPrice());
			modifyProd.setInt(4, p.getProdId());
			modifyProd.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteProductById(int id) {
		try {
			deleteProdById.setInt(1, id);
			deleteProdById.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

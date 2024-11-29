package com.demo.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Product;

public class ProductServiceDaoImpl implements ProductServiceDao{
	private static PreparedStatement displyProd,showProductId ;
	private static Connection conn;
	static {
	
		try {
			conn =DBUtil.getConnection();
			displyProd = conn.prepareStatement("select * from Product");
			showProductId =conn.prepareStatement("select * from  Product where id =?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<Product> display() {
		List <Product> plist= new ArrayList<Product>();
		try {
			ResultSet rs = displyProd.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(1);
				String pname = rs.getString(2);
				String Desc = rs.getString(3);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	

}

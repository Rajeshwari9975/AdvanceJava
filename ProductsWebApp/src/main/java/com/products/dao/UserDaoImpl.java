package com.products.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.products.bean.User;

public class UserDaoImpl implements UserDao {

	private static Connection conn;
	private static PreparedStatement validate;
	
	static {
		
		try {
			conn = DBUtil.getConnection();
			validate = conn.prepareStatement("select * from user where uname = ? and password = ?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public User validateData(String uname, String pwd) {
		try {
			validate.setString(1, uname);
			validate.setString(2, pwd);
			ResultSet rs = validate.executeQuery();
			
			if(rs.next()) {
				User user = new User(rs.getString(1), rs.getString(2), rs.getString(3));
				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}

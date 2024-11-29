package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.User;

public class LoginDaoImpl implements LoginDao {
	
	private static Connection conn;
	private static PreparedStatement valUser;
	
	static {
		
		try {
			conn = DBUtil.getConnection();
			valUser = conn.prepareStatement("select * from user where uname = ? and password = ?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public User validateUser(String uname, String pwd) {
		User user;
		try {
			valUser.setString(1, uname);
			valUser.setString(2, pwd);
			ResultSet rs = valUser.executeQuery();
			if(rs.next()) {
				String usernm = rs.getString(1);
				String passwd = rs.getString(2);
				String role = rs.getString(3);
				user = new User(uname, role);
				return user;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}

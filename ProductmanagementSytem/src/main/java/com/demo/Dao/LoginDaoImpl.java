package com.demo.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.User;

public class LoginDaoImpl  implements LoginDao
{

	
	private static Connection conn;
	private static PreparedStatement valUser;
	
	static {
		
		try {
			conn = DBUtil.getConnection();
			valUser=conn.prepareStatement("select * from User");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public User validateData(String uname, String pwd) {
		
		try {
			valUser.setString(1, uname);
			valUser.setString(2,pwd);
			ResultSet rs = valUser.executeQuery();
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

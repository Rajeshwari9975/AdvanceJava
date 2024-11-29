package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.demo.beans.User;

public class LoginDaoImpl  implements LoginDao{
private static Connection conn;
private static PreparedStatement valUser;
static {
	conn = DBUtil.getConnection();
	try {
		valUser = conn.prepareStatement("select * from user where uname =? and password=?");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	@Override
	public User ValidUser(String uname, String pwd) {
		
		return null;
	}

}

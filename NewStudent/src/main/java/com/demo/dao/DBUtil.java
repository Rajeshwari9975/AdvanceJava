package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
private static Connection conn=null;
public static  Connection getMyConnection() {
	if(conn==null) {
	
	 try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		String url ="jdbc:mysql://192.168.10.127:mysql/dac67";
		conn=DriverManager.getConnection(url,"Dac67","welcome");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	return conn;
	
}

public static void CloseMyConnection() {
	if(conn!=null) {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}

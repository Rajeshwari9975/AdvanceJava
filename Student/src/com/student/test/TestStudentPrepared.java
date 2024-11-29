package com.student.test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class TestStudentPrepared {
	
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url = "jdbc:mysql://192.168.10.127:3306/dac67";
			Connection conn = DriverManager.getConnection(url, "dac67", "welcome");
			PreparedStatement pst = conn.prepareStatement("select * from student");
			
			
			int id = 30;
			String namefirst = "abcd";
			String namelast = "xyz";
			LocalDate dt = LocalDate.of(1994, 05, 20);
			java.sql.Date sdt = Date.valueOf(dt);
			
			PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, namefirst);
			ps.setString(3, namelast);
			ps.setDate(4, sdt);
			ps.setString(5, null);
			
			ps.executeUpdate();
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				System.out.println("ID:: "+rs.getInt(1));
				System.out.println("First Name:: "+rs.getString("namefirst"));
				System.out.println("Last Name:: "+rs.getString("namelast"));
				System.out.println(".............................................................");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

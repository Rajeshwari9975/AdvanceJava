package com.student.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Arrays;

public class TestStudent {
	
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url = "jdbc:mysql://192.168.10.127:3306/dac67";
			Connection conn = DriverManager.getConnection(url, "dac67", "welcome");
			Statement st = conn.createStatement();
			LocalDate dt=LocalDate.of(2025,02,02);
			String query1 = "insert into student values("+29+",'Nihal','Mulla','"+dt+"','null')";
			String query = "select * from student";
			st.executeUpdate(query1);
			System.out.println(query1);
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				System.out.println("Student ID:: "+rs.getInt(1));
				System.out.println("First Name:: "+rs.getString(2));
				System.out.println("Last Name:: "+rs.getString(3));
				System.out.println("...........................................................................");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

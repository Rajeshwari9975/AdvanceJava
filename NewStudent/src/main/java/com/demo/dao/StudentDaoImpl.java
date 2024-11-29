package com.demo.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDao {
	
	private static Connection conn;
	private static PreparedStatement ps ,ps1;
	static {
	try {
		conn=DBUtil.getMyConnection();
		ps= conn.prepareStatement("select*from student");
		ps1 = conn.prepareStatement("insert into student value(?,?,?,?,?)");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	
	}
	
	public int save(Student s1) {
		
		java.sql.Date dob = Date.valueOf(s1.getDob());
		int n =0;
		
		try {
			ps1.setInt(1,s1.getSid());
			ps1.setString(2, s1.getFname());
			ps1.setString(3, s1.getLname());
			ps1.setDate(4, dob);
			ps1.setString(5, s1.getEmail());
			n = ps1.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return n;
		
	}
	
	

	
	

}

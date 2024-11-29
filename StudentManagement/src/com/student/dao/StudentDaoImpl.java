package com.student.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.student.beans.Student;

public class StudentDaoImpl implements StudentDao {

	private static PreparedStatement ps,ps1,ps2,ps3;
	private static Connection conn;

	static {
		try {
			conn=DBUtil.getMyConnection();
			ps = conn.prepareStatement("select * from student");
			ps1 = conn.prepareStatement("insert into student values(?,?,?,?,?)");
			ps2 = conn.prepareStatement("delete from student where id=?");
			ps3 = conn.prepareStatement("select * from student where id=?");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public int save(Student s1) {

		java.sql.Date dob = Date.valueOf(s1.getDob());
		int n = 0;

		try {
			ps1.setInt(1, s1.getId());
			ps1.setString(2, s1.getfName());
			ps1.setString(3, s1.getlName());
			ps1.setDate(4, dob);
			ps1.setString(5, s1.getEmail());

			n = ps1.executeUpdate();
			return n;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}

	@Override
	public ResultSet getStudents() {
		ResultSet rs = null;
		try {
			rs = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public int deleteStudentById(int id) {
		int n = 0;
		try {
			ps2.setInt(1, id);
			n = ps2.executeUpdate();
			return n;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}

	@Override
	public ResultSet getStudentById(int id) {
		ResultSet rs = null;
	
		try {
			ps3.setInt(1, id);
			rs = ps3.executeQuery();
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}

}

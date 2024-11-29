package com.student.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.student.beans.Student;

public class StudentDaoImpl implements StudentDao {

	private static PreparedStatement ps,ps1,ps2,ps3,ps4;
	private static Connection conn;

	static {
		try {
			conn=DBUtil.getMyConnection();
			ps = conn.prepareStatement("select * from student");
			ps1 = conn.prepareStatement("insert into student values(?,?,?,?,?)");
			ps2 = conn.prepareStatement("delete from student where id=?");
			ps3 = conn.prepareStatement("select * from student where id=?");
			ps4 = conn.prepareStatement("select uname,password,role from user");
			
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
	public List<Student> getStudents(){
		List<Student> lst = new ArrayList();
		try {
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(1);
				String nameFirst = rs.getString("namefirst");
				String nameLast = rs.getString("namelast");
				LocalDate dob = rs.getDate("dob").toLocalDate();
				String email = rs.getString(5);
				
				Student s = new Student(id, nameFirst, nameLast, dob, email);
				
				lst.add(s);
			}
			
			return lst;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
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

	@Override
	public String checkCredentials(String username, String password) {
		try {
			ResultSet rs = ps4.executeQuery();
			while(rs.next()) {
				String uname = rs.getString(1);
				String pwd = rs.getString(2);
				if(uname.equals(username) && pwd.equals(password)) {
					return rs.getString(3);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}

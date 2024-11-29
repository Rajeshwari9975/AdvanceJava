package com.demo.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDao {
	private static PreparedStatement ps,ps1;
	private static Connection conn;
	static {
		conn = DButil.getconnection();
		try {
			ps = conn.prepareStatement("insert into student values(?,?,?,?,?) ");
			ps1 = conn.prepareStatement("select * from student");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void save(Student s) {
		int n = 0;

		java.sql.Date dob = Date.valueOf(s.getDate());

		try {
			ps.setInt(1, s.getId());
			ps.setString(2, s.getFname());
			ps.setString(3, s.getLname());
			ps.setDate(4, dob);
			ps.setString(5, s.getEmail());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Student> display() {
		List<Student> llist = new ArrayList<Student>();
		try {
			ResultSet rs= ps1.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(1);
				String fname = rs.getString(2);
				String lname = rs.getString(3);
				LocalDate ldt = rs.getDate(4).toLocalDate();
				String email = rs.getString(5);
				Student s = new Student(id, fname, lname, ldt, email);
				llist.add(s);
			}
			return llist;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return llist;
		
		
	}

	@Override
	public int deletebyid(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}

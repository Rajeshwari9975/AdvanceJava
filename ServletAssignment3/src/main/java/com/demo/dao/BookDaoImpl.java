package com.demo.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Book;

public class BookDaoImpl implements BookDao{
	
	private static Connection conn;
	private static PreparedStatement findBookByCat,findById;
	
	static {
		
		try {
			conn = DBUtil.getConnection();
			findBookByCat = conn.prepareStatement("select * from books where type = ?");
			findById = conn.prepareStatement("select * from books where id = ?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Book> findByCategory(String cat) {
		List<Book> blst = new ArrayList<Book>();
		try {
			findBookByCat.setString(1, cat);
			ResultSet rs = findBookByCat.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(1);
				String bookName = rs.getString(2);
				String type = rs.getString(3);
				int cost = rs.getInt(4);
				
				Book b = new Book(id, bookName, type, cost);
				blst.add(b);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return blst;
	}

	@Override
	public Book findById(int id) {
		try {
			findById.setInt(1, id);
			ResultSet rs = findById.executeQuery();
			
			if(rs.next()) {
				int bid = rs.getInt(1);
				String bname = rs.getString(2);
				String type = rs.getString(3);
				int cost = rs.getInt(4);
				Book b = new Book(bid, bname, type, cost);
				return b;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}

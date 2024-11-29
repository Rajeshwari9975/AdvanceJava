package com.demo.dao;

import java.util.List;

import com.demo.beans.Book;

public interface BookDao {

	List<Book> findByCategory(String cat);

	Book findById(int id);

}

package com.demo.service;

import java.util.List;

import com.demo.beans.Book;
import com.demo.dao.BookDao;
import com.demo.dao.BookDaoImpl;

public class BookServiceImpl implements BookService {
	
	private BookDao bdao;
	
	public BookServiceImpl() {
		bdao = new BookDaoImpl();
	}

	@Override
	public List<Book> findBooksByCategory(String cat) {
		return bdao.findByCategory(cat);
	}

	@Override
	public Book getById(int id) {
		return bdao.findById(id);
	}

}

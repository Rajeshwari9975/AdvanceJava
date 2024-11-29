package com.demo.service;

import java.util.List;

import com.demo.beans.Book;

public interface BookService {

	List<Book> findBooksByCategory(String cat);

	Book getById(int i);

}

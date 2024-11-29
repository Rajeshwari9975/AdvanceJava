package com.demo.beans;

public class Book {
	
	private int id;
	private String bookName;
	private String type;
	private int cost;
	
	public Book() {
		super();
	}

	public Book(int id, String bookName, String type, int cost) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.type = type;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", type=" + type + ", cost=" + cost + "]";
	}
	
	
	

}

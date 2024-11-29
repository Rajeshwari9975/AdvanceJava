package com.demo.beans;

public class CartItem {
	
	private String bookName;
	private String bookType;
	private int cost;
	private int orderQty;
	
	public CartItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CartItem(String bookName, String bookType, int cost, int orderQty) {
		super();
		this.bookName = bookName;
		this.bookType = bookType;
		this.cost = cost;
		this.orderQty = orderQty;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getOrderQty() {
		return orderQty;
	}

	public void setOrderQty(int orderQty) {
		this.orderQty = orderQty;
	}

	@Override
	public String toString() {
		return "CartItem [bookName=" + bookName + ", bookType=" + bookType + ", cost=" + cost + ", orderQty=" + orderQty
				+ "]";
	}
	
	

}

package com.product.bean;

public class Product {
	
	private int prodId;
	private String prodDesc;
	private int prodPrice;
	
	public Product() {
		super();
	}

	public Product(int prodId, String prodDesc, int prodPrice) {
		super();
		this.prodId = prodId;
		this.prodDesc = prodDesc;
		this.prodPrice = prodPrice;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

	public int getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodDesc=" + prodDesc + ", prodPrice=" + prodPrice + "]";
	}
	
	
	
	

}

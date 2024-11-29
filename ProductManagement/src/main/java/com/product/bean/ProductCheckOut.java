package com.product.bean;

public class ProductCheckOut {
	
	private int prodId;
	private String prodDesc;
	private int qty;
	private int prodPrice;
	private int totalPrice;
	
	public ProductCheckOut() {
		
	}

	
	
	public ProductCheckOut(int prodId, String prodDesc, int qty, int prodPrice, int totalPrice) {
		super();
		this.prodId = prodId;
		this.prodDesc = prodDesc;
		this.qty = qty;
		this.prodPrice = prodPrice;
		this.totalPrice = totalPrice;
	}

	
	
	public int getTotalPrice() {
		return totalPrice;
	}



	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
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

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}



	@Override
	public String toString() {
		return "ProductCheckOut [prodId=" + prodId + ", prodDesc=" + prodDesc + ", qty=" + qty + ", prodPrice="
				+ prodPrice + ", totalPrice=" + totalPrice + "]";
	}

	
	
	
	

}

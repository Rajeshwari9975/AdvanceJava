package com.demo.beans;

public class Product {
	private int ProdId;
	private String ProdDesc;
	private String Prodprice;
	public Product() {
		super();
	}
	public Product(int prodId, String prodDesc, String prodprice) {
		super();
		ProdId = prodId;
		ProdDesc = prodDesc;
		Prodprice = prodprice;
	}
	public int getProdId() {
		return ProdId;
	}
	public void setProdId(int prodId) {
		ProdId = prodId;
	}
	public String getProdDesc() {
		return ProdDesc;
	}
	public void setProdDesc(String prodDesc) {
		ProdDesc = prodDesc;
	}
	public String getProdprice() {
		return Prodprice;
	}
	public void setProdprice(String prodprice) {
		Prodprice = prodprice;
	}
	@Override
	public String toString() {
		return "Product [ProdId=" + ProdId + ", ProdDesc=" + ProdDesc + ", Prodprice=" + Prodprice + "]";
	}
	

}

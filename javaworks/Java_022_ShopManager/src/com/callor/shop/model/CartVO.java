package com.callor.shop.model;

public class CartVO {
	
	// CartVO vo = new CartVO();
	// 선언해야 사용 가능
	// String userName;
	private String userName;
	private String productName;
	private int Qty;
	private int Price;
	private int total;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQty() {
		return Qty;
	}
	public void setQty(int qty) {
		Qty = qty;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "CartVO [userName=" + userName + ", productName=" + productName + ", Qty=" + Qty + ", Price=" + Price
				+ ", total=" + total + "]";
	}
	
	
}

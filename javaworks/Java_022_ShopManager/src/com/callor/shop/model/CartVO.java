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
	
	// 매개변수가 있는 생성자를 만들게 되면
	// 매개변수가 없는 "기본생성자"를 반드시 만들어줘야 한다
	public CartVO() {
	}
	
	public CartVO(String userName, String pName, int qty, int price) {
		this.userName = userName;
		this.productName = pName;
		this.Qty = qty;
		this.Price = price;
	}
	
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

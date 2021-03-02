package com.callor.opp.model;

/*
 * 카트정보를 담아 App에서 사용할
 * Value Object 클래스
 * 구매자, 상품명, 규격, 날짜, 시각, 수량, 구매단가, 구매금액
 * 
 */

public class CartVO {
	
	// 한개짜리 단어는 키워드일 수도 있으니 조심할 것
	
	private String userName;
	private String productName;
	private String standard;
	private String date;
	private String time;
	
	private int qty;
	private int price;
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
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "CartVO [userName=" + userName + ", productName=" + productName + ", standard=" + standard + ", date="
				+ date + ", time=" + time + ", qty=" + qty + ", price=" + price + ", total=" + total + "]";
	}
	
}

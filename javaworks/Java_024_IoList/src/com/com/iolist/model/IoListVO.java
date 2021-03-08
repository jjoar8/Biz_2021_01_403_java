package com.com.iolist.model;

public class IoListVO {
	
	private String date;
	private String product;
	private String company;
	private String customer;
	private String sort;
	
	private int pPrice; // perchase price
	private int sPrice;
	private int Qty;
	private int pTotal;
	private int sTotal;
	
	// 기본생성자
	public IoListVO() {
	}
	
	// 필드생성자
	public IoListVO(String date, String product, String company, String customer, String sort, int pPrice, int sPrice,
			int qty) {
		super();
		this.date = date;
		this.product = product;
		this.company = company;
		this.customer = customer;
		this.sort = sort;
		this.pPrice = pPrice;
		this.sPrice = sPrice;
		Qty = qty;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public int getpPrice() {
		return pPrice;
	}

	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}

	public int getsPrice() {
		return sPrice;
	}

	public void setsPrice(int sPrice) {
		this.sPrice = sPrice;
	}

	public int getQty() {
		return Qty;
	}

	public void setQty(int qty) {
		Qty = qty;
	}

	public int getpTotal() {
		return pTotal;
	}

	public void setpTotal(int pTotal) {
		this.pTotal = pTotal;
	}

	public int getsTotal() {
		return sTotal;
	}

	public void setsTotal(int sTotal) {
		this.sTotal = sTotal;
	}

	@Override
	public String toString() {
		return "IoListVO [date=" + date + ", product=" + product + ", company=" + company + ", customer=" + customer
				+ ", sort=" + sort + ", pPrice=" + pPrice + ", sPrice=" + sPrice + ", Qty=" + Qty + ", pTotal=" + pTotal
				+ ", sTotal=" + sTotal + "]";
	}
	
	
}
package com.callor.shop.service;

// 인터페이스는 인터페이스만 상속 받을 수 있다
public interface CartServiceV2 extends CartService{
	
	public void saveCartToFile();
	public void loadCartFromFile();

}

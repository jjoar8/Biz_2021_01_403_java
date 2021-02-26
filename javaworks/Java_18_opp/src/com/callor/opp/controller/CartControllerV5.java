package com.callor.opp.controller;

import com.callor.opp.service.CartServiceV1;

public class CartControllerV5 {
	
	public static void main(String[] args) {
		
		CartServiceV1 csV1 = new CartServiceV1();
		
		System.out.println("=========================");
		System.out.println("쇼핑카드 상품추가");
		System.out.println("-------------------------");
		
		csV1.inputCart();
		csV1.printCartList();
		
		
	}
		
}

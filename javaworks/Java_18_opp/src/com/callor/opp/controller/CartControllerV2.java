package com.callor.opp.controller;

import com.callor.opp.model.CartVO;

public class CartControllerV2 {
	
	public static void main(String[] args) {
		
		// CartVO 클래스를 사용하여 객체배열 3개 선언
		CartVO[] cartVO = new CartVO[3];
		
		for(int i = 0; i < cartVO.length; i++) {
			// 사용할 수 있도록 초기화
			cartVO[i] = new CartVO();	
		}
		
		// 임의의 카트정보를 저장
		cartVO[0].setCartUserName("홍길동");
		cartVO[0].setCartDate("2021-02-26");
		cartVO[0].setCartTime("10:44:00");
		cartVO[0].setCartPName("초코파이");
		cartVO[0].setCartPrice(100);
		cartVO[0].setCartQty(10);
		cartVO[0].setCartStd("바나나맛");
		cartVO[0].setCartTotal(1000);
		
		cartVO[1].setCartUserName("김자바");
		cartVO[1].setCartDate("2021-02-26");
		cartVO[1].setCartTime("01:34:31");
		cartVO[1].setCartPName("초코파이");
		cartVO[1].setCartPrice(100);
		cartVO[1].setCartQty(15);
		cartVO[1].setCartStd("인절미맛");
		cartVO[1].setCartTotal(1500);
		
		cartVO[2].setCartUserName("나북웜");
		cartVO[2].setCartDate("2021-02-26");
		cartVO[2].setCartTime("22:29:33");
		cartVO[2].setCartPName("초코파이");
		cartVO[2].setCartPrice(100);
		cartVO[2].setCartQty(12);
		cartVO[2].setCartStd("오리지널");
		cartVO[2].setCartTotal(1200);
		
		for(int i = 0; i < cartVO.length; i++) {
			// 저장된 카드정보를 리스트로 출력
			System.out.println(cartVO[i].toString());	
		}
		
		// === cartVO의 개수가 3개인 상태
		// 상품 한가지를 더 카트에 넣고 싶다
		cartVO = new CartVO[4]; // 처음에 만든 CartVO[3] 소멸
		
		cartVO[3] = new CartVO();
		cartVO[3].setCartUserName("조아라");
		cartVO[3].setCartPName("바나나우유");
		
		System.out.println("======================");
		System.out.println("카트 내용");
		System.out.println("----------------------");
		for(int i = 0; i < cartVO.length ; i++) {
			System.out.println(cartVO[i].toString()); // NullPointerException
		}
		
		
	}

}

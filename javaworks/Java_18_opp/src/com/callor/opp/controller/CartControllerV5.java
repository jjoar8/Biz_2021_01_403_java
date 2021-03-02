package com.callor.opp.controller;

import com.callor.opp.service.CartServiceV1;

/*
 * Controller 클래스
 * web application 프로젝트를 수행할 때
 * 처음 시작하는 시작점 클래스
 * 
 * Service 등 모듈클래스를 객체로 선언하고
 * 모듈클래스의 method들을 호출하는 일만 수행
 * 
 */

public class CartControllerV5 {
	
	public static void main(String[] args) {
		
		CartServiceV1 csV1 = new CartServiceV1();
		
		System.out.println("=========================");
		System.out.println("쇼핑카트 상품추가");
		System.out.println("-------------------------");
		
		// 사용자로부터 키보드로 상품정보를 입력받아
		// 카트 리스트에 추가하는 코드
		csV1.inputCart();
		csV1.printCartList();
		
		
	}
		
}

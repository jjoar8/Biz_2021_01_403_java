package com.callor.opp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.opp.model.CartVO;

public class CartControllerV3 {
	
	public static void main(String[] args) {
		
		// CartVO 객체를 담을 cartList 리스트를 생성
		List<CartVO> cartList = new ArrayList<CartVO>();
		CartVO cartVO;
		
		// 키보드를 통해
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=====================================");
		System.out.println("장바구니에 추가할 항목을 입력하세요");
		System.out.println("-------------------------------------");
		
		for(int i = 0; i < 3; i++) { // 카트에는 3개의 상품을 추가
			cartVO = new CartVO();
			
			System.out.print("구매자 이름 >> ");
			String strUserName = scan.nextLine();
			cartVO.setCartUserName(strUserName);
			
			System.out.print("상품명 >> ");
			String strPName = scan.nextLine();
			cartVO.setCartPName(strPName);
			
			System.out.print("수량 >> ");
			String strQty = scan.nextLine();
			cartVO.setCartQty(Integer.valueOf(strQty));
			
			System.out.print("가격 >> ");
			String strPrice = scan.nextLine();
			cartVO.setCartPrice(Integer.valueOf(strPrice));
			
			cartList.add(cartVO);
		}
		
		System.out.println("=====================================");
		System.out.println("장바구니");
		System.out.println("-------------------------------------");
		
		for(int i = 0; i < 3; i++) {
			cartVO = cartList.get(i);
			System.out.printf("%s\t%s\t%d\t%d\n", 
						cartVO.getCartUserName(), 
						cartVO.getCartPName(), 
						cartVO.getCartPrice(), 
						cartVO.getCartQty());
		}
		
	
	}
	
}

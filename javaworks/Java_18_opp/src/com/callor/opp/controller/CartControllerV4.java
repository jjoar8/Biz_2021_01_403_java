package com.callor.opp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.opp.model.CartVO;

public class CartControllerV4 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<CartVO> cartList = new ArrayList<CartVO>();
		
		for(int i = 0; i < 3; i++) {
			
			System.out.println("=========================");
			System.out.println("쇼핑카드 상품추가");
			System.out.println("-------------------------");
			
			System.out.print("구매자 >> ");
			String strUserName = scan.nextLine();
			
			System.out.print("상품명 >> ");
			String strPName = scan.nextLine();
			
			int intQty = 0;
			while(true) { 
				System.out.print("수량 >> ");
				String strQty = scan.nextLine();
				try {
					intQty = Integer.valueOf(strQty);
					if(intQty < 1) {
						System.out.println("수량은 1 이상");
						continue;
					}
				} catch (Exception e) {
					System.out.println("수량은 숫자로 입력하세요");
				}
				break;
			}
			
			int intPrice = 0;
			while(true) { 
				System.out.print("단가 >> ");
				String strPrice = scan.nextLine();
				try {
					intPrice = Integer.valueOf(strPrice);
					if(intPrice < 1000) {
						System.out.println("단가는 1000원 이상");
						continue;
					}
				} catch (Exception e) {
					System.out.println("단가는 숫자로 입력하세요");
				}
				break;
			}
			
			CartVO cartVO = new CartVO();
			cartVO.setCartUserName(strUserName);
			cartVO.setCartPName(strPName);
			cartVO.setCartQty(intQty);
			cartVO.setCartPrice(intPrice);
			
			cartList.add(cartVO);
		} // end for
		
		System.out.println("=====================================");
		System.out.println("구매자\t상품명\t단가\t수량");
		System.out.println("-------------------------------------");
				
		for(int i = 0; i < 3; i++) {
			System.out.printf("%s\t%s\t%d\t%d\n", 
					cartList.get(i).getCartUserName(), 
					cartList.get(i).getCartPName(), 
					cartList.get(i).getCartPrice(), 
					cartList.get(i).getCartQty());
		}
		
		System.out.println("=====================================");
		
		
	}

}

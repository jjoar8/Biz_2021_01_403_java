package com.callor.opp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.opp.model.CartVO;

public class CartServiceV1 {
	
	// CartServiceV1 클래스에 cartList 객체를 인스턴스변수로 선언
	List<CartVO> cartList = new ArrayList<CartVO>();
	
	public void inputCart() {
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			
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
					if(intQty < 2) {
						System.out.println("수량은 2 이상");
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
		}
		
	}
	
	public void printCartList() {
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

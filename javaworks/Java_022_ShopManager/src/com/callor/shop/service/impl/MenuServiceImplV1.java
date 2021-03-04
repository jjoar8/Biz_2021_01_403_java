package com.callor.shop.service.impl;

import java.util.Scanner;

import com.callor.shop.service.MenuService;
import com.callor.shop.values.Values;
import com.sun.jdi.Value;

/*
 * Impl 접미사
 * = 인터페이스를 implements하여 생성한 클래스다
 * 
 */

public class MenuServiceImplV1 implements MenuService{
	
	/*
	 * final 키워드는 변수, 객체를
	 * 		어디선가 변경하는 행위를 하지 못하도록 방지하는 조치
	 * 		= 상수선언이라고 한다
	 * 		final로 선언된 변수나 객체는 읽기 전용이다
	 * 
	 * 		final int num =0;
	 * 		num = 100; // 오류가 발생한다
	 * 
	 */
	private final Scanner scan;
	public MenuServiceImplV1() {
		scan = new Scanner(System.in);
	}
	
	@Override
	public Integer selectMenu() {
		
		while (true) {
			System.out.println(Values.dLine);
			System.out.println("빛나라 쇼핑몰 2021");
			System.out.println(Values.sLine);
			System.out.printf("%d. 장바구니 추가\n", Values.MENU_INPUT);
			System.out.printf("%d. 장바구니 전체 보기\n", Values.MENU_ALL_LIST);
			System.out.printf("%d. 구매자별 장바구니 보기\n", Values.MENU_USER_LIST);
			System.out.printf("QUIT. 업무종료");
			System.out.println(Values.sLine);
			System.out.print("선택 >> ");
			
			String strMenu = scan.nextLine();
			if (strMenu.equals("QUIT")) {
				return null;
			} 
			
			// 최적화가 덜된 코드
//			try {
//				Integer intMenu = Integer.valueOf(strMenu);
//				if(intMenu >= 1 && intMenu <= 3) {
//					return intMenu;
//				}
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
			
			// null 값을 받아야 하므로 Integer로 선언
			Integer intMenu = null;

			// try와 if문을 분리하는 것이 최적화된 코드이다
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
				System.out.printf("메뉴는 QUIT, %d ~ %d 입력 가능", Values.MENU_START, Values.MENU_LAST);
				continue;
			}
			
			if(intMenu >= Values.MENU_START && intMenu <= Values.MENU_LAST) {
				return intMenu;
			} else {
				System.out.printf("업무는 %d ~ %d 중에서 선택", Values.MENU_START, Values.MENU_LAST);
			}

		}

	}
	 
	
	
}

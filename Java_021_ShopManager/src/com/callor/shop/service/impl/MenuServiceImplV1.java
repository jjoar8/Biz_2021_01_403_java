package com.callor.shop.service.impl;

import java.util.Scanner;

import com.callor.shop.service.MenuService;

public class MenuServiceImplV1 implements MenuService {

	// 스캐너
	private Scanner scan;

	public MenuServiceImplV1() {
		scan = new Scanner(System.in);
	}

	@Override
	public Integer selectMenu() {

		while (true) {
			System.out.println("================================================");
			System.out.println("빛나라 쇼핑몰 2021");
			System.out.println("------------------------------------------------");
			System.out.println("1. 장바구니 상품 담기");
			System.out.println("2. 장바구니 전체 리스트 보기");
			System.out.println("3. 구매자별 장바구니 리스트 보기");
			System.out.println("QUIT. 끝내기");

			System.out.println("------------------------------------------------");
			System.out.print("입력 >> ");
			String strMenu = scan.nextLine();

			if (strMenu.equals("QUIT")) {
				System.out.println("빛나라 쇼핑몰 종료");
				break;
			}

			try {
				Integer intMenu = Integer.valueOf(strMenu); // Integer로 통일해주는 것이 좋다
				if (intMenu >= 1 && intMenu <= 3) {
					return intMenu;
				} else {
					System.out.println("숫자 1 ~ 3 또는 QUIT 입력");
				}
			} catch (Exception e) {
				System.out.println("숫자 1 ~ 3 또는 QUIT 입력");
			}

		} // end while

		return null;

	} // end selecMenu

}

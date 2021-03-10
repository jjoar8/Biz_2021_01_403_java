package com.callor.opp.service.impl;

import java.util.Scanner;

public class MenuServiceImplV2 implements MenuService {

	/*
	 * 인스턴스 객체변수 선언
	 * 생성자에서 객체변수 초기화하여 사용할 준비
	 * 
	 */
	
	private Scanner scan;
	public MenuServiceImplV2() {
		scan = new Scanner(System.in);
	}
	
	public void selectMenu() {

		while (true) {
			
			System.out.println("================================");
			System.out.println("카트 메뉴 System v1");
			System.out.println("--------------------------------");

			System.out.println("1. 카트 추가");
			System.out.println("2. 카트 삭제");
			System.out.println("3. 카트 리스트");
			System.out.println("Q. 끝내기");

			System.out.println("--------------------------------");
			System.out.print("선택 >> ");
			String strMenu = scan.nextLine();

			// 1. Q를 입력하면 끝내기
			if (strMenu.equals("Q")) { // 대소문자 구분하고 가능하면 QUIT까지 다 쓰는 것이 좋다
				System.out.println("끝내기");
				return;
			}

			// 2. Q가 아니면 숫자로 변경하여 메뉴 선택 처리
			try {
				int intMenu = Integer.valueOf(strMenu);
				if (intMenu == 1) {
					System.out.println("카트 추가");
				} else if (intMenu == 2) {
					System.out.println("카트 삭제");
				} else if (intMenu == 3) {
					System.out.println("카트 리스트");
				} else {
					System.out.println("메뉴는 1 ~ 3까지만 입력");
					continue;
				}
				break;
			} catch (Exception e) {
				System.out.println("다시 입력하세요(Q 또는 숫자 1 ~ 3)");
			}

		}

	}

}

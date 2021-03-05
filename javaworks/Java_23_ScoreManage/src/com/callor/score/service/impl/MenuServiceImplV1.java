package com.callor.score.service.impl;

import java.util.Scanner;

import com.callor.score.service.MenuService;
import com.callor.score.values.Values;

public class MenuServiceImplV1 implements MenuService{
	
	private final Scanner scan;
	public MenuServiceImplV1() {
		scan = new Scanner(System.in);
	}

	@Override
	public Integer selectMenu() {
		
		while (true) {
			System.out.println(Values.dLine);
			System.out.println("빛나라 고교 성적처리 시스템");
			System.out.println(Values.sLine);
			System.out.printf("%d. 학생성적 점수 생성", Values.MENU_MAKE_SCORE);
			System.out.printf("%d. 학생성적 점수 파일에 저장", Values.MENU_SAVE_SCORE);
			System.out.printf("%d. 성적결과 확인", Values.MENU_LOAD_SCORE);
			System.out.printf("QUIT. 끝내기");
			System.out.println(Values.sLine);
			System.out.print("선택 >> ");
			
			String strMenu = scan.nextLine();
			if (strMenu.equals("QUIT")) {
				return null;
			}
			
			Integer intMenu = null;
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			if (intMenu >= Values.MENU_START && intMenu <= Values.MENU_LAST) {
				return intMenu;
			} else {
				System.out.printf("메뉴는 %d ~ %d 중에서 선택하세요", Values.MENU_START, Values.MENU_LAST);
			}

		}
		
	} // end selectMenu() method
	
}

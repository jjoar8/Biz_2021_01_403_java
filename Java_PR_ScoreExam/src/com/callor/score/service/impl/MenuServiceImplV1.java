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
			System.out.println(Values.dLine(70));
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 파일로 저장");
			System.out.println("3. 성적 리스트 확인");
			System.out.println("QUIT. 끝내기");
			System.out.println(Values.sLine(70));
			System.out.print("선택 >> ");
			
			String strMenu = scan.nextLine();
			if (strMenu.equals("QUIT")) {
				return null;
			}
			
			Integer intMenu = null;
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
				System.out.println("1 ~ 3, QUIT 중 메뉴 입력");
			}
			if (intMenu >= 1 && intMenu <= 3) {
				return intMenu;
			} else {
				System.out.println("1 ~ 3, QUIT 중 메뉴 입력");
			}
		}
		
	} // end selectMenu() method

}

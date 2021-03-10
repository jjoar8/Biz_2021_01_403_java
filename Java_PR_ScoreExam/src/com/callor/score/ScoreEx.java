package com.callor.score;

import com.callor.score.service.MenuService;
import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.MenuServiceImplV1;
import com.callor.score.service.impl.ScoreServiceImplV1;

public class ScoreEx {
	
	public static void main(String[] args) {
		// 진입점 클래스
		
		ScoreService ss1 = new ScoreServiceImplV1();
		MenuService ms1 = new MenuServiceImplV1();
		
		while (true) {
			Integer menu = ms1.selectMenu();
			if (menu == null) {
				System.out.println("메뉴를 종료했습니다.");
				break;
			} else if (menu == 1) {
				ss1.inputScore();
			} else if (menu == 2) {
				ss1.saveScore();
			} else if (menu == 3) {
				ss1.printScore();
			}
		}
		
	}

}

package com.callor.opp.service.impl;

import java.util.Scanner;

public class MenuServiceImplV1 {

	private Scanner scan;

	public void selectMenu() {

		scan = new Scanner(System.in);

		System.out.println("================================");
		System.out.println("Java Menu System v1");
		System.out.println("--------------------------------");

		System.out.println("1. 카트추가");
		System.out.println("2. 카트삭제");
		System.out.println("3. 카트리스트");
		System.out.println("Q. 끝내기");

		System.out.println("--------------------------------");

		while(true) {
			System.out.print("선택 >> ");
			String strInput = scan.nextLine();
			if (strInput == "Q") {
				System.out.println("끝내기");
				break;
			}
			try {
				int intInput = Integer.valueOf(strInput);
				if (intInput == 1) {
					System.out.println("카트추가");
					break;
				} else if (intInput == 2) {
					System.out.println("카트삭제");
					break;
				} else if (intInput == 3) {
					System.out.println("카트리스트");
					break;
				}
			} catch (Exception e) {
				System.out.println("다시 입력하세요");
			}

		}

	}

}

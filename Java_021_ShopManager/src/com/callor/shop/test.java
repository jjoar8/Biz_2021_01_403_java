package com.callor.shop;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("입력 >> ");
			String strMenu = scan.nextLine();

			if (strMenu.equals("QUIT")) {
				System.out.println("장바구니를 종료합니다.");
				break;
			}

			while (true) {
				try {
					Integer intMenu = Integer.valueOf(strMenu);
					if (intMenu >= 1 && intMenu <= 3) {
						System.out.println(intMenu);
					} else {
						System.out.println("1 ~ 3 사이의 숫자를 입력해주십시오.");
					}
					break;
				} catch (Exception e) {
					System.out.println("1 ~ 3 정수 혹은 'QUIT' 입력");
					break;
				}
			}
		}

		System.out.println("null");

	}

}

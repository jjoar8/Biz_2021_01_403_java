package com.callor.applications;

import java.util.Scanner;

public class App_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 입력(2 ~ 9) >> ");
			int numInput = scan.nextInt();

			System.out.println("================================");
		
			boolean bYes2 = numInput >= 2;
			boolean bYes9 = numInput <= 9;
			if(bYes2 && bYes9) { 
				System.out.println("구구단 " + numInput + "단");
				System.out.println("--------------------------------");
				for(int i = 0; i < 8; i++) {
					int numDan = 2 + i;
						System.out.print(numInput);
						System.out.print(" × ");
						System.out.print(numDan);
						System.out.print(" = ");
						System.out.println(numInput * numDan);
				} 
				System.out.println("================================");
			} else {
				System.out.println(numInput + "을 입력하셨습니다");
				System.out.println("2 ~ 9까지 중 1개의 숫자를 입력하세요");
			}

		}
	}

}

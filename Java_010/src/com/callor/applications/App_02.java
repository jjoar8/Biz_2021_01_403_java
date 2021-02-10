package com.callor.applications;

import java.util.Scanner;

public class App_02 {
	
	public static void main(String[] args) {
		
		// System.in = 컴퓨터 키보드를 연결하는 것
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력(2 ~ 9) >> ");
		int numInput = scan.nextInt();

		System.out.println("================================");
		
		if(numInput >= 10) {
			System.out.println("2 ~ 9까지 중 1개의 숫자를 입력");
		} else if(numInput < 2) {
			System.out.println("2 ~ 9까지 중 1개의 숫자를 입력");
		} else {
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
		}
		
		System.out.println("================================");
	
	}

}


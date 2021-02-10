package com.callor.applications;

import java.util.Scanner;

public class App_01 {
	
	public static void main(String[] args) {
		
		// System.in = 컴퓨터 키보드를 연결하는 것
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력(2 ~ 9) >> ");
		int numInput = scan.nextInt();
		
		System.out.println("================");
		System.out.println("구구단 " + numInput + "단");
		System.out.println("----------------");
		
		for(int i = 0; i < 8; i++) {
			int numDan = 2 + i;
			
			System.out.print(numInput);
			System.out.print(" × ");
			System.out.print(numDan);
			System.out.print(" = ");
			System.out.println(numInput * numDan);
			
		}
		
		System.out.println("================");
	
	}

}


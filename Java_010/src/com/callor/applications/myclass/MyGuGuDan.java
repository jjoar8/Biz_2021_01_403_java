package com.callor.applications.myclass;

import java.util.Scanner;

	/* main() method가 없는 클래스 선언
	 * 
	 * 클래스.메서드()에 코드를 옮기고
	 * main()에서는 클래스를 객체로 생성한다음
	 * 객체.메서드() 방식으로 코드를 실행
	 * 
	 */

public class MyGuGuDan {
	
	/*
	 * public = 누구나 사용할 수 있는
	 * gugu() method 선언
	 * 
	 * 임의로 어떤 일을 수행하기 위한 명령문 생성
	 */
	
	public void gugu() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력(2 ~ 9) >> ");
		int numInput = scan.nextInt();
		
		
	}  // gugu end
	
	// print() method는 변수 선언명령문을 포함하고 있다
	public void print(int numInput) {
		
		System.out.println("=========================");
		System.out.println("구구단 " + numInput + "단");
		System.out.println("=========================");
		
		for(int i = 0; i < 8; i++) {
			int numDan = i + 2;
			System.out.print(numInput);
			System.out.print(" × ");
			System.out.print(numDan);
			System.out.print(" = ");
			System.out.println(numInput * numDan);
		}
		System.out.println("=========================");

		
	}

}

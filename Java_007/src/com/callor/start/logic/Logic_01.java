package com.callor.start.logic;

public class Logic_01 {
	
	/*
	 * 로직(Logic)  연산
	 * 참(yes, true), 거짓(no, false)을 판단하여
	 * 어떤 행위를 수행하는 연산
	 */

	public static void main(String[] args) {
		
		// 3이 2 미만인지
		System.out.println( 3 < 3 );
		System.out.println( 3 > 3 );
		
		// 3이 3 이냐
		System.out.println( 3 == 3 );
		
		// 3이 3 이하(보다 작거나 같냐)
		// 부등호 먼저 써야함
		System.out.println( 3 <= 3 );
		
		// 3이 3 이상
		System.out.println( 3 >= 3);
		
	}

}

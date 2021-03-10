package com.callor.start.logic;

public class Logic_02 {

	public static void main(String[] args) {
		
		// 불값, 논리연산결과를 담는 변수
		// boolean, Boolean(기능 추가)
		boolean bYes = 3 == 3;
		bYes = 3 > 3;
		System.out.println(bYes);
		
		int num1 = 55;
		int num2 = 65;
		
		bYes = num1 >= num2;
		
		// 곱셈 연산이 우선순위가 높다
		// 곱셈 먼저 연산하고 논리 연산을 한다
		// 그래도 괄호를 쳐주는 게 좋다
		bYes = num1 * 2 >= num2;

	}

}

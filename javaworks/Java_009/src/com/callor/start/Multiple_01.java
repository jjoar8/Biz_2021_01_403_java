package com.callor.start;

public class Multiple_01 {
	
	public static void main(String[] args) {
		
		int intSum = 0;
		
		// 1~ 100까지 범위에서
		for(int i = 0; i < 100; i++) {
			int num = i + 1;
			boolean bYes3 = num % 3 == 0;
			boolean bYes9 = num % 9 == 0;
			
			// 3의 배수이면서 (and) 9의 배수
			if(bYes3 && bYes9) {
				intSum += num;
			}
		}
		
		System.out.println("3과 9의 배수합 : " + intSum);
		
		System.out.println("================");
		
		intSum = 0;
		
		for(int i = 0 ; i < 100; i++) {
			int num1 = i + 1;
			boolean bYes3M = num1 % 3 == 0;
			boolean bYes9M = num1 % 9 == 0;
			
			// if() 비교연산문을 중복 처리하는 방식
			if(bYes3M) {
				if(bYes9M) {
					intSum += num1;
				}
			}
		}
		
		System.out.println("(if문) 3과 9의 배수합 : " + intSum);
		
	}

}

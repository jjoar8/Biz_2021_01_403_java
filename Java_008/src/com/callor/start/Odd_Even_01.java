package com.callor.start;

public class Odd_Even_01 {
	
	public static void main(String[] args) {

		// 1 ~ 100까지 범위 수 중에서 짝수들의 합을 구하시오
		// 1 ~ 100까지 범위 수 중에서 홀수들의 합을 구하시오

		int sumEven = 0;
		int sumOdd = 0;
		
		for(int i = 0; i < 100; i++) {
			
			// 1 ~ 100
			int num = i + 1;
			
			if(num % 2 == 0) {
				sumEven += num;
			}
			
			if(num % 2 == 1) {
				sumOdd += num;
			}
			
		}

		System.out.println("1 ~ 100까지 짝수들의 합 : " + sumEven);
		System.out.println("1 ~ 100까지 홀수들의 합 : " + sumOdd);
		

		System.out.println("================");
		// 선생님 코드
		
		int intSumEven = 0;
		for(int i = 0 ; i < 100 ; i++) {
			int num = i + 1;
			boolean bYes = num % 2 == 0;
			// 만약 bYes true 이면
			if(bYes) {
				// 값을 변수에 계속 더하라
				intSumEven += num;
			}
		}
		// 결과값을 출력하라
		System.out.println("짝수합 : " + intSumEven);
		
		int intSumOdd = 0;
		for(int i = 0 ; i < 100; i++) {
			int num = i + 1;
			boolean bYes = num % 2 == 1;
			if(bYes) {
				intSumOdd += num;
			}
		}
		System.out.println("홀수합 : " + intSumOdd);
		
		// 위에서 선언하고 사용했던 변수를 "재사용"할 때
		// 반드시 초기화(clear) 해야 한다.
		intSumOdd = 0;
		for(int i = 0 ; i < 100 ; i++) {
			int num = i + 1;
			boolean bYes = num %2 == 0;
			// if(bYes == false) {
			if(!bYes) {	
				intSumOdd += num;
			}
		}
		System.out.println("짝수false합 : " + intSumOdd);
		
	}
	
}

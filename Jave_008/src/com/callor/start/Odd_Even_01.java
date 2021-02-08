package com.callor.start;

public class Odd_Even_01 {
	
	public static void main(String[] args) {

		// 1 ~ 100까지 범위 수 중에서 짝수들의 합을 구하시오
		// 1 ~ 100까지 범위 수 중에서 홀수들의 합을 구하시오

		int sumEven = 0;
		int sumOdd = 0;
		int sumClass = 0;
		
		for(int i = 0; i < 100; i++) {
			
			// 1 ~ 100
			int num = i + 1;
			
			if(num % 2 == 0) {
				sumEven += num;
			}
			
			if(num % 2 == 1) {
				sumOdd += num;
			}
			
			// 선생님 코딩
			boolean bYes = i % 2 == 0;
			// 만약 bYes true 이면
			if(bYes) {
				// 값을 변수에 계속 더하라
				sumClass += i;
			}

		}

		System.out.println("1 ~ 100까지 짝수들의 합 : " + sumEven);
		System.out.println("1 ~ 100까지 홀수들의 합 : " + sumOdd);
		// 결과값을 출력하라
		System.out.println("1 ~ 100까지 짝수들의 합 : " + sumClass);
	}
	
}

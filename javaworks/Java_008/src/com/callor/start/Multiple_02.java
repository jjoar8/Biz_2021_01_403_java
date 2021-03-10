package com.callor.start;

public class Multiple_02 {
	
	public static void main(String[] args) {
		
		int sumMulti = 0;
		for(int i = 0; i < 100; i++) {
			int num = i + 7;
			boolean bYes = num % 3 == 0;
			if(!bYes) {
				sumMulti += num;
			}
		}
		
		System.out.println("7 ~ 106까지 범위 수 중에서");
		System.out.println("3의 배수가 아닌 수들의 합 구하기");
		System.out.println("----------------");
		System.out.println("결과값 : " + sumMulti);
		
		System.out.println("================");
		// 선생님 코딩
		
		// ~ 범위의 값을 덧셈(합산, 누적)용 변수선언
		int intSum = 0;
		for(int i = 0 ; i < 100 ; i++) {
			int num = i + 7;
			boolean bYes = num % 3 > 0; // 이렇게 해도 가능하다
			if(bYes) {
				intSum += num;
			}
		}
		
		intSum = 0;
		for(int i = 0 ; i < 100 ; i++) {
			int num = i + 7;
			boolean bYes = num % 3 != 0; // 3의 배수가 아닌 경우 true
			if(bYes) {
				intSum += num;
			}
		}
		
			System.out.println("3의 배수가 아닌 수의 합 : " + intSum);
	}

}

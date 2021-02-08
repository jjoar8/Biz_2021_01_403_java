package com.callor.start;

public class Multiple_01 {
	
	public static void main(String[] args) {
		
		// 7 ~ 106까지 3의 배수들의 합
		
		int sumMulti = 0;
		for(int i = 0; i < 100; i++) {
			int num = i + 7;
			if(num % 3 == 0) {
				sumMulti += num;
			}
		}
		
		System.out.println("3의 배수들의 합 : " + sumMulti);
		
		System.out.println("================");
		// 선생님 코딩
		
		int int3M = 0;
		for(int i = 0; i < 100; i++) {
			int num = i + 7;
			boolean bYes = num % 3 == 0;
			// if(num % 3 == 0) {
			// if(bYes == true) {
			if(bYes) {
				int3M += num;
				System.out.println(num + "는 3의 배수");
			}
		} // for end
		
		System.out.println("3의 배수합 : " + int3M);
		
	}

}

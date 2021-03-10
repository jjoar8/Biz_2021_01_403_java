package com.callor.start.jdk.random;

import java.util.Random;

public class Random_05 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int intEvenSum = 0;
		
		for(int i = 0; i < 100; i++) {
			int num = rnd.nextInt(100) + 1;
			boolean bYes = num % 2 == 0;
			if(bYes) {
				intEvenSum += num;
				System.out.println(num + "은(는) 짝수");
			}
		}
		
		System.out.println("랜덤 짝수의 합 : " + intEvenSum);
		
		
	}

}

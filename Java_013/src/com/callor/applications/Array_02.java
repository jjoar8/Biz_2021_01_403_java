package com.callor.applications;

import java.util.Random;

public class Array_02 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] intNum = new int[10];
		
		int intSum = 0;
		int intEven = 0;
		
		for(int i = 0; i < 10; i++) {
			intNum[i] = rnd.nextInt(100) + 1;	
		}
		
		for(int i = 0; i < 10; i++) {		
			intSum += intNum[i];
		}
		
		for(int i = 0; i < 10; i++) {
			boolean bYes = intNum[i]%2 == 0;
			if(bYes) {
				intEven += intNum[i];
			}
		}

		System.out.println("합계   : " + intSum);
		System.out.println("짝수합 : " + intEven);
		
		
		
	}

}

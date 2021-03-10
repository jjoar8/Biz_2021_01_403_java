package com.callor.applications;

import java.util.Random;

public class Array_05 {
	
	public static void main(String[] args) {
		
		int[] intNums = new int[100];
		
		Random rnd = new Random();
		
		for(int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(100) + 1;
		}

		System.out.println("================================");
		System.out.println("3의 배수이면서 5의 배수인 수");
		System.out.println("--------------------------------");
		
		int intSum = 0;
		for(int i = 0; i < intNums.length; i++) {
			boolean bYes = (intNums[i] % 3 == 0) && (intNums[i] % 5 == 0);
			if(bYes) {
				System.out.println(intNums[i]);
				intSum += intNums[i];
			}
		}
		
		System.out.println("--------------------------------");
		System.out.println("합계 : " + intSum);
		System.out.println("================================");
	}

}

package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV2;

public class HomeWork_011 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		
		int intPrimeSum = 0;
		int intPrimeCount = 0;
		
		int[] rndNums = new int[100];
		
		for(int i = 0; i < 100; i++) {
			rndNums[i] = rnd.nextInt(10000) + 2;	
		} // for end
		
		// 코드 수행 불가
		// psV2.prime(rndNums);
		for(int i = 0; i < rndNums.length; i++) {
			int num = rndNums[i];
			int result = psV2.prime(num);
			if(result > 0) {
				System.out.print(num + " , ");
				intPrimeSum ++;
				intPrimeCount ++;
			}
			
		} // for end
	
		System.out.println("합계 : " + intPrimeSum);
		System.out.println("합계 : " + intPrimeCount);
		
	}

}

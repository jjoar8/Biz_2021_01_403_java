package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV2;

public class HomeWork_010 {
	
	public static void main(String[] args) {
		
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		Random rnd = new Random();
		
		int intPrimeSum = 0;
		int intPrimeCount = 0;
		
		for(int i = 0; i < 100; i++) {
			int rndNum = rnd.nextInt(100);
			int result = psV2.prime(rndNum);
			if(result > 0) {
				System.out.print(rndNum + " , ");
				intPrimeSum += rndNum;
				intPrimeCount ++;
			}
		} // end for
		
		System.out.println();
		System.out.println("합계 : " + intPrimeSum);
		System.out.println("개수 : " + intPrimeCount);

	}

}

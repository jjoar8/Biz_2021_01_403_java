package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV2;

public class HomeWork_01 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] intNum = new int[100];
		for(int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(100000) + 2;
		}
		
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		int sum = 0;
		
		for(int i = 0; i < intNum.length; i++) {
			int result = psV2.prime(intNum[i]);
			if(result > 1) {
				System.out.println(intNum[i] + "는 소수");
				sum += intNum[i];
			}
		}
		
		System.out.println("===========================");
		System.out.println("임의의 소수 합 : " + sum);
		
	}

}

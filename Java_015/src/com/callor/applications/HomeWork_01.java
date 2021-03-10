package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV2;

public class HomeWork_01 {
	
	public static void main(String[] args) {
		
		// Random 클래스를 사용하여
		// "2 이상의 임의의 정수" 100개를 만들고
		Random rnd = new Random();
		int[] intNum = new int[100];
		for(int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(100000) + 2;
		}
		
		// PrimeSeviceV2의 prime() method를 호출하여
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		
		// 임의의 정수 100개 중 소수인 수들의 리스트 출력
		int sum = 0;
		for(int i = 0; i < intNum.length; i++) {
			int result = psV2.prime(intNum[i]);
			if(result > 0) {
				System.out.println(intNum[i] + "는 소수");
				// 소수인 수들의 합을 계산하여 출력
				sum += intNum[i];
			}
		}
		
		System.out.println("===========================");
		System.out.println("임의의 소수 합 : " + sum);
		
	}

}

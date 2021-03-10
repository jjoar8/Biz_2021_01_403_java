package com.callor.applications.service;

public class PrimeServiceV1 {
	
	public void prime(int num1) {
		
		int pos = 0;
		for(pos = 2; pos < num1; pos++) {
			if(num1 % pos == 0) {
				break;
			}
		}
		
		if(pos < num1) {
			System.out.println(num1 + "는 소수가 아님");
		} else {
			System.out.println(num1 + "는 소수임");
		}
		
		
	}

}

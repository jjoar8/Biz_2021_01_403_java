package com.callor.applications.service;

public class PrimeServiceV2 {
	
	public int prime(int num1) {
		
		int pos = 0;
		for(pos = 2; pos < num1; pos++) {
			if(num1 % pos == 0) {
				break;
			}
		}
		
		if(pos < num1) {
			return -1;
		} else {
			return num1;
		}
		
		
	}

}

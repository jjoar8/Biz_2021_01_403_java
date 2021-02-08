package com.callor.start;

public class Multiple_01 {
	
	public static void main(String[] args) {
		
		int sumMulti = 0;
		
		for(int i = 0; i < 100; i++) {
			
			int num = i + 7;
			
			if(num % 3 == 0) {
				sumMulti += num;
			}
			
		}
		
		System.out.println("7 ~ 106까지 3의 배수들의 합 : " + sumMulti);
		
	}

}

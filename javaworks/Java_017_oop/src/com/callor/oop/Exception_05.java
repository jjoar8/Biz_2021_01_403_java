package com.callor.oop;

import java.util.Random;

public class Exception_05 {
	
	public static void main(String[] args) {
		Random rnd = new Random();
		int num = 123;
		
		while(true) {
			int rndNum = rnd.nextInt(100);
			try {
				System.out.println(num/ rndNum);
			} catch (Exception e) {
				// 0으로 나눈 값은 표시가 안되며 무한연산
			}
		}
		
		
	}

}

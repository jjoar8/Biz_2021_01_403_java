package com.callor.applications;

import java.util.Random;

public class Score_04 {

	public static void main(String[] args) {
	
		Random rnd = new Random();

		String[] strName = new String[] {"홍길동", "이몽룡", "성춘향"};

		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];

		// 점수 랜덤으로

		for(int index = 0; index < strName.length; index++) {
			int rndScore = rnd.nextInt(100) + 1;
			intKor[index] = rndScore;

			rndScore = rnd.nextInt(100) + 1;
			intEng[index] = rndScore;

			rndScore = rnd.nextInt(100) + 1;
			intMath[index] = rndScore;

		}

		System.out.println("=================================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("---------------------------------");

		for(int i = 0; i < strName.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\n", strName[i], intKor[i], intEng[i], intMath[i]);
		}

		System.out.println("=================================");

	
	}
}

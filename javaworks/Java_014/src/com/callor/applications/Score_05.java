package com.callor.applications;

import java.util.Random;

public class Score_05 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		String[] strName = new String[] {"홍길동", "이몽룡", "성춘향"};
		
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		int[] intSum = new int[3];
		float[] floatAvg = new float[3];
		
		for(int index = 0; index < strName.length; index++) {
			int rndScore = rnd.nextInt(100) + 1;
			intKor[index] = rndScore;
			
			rndScore = rnd.nextInt(100) + 1;
			intEng[index] = rndScore;
			
			rndScore = rnd.nextInt(100) + 1;
			intMath[index] = rndScore;
			
			intSum[index] = intKor[index];
			intSum[index] += intEng[index];
			intSum[index] += intMath[index];
			
			floatAvg[index] = (intSum[index] / 3F);
			
		}
		
		System.out.println("===============================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------");
		
		
		for(int i = 0; i < strName.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.2f\n", 
								strName[i], intKor[i], intEng[i], intMath[i], intSum[i], floatAvg[i]);
		}
		
		System.out.println("===============================================");
		
		
		
	}

}

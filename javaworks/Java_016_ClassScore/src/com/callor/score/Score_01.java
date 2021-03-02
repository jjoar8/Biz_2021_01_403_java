package com.callor.score;

import java.util.Random;

public class Score_01 {
	
	public static void main(String[] args) {
		
		String[] strName = new String[] {"홍길동", "이몽룡", "성춘향", "장녹수", "임꺽정"};
		String[] strAddr = {"서울시", "익산시", "남원시", "한양시", "함흥시"}; // 바로 대입도 가능하다
		
		int index = strName.length; // 깔끔
		
		int[] intKor = new int[index];
		int[] intEng = new int[index];
		int[] intMath = new int[index];
		
		int[] intScoreSum = new int[index];
		float[] floatScoreAvg = new float[index];
		
		Random rnd = new Random();
		
		// 임의의 점수 생성
		for(int i = 0; i < strName.length; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}
		
		// 총점
		for(int i = 0; i < strName.length; i++) {
			intScoreSum[i] = intKor[i];
			intScoreSum[i] += intEng[i];
			intScoreSum[i] += intMath[i];
		}
		
		// 평균
		for(int i = 0; i < strName.length; i++) {
			floatScoreAvg[i] = intScoreSum[i] / 3F;
		}
		
		System.out.println("=============================================================");
		System.out.println("이름\t주소\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------------------------");
		
		for(int i =0; i < strName.length; i++) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%3.2f\n",
							strName[i], strAddr[i], intKor[i], intEng[i], intMath[i], intScoreSum[i], floatScoreAvg[i]);
		}
		
		System.out.println("=============================================================");
	}

}

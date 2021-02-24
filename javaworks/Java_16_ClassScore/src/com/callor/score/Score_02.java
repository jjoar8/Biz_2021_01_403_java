package com.callor.score;

import java.util.Random;

import com.callor.score.service.ScoreService_01;

public class Score_02 {
	
	public static void main(String[] args) {
		
		String[] strName = new String[] {"홍길동", "이몽룡", "성춘향", "장녹수", "임꺽정"};
		int[] intKor = new int[strName.length];
		int[] intEng = new int[strName.length];
		int[] intMath = new int[strName.length];
		
		// 성적 정보를 생성
		Random rnd = new Random();
		for(int i = 0; i < strName.length; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}
		
		ScoreService_01 ssV1 = new ScoreService_01();
		
		// ssV1 scoreSum() method
		int[] intScoreSum = new int[strName.length];
		for(int i = 0; i < strName.length; i++) {
			intScoreSum[i] = ssV1.scoreSum(intKor[i], intEng[i], intMath[i]);
		}
		
		// ssV1 scoreAvg() method
		float[] floatScoreAvg = new float[strName.length];
		for(int i = 0; i < strName.length; i++) {
			floatScoreAvg[i] = ssV1.scoreAvg(intScoreSum[i]);
		}
		
		System.out.println("================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------------");
		
		// ssV1 scorePrint() method
		for(int i = 0; i < strName.length; i++) {
			ssV1.scorePrint(strName[i], intKor[i], intEng[i], intMath[i], intScoreSum[i], floatScoreAvg[i]);
		}
		
		System.out.println("================================================");
			
	}

}

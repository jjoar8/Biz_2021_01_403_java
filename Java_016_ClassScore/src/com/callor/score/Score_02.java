package com.callor.score;

import java.util.Random;

import com.callor.score.service.ScoreServiceV1;

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
		
		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		
		System.out.println("================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------------");
		
		for(int i = 0; i < strName.length; i++) {
			
			// ssV1 scoreSum() method
			int[] intSum = new int[strName.length];
			intSum[i] = ssV1.scoreSum(intKor[i], intEng[i], intMath[i]);
		
			// ssV1 scoreAvg() method
			float[] floatAvg = new float[strName.length];
			floatAvg[i] = ssV1.scoreAvg(intSum[i]);
		
			// ssV1 scorePrint() method
			ssV1.scorePrint(strName[i], intKor[i], intEng[i], intMath[i], intSum[i], floatAvg[i]);
		}
		
		System.out.println("================================================");		
		
		
	}

}

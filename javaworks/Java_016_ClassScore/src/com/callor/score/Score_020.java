package com.callor.score;

import java.util.Random;

import com.callor.score.service.ScoreServiceV1;

public class Score_020 {
	
	public static void main(String[] args) {
		
		String[] strName = new String[] {"홍길동", "이몽룡", "성춘향", "장녹수", "임꺽정"};

		int[] intKor = new int[strName.length];
		int[] intEng = new int[strName.length];
		int[] intMath = new int[strName.length];
		
		int[] intSum = new int[strName.length];
		float[] floatAvg = new float[strName.length];
		
		Random rnd = new Random();
		for(int i = 0; i < strName.length; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}
		
		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		
		
		for(int i = 0; i < strName.length; i++) {
			intSum[i] = ssV1.scoreSum(intKor[i], intEng[i], intMath[i]);
		}
		
		for(int i = 0; i < strName.length; i++) {
			floatAvg[i] = ssV1.scoreAvg(intSum[i]);
		}
		
		System.out.println("================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------------");
		
		for(int i = 0; i < strName.length; i++) {
			// 한 학생의 성적 데이터를 한줄에 출력
			ssV1.scorePrint(strName[i], intKor[i], intEng[i], intMath[i], intSum[i], floatAvg[i]);
		}
		
		System.out.println("================================================");		
		System.out.println("~~~~~~~~~~다른 방식~~~~~~~~~~");
		
		// 이름,국어,영어,수학,총점,평균 배열을
		// 통째로 매개변수로 전달하고
		// ssV1.print() method에서 리스트를 출력
		ssV1.print(strName, intKor, intEng, intMath, intSum, floatAvg);

	
	}
	
}

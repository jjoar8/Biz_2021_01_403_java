package com.callor.score;

import java.util.Random;

import com.callor.score.model.ScoreVO;

public class Score_06 {
	
	public static void main(String[] args) {
		
		ScoreVO[] scoreVO = new ScoreVO[10];
		for(int i = 0; i < scoreVO.length; i++) {
			scoreVO[i] = new ScoreVO();
		}
		
		Random rnd = new Random();
		
		for(int i = 0; i < scoreVO.length; i++) {
			scoreVO[i].intKor = rnd.nextInt(100) + 1;
			scoreVO[i].intEng= rnd.nextInt(100) + 1;
			scoreVO[i].intMath = rnd.nextInt(100) + 1;
		}
		
		System.out.println("======================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------");
		
		for(int i = 0; i < scoreVO.length; i++) {
			
			int intSum = scoreVO[i].intKor;
			intSum += scoreVO[i].intEng;
			intSum += scoreVO[i].intMath;
			
			float floatAvg = intSum / 3F;
			
			System.out.printf("%d\t%d\t%d\t%d\t%3.2f\n", scoreVO[i].intKor, scoreVO[i].intEng, scoreVO[i].intMath, intSum, floatAvg);
			
		}
		
		System.out.println("======================================");
		
		
		
	}

}

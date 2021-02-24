package com.callor.score.service;

public class ScoreService_01 {

	public int scoreSum(int num1, int num2, int num3) {
		int scoreSum = num1;
		scoreSum += num2;
		scoreSum += num3;
		return scoreSum;		
	}
	
	public float scoreAvg(int num) {
		float scoreAvg = num / 3F;
		return scoreAvg;
	}
	
	public void scorePrint(String name, int kor, int eng, int math, int sum, float avg) {
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.2f\n", name, kor, eng, math, sum, avg);
	}
	
	
}

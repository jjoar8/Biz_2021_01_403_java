package com.callor.score.service;

public class ScoreServiceV1 {

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
	
	// 배열을 매개변수로 받는 print() method
	public void print (String[] strName, int[] intKor, int[] intEng, int[] intMath, int[] intSum, float[] floatAvg) {
		System.out.println("================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------------");
		for(int i = 0; i < strName.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.2f\n", strName[i], intKor[i], intEng[i], intMath[i], intSum[i], floatAvg[i]);
		} // for end
		System.out.println("================================================");
	}
	
	
}

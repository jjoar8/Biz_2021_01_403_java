package com.callor.applications.service;

public class ScoreServiceV4 {
	
	public void score(int intSum, float floatAvg) {
		
		System.out.println("총점 : " + intSum);
		System.out.println("평균 : " + floatAvg);
		
	}
	
	public void print(int intKor, int intEng, int intMath) {
		
		int intSum = intKor + intEng + intMath;
		double doubleAvg = intSum / 3D;
		
		System.out.println("===============================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------");
		System.out.print(intKor + "\t");
		System.out.print(intEng + "\t");
		System.out.print(intMath + "\t");
		System.out.print(intSum + "\t");
		System.out.println(doubleAvg);
		System.out.println("===============================================");
		
		
	}

}

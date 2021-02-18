package com.callor.applications.service;

public class ScoreServiceV4 {
	
	public void score(int intSum, float floatAvg) {
		
		System.out.println("총점 : " + intSum);
		System.out.println("평균 : " + floatAvg);
		
	}
	
	public void print(int intKor, int intEng, int intMath) {
		
		System.out.println("=======================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------");
		System.out.print(intKor + "\t");
		System.out.print(intEng + "\t");
		System.out.print(intMath + "\t");
		
		// 연산, 계산부분을 처리
		// 출력부분처리
		// int intSum = intKor + intEng + intMath;
		
		int intSum = 0;
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		System.out.print(intSum + "\t");
		
		double doubleAvg = intSum / 3D;
		
		System.out.println(doubleAvg);
		System.out.println("=======================================");
		
		
	}

}

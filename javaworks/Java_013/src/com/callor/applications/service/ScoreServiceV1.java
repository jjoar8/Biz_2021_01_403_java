package com.callor.applications.service;

import java.util.Scanner;

public class ScoreServiceV1 {
	
	int intKor = 0;
	int intEng = 0;
	int intMath = 0;
	int intSum = 0;
	float floatAvg = 0;
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요 >> ");
		intKor = scan.nextInt();

		System.out.print("영어 점수를 입력하세요 >> ");
		intEng = scan.nextInt();

		System.out.print("수학 점수를 입력하세요 >> ");
		intMath = scan.nextInt();
		
	}
	
	public void sum() {
		
	}
	
	public void avg() {
		
	}
	
	public void print() {
		
		System.out.println("=============================");
		System.out.printf("국어 점수 : %4d\n", intKor);
		System.out.printf("영어 점수 : %4d\n", intEng);
		System.out.printf("수학 점수 : %4d\n", intMath);
		
	}

}

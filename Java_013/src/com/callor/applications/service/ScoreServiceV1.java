package com.callor.applications.service;

import java.util.Scanner;

public class ScoreServiceV1 {
	
	// 클래스 영역에 선언된 변수들
	// 클래서 영역 = 맴버 영역
	// 인스턴스변수
	// ScoreServiceV1 ssV1 : 클래스를 객체로 선언
	// = new SSV1() : 객체의 초기화
	// 인스턴스 : 객체가 초기화 되면
	// 자동으로 사용할 준비가 되는 변수들
	
	private int intKor = 0;
	private int intEng = 0;
	private int intMath = 0;
	private int intSum = 0;
	private float floatAvg = 0;
	private Scanner scan = new Scanner(System.in);
	
	public void input() {	
		
		// input() method의 지역변수(맴버변수)
		// int intNum = 0;
		
		System.out.print("국어 점수를 입력하세요 >> ");
		intKor = scan.nextInt();

		System.out.print("영어 점수를 입력하세요 >> ");
		intEng = scan.nextInt();

		System.out.print("수학 점수를 입력하세요 >> ");
		intMath = scan.nextInt();
		
	}
	
	public void sum() {
		
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
	}
	
	public void avg() {
		
		floatAvg = intSum / 3F;
	
	}
	
	public void print() {
		
		System.out.println("=============================");
		System.out.printf("국어 : %d\n", intKor);
		System.out.printf("영어 : %d\n", intEng);
		System.out.printf("수학 : %d\n", intMath);
		System.out.printf("총점 : %d\n", intSum);
		System.out.printf("평균 : %3.2f\n", floatAvg);
		// %3.2f : 실수값을 출력하는데
		// 정수 부분 3자리, 소수점 이하 2자리 출력
		
	}

}

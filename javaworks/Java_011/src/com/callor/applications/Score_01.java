package com.callor.applications;

import java.util.Scanner;

public class Score_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 점수 입력(0 ~ 100) >> ");
		int scoreKor = scan.nextInt();
		// Blocking 되었다. Code Blocking
		// scan.nextInt() 메서드를 호출하면
		// 코드 동작이 멈추고, 사용자가 키보드로
		// 무엇인가 입력한 후 Enter를 누를 때까지
		// 이후 코드가 실행되지 않는다
		
		System.out.print("영어 점수 입력(0 ~ 100) >> ");
		int scoreEng = scan.nextInt();
		
		System.out.print("수학 점수 입력(0 ~ 100) >> ");
		int scoreMath = scan.nextInt();
		
		int scoreSum = 0;
		double scoreAvg = 0.0;
		
		scoreSum = scoreKor + scoreEng + scoreMath;
		// int intSum = intKor;
		// intSum += intEng;
		// intSum += intMath;
		
		// 내 코드
		// scoreAvg = scoreSum / 3;
		
		// float fAvg = intSum / 3;
		// fAvg 변수는 실수형이지만
		// intSum은 정수형, 3도 정수형이기 때문에
		// fAvg 변수에 저장되는 값은
		// 소수점 이하가 무조건 0으로 세팅된다.
		// 결과값은 실수형(float, double)으로 하고자 할때는
		// intSum변수 값이나, 숫자 3을 실수형으로 만들어줘야 한다
		
		scoreAvg = (double)scoreSum / 3;
		// 강제형변환하여 나눗셈
		// 또는 3을 실수형으로 만들어서 나눗셈
		// scoreAvg = intSum / 3.0f; 또는 3.0d;
		// intSum변수에 담긴 값은 자동형변환

		System.out.println("======================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------");
		System.out.print(scoreKor + "\t");
		System.out.print(scoreEng + "\t");
		System.out.print(scoreMath + "\t"); 
		System.out.print(scoreSum + "\t ");
		System.out.println(scoreAvg);
		System.out.println("======================================");	

	}

}

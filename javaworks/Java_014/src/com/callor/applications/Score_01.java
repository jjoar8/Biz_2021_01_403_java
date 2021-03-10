package com.callor.applications;

import java.util.Scanner;

public class Score_01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		
		// [개수] : 필요한 개수만큼 배열을 만들어라
		int[] intSum = new int[5];
		int[] intAvg = new int[100];
		
		// 3명 학생의 과목 성적 입력받기
		// 1. 국어과목의 3학생 점수를 입력받기
		// 2. 학생별로 국어, 영어, 수학 점수를 각각 입력받기

		// 1. 과목별로 학생 점수 입력받기

//		System.out.println("국어점수 입력");
//		System.out.println("1번 학생 >> ");
//		intKor[0] = scan.nextInt();
//		System.out.println("2번 학생 >> ");
//		intKor[1] = scan.nextInt();	
//		System.out.println("3번 학생 >> ");
//		intKor[2] = scan.nextInt();	
//		
//		System.out.println("영어점수 입력");
//		for(int index = 0; index < intEng.length; index++) {
//			int num = index + 1;
//			System.out.println(num + "번 학생 >> ");
//			intEng[index] = scan.nextInt();
//		}

		
		for(int i = 0; i < 3; i++) { // i < intKor.length
			int num = i + 1; // 2. 전체 변수를 만들어주는 것이 더 좋다
			System.out.printf("%d번 학생 국어점수 >> ", num); // 1. 같은 연산을 반복하면 (i + 1)
			intKor[i] = scan.nextInt();
			System.out.printf("%d번 학생 영어점수 >> ", num);
			intEng[i] = scan.nextInt();
			System.out.printf("%d번 학생 수학점수 >> ", num);
			intMath[i] = scan.nextInt();
		}
		
		
		System.out.println("============================");
		System.out.println("국어\t영어\t수학");
		System.out.println("----------------------------");
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("%d\t%d\t%d\n", intKor[i], intEng[i], intMath[i]);
		}
		
		System.out.println("============================");
		
		
	}

}

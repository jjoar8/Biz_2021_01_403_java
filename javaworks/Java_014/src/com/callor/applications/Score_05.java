package com.callor.applications;

import java.util.Random;

public class Score_05 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		String[] strName = new String[] {"홍길동", "이몽룡", "성춘향", "김자바"};
		
		// int[] intKor = new int[3];
		// 학생이름 배열 개수만큼
		int[] intKor = new int[strName.length];
		int[] intEng = new int[strName.length];
		int[] intMath = new int[strName.length];
		int[] intSum = new int[strName.length];
		float[] floatAvg = new float[strName.length];
		
		// 학생별로 점수를 입력(생성)하는 코드
		for(int i = 0; i < strName.length; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}
		
		// 학생별로 총점을 계산하는 코드
		for(int i = 0; i < strName.length; i++) {
			intSum[i] = intKor[i];
			intSum[i] += intEng[i];
			intSum[i] += intMath[i];
		}
		
		// 학생별로 평균을 계산하는 코드
		for(int i = 0; i < strName.length; i++) {
			floatAvg[i] = (float)intSum[i] / 3;
		}
		
		// 성적리스트 제목 출력
		System.out.println("===============================================");
		System.out.println("빛나리 학급 성적리스트");
		System.out.println("===============================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------");
		
		// 성적리스트 출력
		for(int i = 0; i < strName.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.2f\n", 
								strName[i], intKor[i], intEng[i], intMath[i], intSum[i], floatAvg[i]);
		}
		
		System.out.println("===============================================");
		
		
		
	}

}

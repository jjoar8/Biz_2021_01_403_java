package com.callor.start.logic;

/*
 * 화폐매수 개산
 * 
 * 4789800
 * 5만원권 : 95매
 * 1만원권 : 3매 : 5만원 /5
 * 5천원권 : 1매 : 1만원 /2
 * 1천원권 : 4매 : 5천원 /5
 * 5백원권 : 1개 : 1천원 /2
 * 1백원권 : 3개 : 5백원 /5
 * 
 */

public class Logic_05 {
	
	public static void main(String[] args) {
		
		// 언더바를 구분 기호를 넣을 수 있음
		// 5만원권 계산
		int pay = 4_789_800;
		int paper = 50_000;
		
		// 정수를 정수로 나누는 연산을 했을 경우
		// 결과도 정수(몫)으로 나타나는 연산 규칙을 활용
		int count = pay / paper;
		System.out.println(paper + "원권 : " + count);
		
		// 1만원권 계산
		// pay에서 5만원권 금액만큼 제외하고 계산
		pay -= (paper * count);
		paper /= 5;
		count = pay / paper;
		System.out.println(paper + "원권 : " + count);
		
		// 5천원권 계산
		pay -= (paper * count);
		paper /= 2;
		count = pay / paper;
		System.out.println(paper + "원권 : " + count);
		
		// 1천원권 계산
		pay -= (paper * count);
		paper /= 5;
		count = pay / paper;
		System.out.println(paper + "원권 : " + count);
		
		// 5백원권 계산
		pay -= (paper * count);
		paper /= 2;
		count = pay / paper;
		System.out.println(paper + "원권 : " + count);
		
		//1백원권 계산
		pay -= (paper * count);
		paper /= 5;
		count = pay / paper;
		System.out.println(paper + "원권 : " + count);
		
	}

}

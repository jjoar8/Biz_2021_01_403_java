package com.callor.score;

public class Sort_05 {
	
	public static void main(String[] args) {
		
		String strA = "A";
		String strB = "B";
		
		// 같은가
		boolean bYes = strA.equals(strB);
		System.out.println(bYes);
		
		// 원본.compareTo(비교본)
		// 	알파벳 순서에 따라
		// 	얼마나 거리가 떨어져 있는가
		System.out.println(strA.compareTo(strB));
		System.out.println(strB.compareTo(strA));
		
		// 원본 < 비교본 == < 0
		// 원본 > 비교본 == > 0
		System.out.println("A".compareTo("C"));
		System.out.println("A".compareTo("A"));
		System.out.println("A".compareTo("a"));
		
		/*
		 * 문자열 크기(??) 비교
		 * 
		 * 정렬을 위해 앞, 뒤를 구분 : compareTo() method
		 * 
		 * 문자열의 길이가 다른 경우 
		 * 	예측하기 어려운 값이 출력된다
		 * 	문자열 값을 기준으로 정렬하는 것은 어려움이 있다
		 * 
		 * 
		 */
		
		System.out.println("ABC".compareTo("abc"));
		
		// 10, 1, 11, 12
		// "10", "1", "11", "12"
		
		System.out.println("0001".compareTo("0020"));
		System.out.println("0020".compareTo("0001"));
		
		System.out.println("0020".compareTo("0001") > 0);
		
	}

}

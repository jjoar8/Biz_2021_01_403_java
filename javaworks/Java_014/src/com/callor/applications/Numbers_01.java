package com.callor.applications;

public class Numbers_01 {
	
	public static void main(String[] args) {
		
		/*
		 * 배열의 10개 선언 및 생성
		 * 
		 * 배열의 요소에 어떤 값을 저장할 때는
		 * intNums[위치] = 값 형식을 사용하는데
		 * 이때 위치의 값을 "(배열)첨자"라고 한다
		 * 
		 * intNum[3] = 100;
		 * ==> intNums 배열의 3번 첨자 위치에 100을 저장
		 * 
		 * 배열의 첨자 최대값은 항상 배열.length - 1 이다
		 * ==> new int[100] 이라고 배열을 생성했으면
		 * 		가장 마지막 첨자는 99가 된다
		 * 
		 */
		
	int intNums[] = new int[10];
	
	// 배열에 1 ~ 10까지 정수 순서대로 저장
	for(int i = 0; i < intNums.length; i++) {
		intNums[i] = i + 1;
	}
	
	// 배열에 저장된 정수를 Console에 출력
	for(int i = 0; i < intNums.length; i++) {
		System.out.printf("intNums[%d] 배열의 값 : %d\n", i, intNums[i]);
	}
		
		
	}

}

package com.callor.applications.sevice;

import java.util.Scanner;

public class ClassServiceV3 {
	
	// java에서는 인스턴스변수를 
	// private으로 제한한다
	
	private int intNum1 = 0;
	private int intNum2 = 0;
	Scanner scan = new Scanner(System.in);
	
	public void input() {
		System.out.print("첫번째 숫자 입력 >> ");
		intNum1 = scan.nextInt();
		System.out.print("두번째 숫자 입력 >> ");
		intNum2 = scan.nextInt();
	}
	
	/*
	 * scope()에서는 1개의 숫자를 키보드에서 입력 받아
	 * 변수 inNum1에 저장한다
	 * 하니반 여기에서 선언된 intNum1은
	 * 클래스 영영게 선언된 인스턴스변수와 이름만 같을 뿐
	 * 완전히 다른 변수이다
	 * 
	 * 따라서 scope() method가 종료된 이후에는
	 * 변수값에 접근할 수 없다
	 * 
	 * scope() method에서 선언된 intNum1변수를
	 * 지역변수라고 한다
	 * 
	 */
	
	public void scope() {
		System.out.println("숫자를 입력하세요");
		int intNum1 = scan.nextInt();
		// method 키워드에 void가 있으면
		// return 명령문이 생략되어 있는 것과 같다
		// 복습 때 확인하기
		return;
	}
	
	public void algebra() {
		
		System.out.println("====================================");
		System.out.println("사칙연산 결과");
		System.out.println("------------------------------------");

		System.out.print(intNum1);
		System.out.print(" + ");
		System.out.print(intNum2);
		System.out.print(" = ");
		System.out.println(intNum1 + intNum2);
		
		System.out.print(intNum1);
		System.out.print(" - ");
		System.out.print(intNum2);
		System.out.print(" = ");
		System.out.println(intNum1 - intNum2);
		
		System.out.print(intNum1);
		System.out.print(" × ");
		System.out.print(intNum2);
		System.out.print(" = ");
		System.out.println(intNum1 * intNum2);
		
		System.out.print(intNum1);
		System.out.print(" / ");
		System.out.print(intNum2);
		System.out.print(" = ");
		System.out.println(intNum1 / intNum2);
		
		System.out.println("====================================");
		
		/*
		 * print formatting 명령문
		 * "" 안에 문자열을 작성하여 출력문을 만드는 명령문
		 * %d 위치에 정수값을 대신 부착하여 출력문 생성
		 */
		System.out.printf(" %d + %d = %d \n", intNum1, intNum2, intNum1+intNum2);
		System.out.printf(" %d - %d = %d \n", intNum1, intNum2, intNum1-intNum2);
		System.out.printf(" %d × %d = %d \n", intNum1, intNum2, intNum1*intNum2);
		System.out.printf(" %d / %d = %d \n", intNum1, intNum2, intNum1/intNum2);
		
	}
	

}

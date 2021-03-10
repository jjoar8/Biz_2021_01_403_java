package com.callor.oop;

import java.util.Scanner;

public class String_01 {
	
	public static void main(String[] args) {
		
		String str1 = "대한민국";
		String str2;
		// System.out.println(num2);
		// 값이 없어 오류
		
		int num1 = 0;
		Integer num2 = null;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 >> ");
		String strNum = scan.nextLine();
		
		// null
		// 0이 아니고 어떤 값도 아닌 아무것도 없는 것
		// 클래스를 객체를 선언할 때
		// 임시로 설정하는 값으로 많이 사용한다
		// Random rnd = null;
		if(strNum == null) { // strNum == 0 : 0인지 입력을 안한건지 구분이 어려움
			System.out.println("숫자를 반드시 입력하세요");
		}
		
		
		
	}

}

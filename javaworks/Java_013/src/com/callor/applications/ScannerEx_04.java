package com.callor.applications;

import java.util.Scanner;

public class ScannerEx_04 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		System.out.print("국어 >> ");
		String strKor = scan.nextLine();
		
		System.out.print("영어 >> ");
		String strEng = scan.nextLine();
		
		int intKor = Integer.valueOf(strKor);
		int intEng = Integer.valueOf(strEng);
		
		System.out.println("합계 : " + (intKor + intEng));
		
		
		
		
	}

}

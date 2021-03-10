package com.callor.applications;

import java.util.Scanner;

public class ScannerEx_05 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열 >> ");
		String str1 = scan.nextLine();
		System.out.println("입력한 문자열 : " + str1);
		
		System.out.print("정수 >> ");
		String strNum1 = scan.nextLine();
		int intNum1 = Integer.valueOf(strNum1);
		
		System.out.print("실수 >> ");
		String strNum2 = scan.nextLine();
		float floatNum2 = Integer.valueOf(strNum2);
		
	}

}

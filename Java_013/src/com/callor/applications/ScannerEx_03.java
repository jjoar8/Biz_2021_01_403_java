package com.callor.applications;

import java.util.Scanner;

public class ScannerEx_03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		System.out.print("이름 >> ");
		String strName = scan.nextLine();
		
		System.out.println("과목을 입력하세요");
		System.out.print("국어 >> ");
		String strKor = scan.nextLine();
		
		System.out.print("영어 >> ");
		String strEng = scan.nextLine();
		
		System.out.println("===============================");
		System.out.println("이름\t국어\t영어\t총점");
		System.out.println("-------------------------------");
		System.out.print(strName + "\t");
		System.out.print(strKor + "\t");
		System.out.print(strEng + "\t");
		
		String strSum = strKor;
		strSum += strEng;
		System.out.print(strSum + "\n");
		
	}

}

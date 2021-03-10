package com.callor.applications;

import java.util.Scanner;

public class Score_02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] strName = new String[3];
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		
		for(int index = 0; index < strName.length; index++) {
			int num = index + 1;
//			String[] strKor = new String[3];
//			String[] strEng = new String[3];
//			String[] strMath = new String[3];
			
			System.out.println("이름과 성적을 입력하세요");
			
			System.out.printf("이름 >> ", num);
			strName[index] = scan.nextLine();
			
			System.out.print("국어 >> ");
			// 문자열형으로 입력받고
			String strScore = scan.nextLine();
			// 문자영형숫자를 정수로 변경하여 저장
			intKor[index] = Integer.valueOf(strScore);
			
			System.out.print("영어 >> ");
			strScore = scan.nextLine();
			intEng[index] = Integer.valueOf(strScore);
			
			System.out.print("수학 >> ");
			strScore = scan.nextLine();
			intMath[index] = Integer.valueOf(strScore);
			
			// scan.nextLine();
			
//			intKor[index] = Integer.valueOf(strKor[index]);
//			intEng[index] = Integer.valueOf(strEng[index]);
//			intMath[index] = Integer.valueOf(strMath[index]);
			
		}
		
		System.out.println("=============================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("-----------------------------");
		
		for(int i = 0; i < strName.length; i++) {
			System.out.printf("%s\t%3d\t%3d\t%3d\n", strName[i], intKor[i], intEng[i], intMath[i]);
		}
		
		System.out.println("=============================");
		
	}

}

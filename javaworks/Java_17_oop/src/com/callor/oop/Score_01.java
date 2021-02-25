package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ScoreVO;

public class Score_01 {
	
	public static void main(String[] args) {
		
		ScoreVO scVO = new ScoreVO();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("==================================");
		System.out.println("학생 정보 입력");
		System.out.println("----------------------------------");
		
		System.out.print("이름 >> ");
		scVO.strName = scan.nextLine();
		
		while(true) {
			try {
			System.out.print("국어 >> ");
			String strKor = scan.nextLine();
			scVO.intKor = Integer.valueOf(strKor);			
			} catch (NumberFormatException e) {
				System.out.println("반드시 숫자만 입력하세요");
				continue;
			} // end try
			if(scVO.intKor < 50) {
				System.out.println("점수는 50점 이상 입력 가능합니다");
			} else if(scVO.intKor > 100) {
				System.out.println("점수는 100점까지 입력 가능합니다");
			} else {
				break;
			}// end if
		} // end while
		
		while(true) {
			try {
			System.out.print("영어 >> ");
			String strEng = scan.nextLine();
			scVO.intEng = Integer.valueOf(strEng);			
			} catch (NumberFormatException e) {
				System.out.println("반드시 숫자만 입력하세요");
				continue;
			} // end try
			if(scVO.intEng < 50) {
				System.out.println("점수는 50점 이상 입력 가능합니다");
			} else if(scVO.intEng > 100) {
				System.out.println("점수는 100점까지 입력 가능합니다");
			} else {
				break;
			}// end if
		} // end while
		
		while(true) {
			try {
			System.out.print("수학 >> ");
			String strMath = scan.nextLine();
			scVO.intMath = Integer.valueOf(strMath);			
			} catch (NumberFormatException e) {
				System.out.println("반드시 숫자만 입력하세요");
				continue;
			} // end try
			if(scVO.intMath < 50) {
				System.out.println("점수는 50점 이상 입력 가능합니다");
			} else if(scVO.intMath > 100) {
				System.out.println("점수는 100점까지 입력 가능합니다");
			} else {
				break;
			}// end if
		} // end while
		
		
		System.out.println("===============================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("-------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\n", scVO.strName, scVO.intKor, scVO.intEng, scVO.intMath);
		System.out.println("===============================");

	
	
	}

}

package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_011 {
	
	public static void main(String[] args) {
		
		// Random 클래스를 사용하여 rnd 객체를 선언하고
		// = new Random() 명령을 사용하여
		// rnd 객체를 인스턴스화(化..으로 만든다) 시킨다
		// rnd : Random 클래스의 인스턴스
		Random rnd = new Random();
		int[] intNums = new int[100];
		
		// 1 ~ 10까지 중 임의의 숫자를 생성하여
		// intNums의 i번째 위치에 저장
		for(int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}
		
		// 키보드 입력을 받기 위해 Scanner 클래스를
		// scan 객체로 선언
		// 				scan 객체를 인스턴스화 하기
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 1 ~ 10까지 중 숫자 입력!");
		System.out.print("숫자 >> ");
		int keyNum = scan.nextInt();
		
		// 키보드로 입력 받은 값(keyNum에 저장되어 있다)과
		// 같은 값들이 몇번(몇개) 저장되어 있는지

		int count = 0; // 몇개인지 개수를 헤아릴 변수
		for(int i = 0; i < intNums.length; i++) {
			boolean bYes = intNums[i] == keyNum;
			if(bYes) {
				count++;
			}
		}
		
		System.out.println(keyNum + "의 갯수 : " + count);
		
	}

}

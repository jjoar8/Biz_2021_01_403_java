package com.callor.applications.service;

import java.util.Scanner;

/*
 * 클래스 extends(확장, 상속)
 * 
 * ScoreServiceV4 : Parent(부모) 클래스
 * ScoreServiceExtendsV1 : child(자식) 클래스
 * 
 * 단순한 extends
 * 		부모 클래스에 정의된 모든 method를
 * 		코드한줄 추가, 수정 없이 그대로 사용할 수 있다
 * 
 * 추가 extends
 * 		부모 클래스에 정의된 method와
 * 		새롭게 추가된 method가 있는
 * 		확장된 클래스의 생성
 * 
 */

// 클래스 선언문
//이후 main() method를 만들거나 무언가를 호출
public class ScoreServiceExtendsV1 
				extends ScoreServiceV4 { 
				// score() method 와 print() method 코드를 복사해옴
				// ScoreServiceV4에 있는 메서드에 내가 더 추가서 쓰겠다
	
	// input() method가 하는 일
	// 입력 받은 정수 값이 0 ~ 100 사이의 수이면 입력값을 프린트한다
	// 0 ~ 100 사이의 값이 아니면 경고를 출력하고 다시 입력 받기를 반복한다
	
	
	// 문자열형변수 1개를 매개변수로 갖는 input() method
	// public void input(String subject) {
	public int input(String subject) {
		
		// 시스템 키보드로 입력한 값을 scan 유틸로 받아온다
		Scanner scan = new Scanner(System.in);
		
		// 입력값을 받기 위한 정수형변수 intScore를 선언하고 초기화한다
		int intScore = 0;
		while(true) { // while문을 반복한다
			System.out.print(subject + " 점수 입력 >> "); // 입력값을 받기 위한 안내문
			intScore = scan.nextInt(); // 입력값을 받아 변수 intScore에 저장한다
			
			
//			if(intScore < 0 || intScore > 100) {
//				System.out.println("점수는 0 ~ 100 까지 입력");
//			} else {
//				break;
//			}
			// 불친절한 설명
			
			
			if(intScore < 0) { // 입력값이 0 미만
				System.out.println(subject + " 점수는 0점 이상 입력"); // 경고 출력
			} else if(intScore > 100) { // 입력값이 100 초과
				System.out.println(subject + " 점수는 100점 이하 입력"); // 경고 출력
			} else { // 입력값이 정상이면
				break; // while문을 종료한다
			}
					
		}
		
		// System.out.println("입력한 점수 : " + intScore); // 입력값을 프린트
		return intScore; // return을 사용하려면 void 안됨
		
	}

}

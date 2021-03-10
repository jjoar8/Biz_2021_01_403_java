package com.callor.variable;
/*
 * 반복문
 * 똑같은 명령문들로 구성된 코드가 있을때
 * 명령문을 한번만 작성하고(코딩하고)
 * 일정한 횟수만큼 실행하도록 하는 코딩 방법
 */

public class Loop_01 {

	public static void main(String[] args) {
		
		// for() {   } 명령문은 반복문이라고 한다.
				
		for( ;; ) {
			System.out.println("대한민국만세");	
		}
		// 계속 반복 > terminate 버튼을 눌러야 멈춘다

		// 현재 for() {   } 명령문이 무한 반복되기 때문에
		// 아래 코드는 실행될 수가 없다
		// 필요 없는 코드가 되어버린다
		// System.out.println("잘가세요");
		// unreachable code
		
	}

}

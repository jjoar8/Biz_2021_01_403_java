package com.callor.start.loop;

public class While_01 {
	
	public static void main(String[] args) {
		
		int count = 0;
		System.out.println(3 + 4 * 3 - 3);
		System.out.println(3 - 4 * 3 + 3);
		
		/*
		 * 단항연산자(++, --)가 변수의 뒤(끝)에 있을 경우
		 * 현재 명령어를 모두 실행하고 그 이후레
		 * 1을 증가(++) 또는 감소(--) 한다
		 */
		
		System.out.println(10 + 20 + 30 + count++); // count가 0인 상태
		System.out.println(10 + 20 + 30 + count);
		count += 1;
		
		System.out.println("================");
		
		count = 0;
		// 무한반복
		// for( ;; ) {   }
		while(true) {
			System.out.println(count++ + "대한민국");
			if(count > 10) {
				break;
			}
		}
		
		
	}

}

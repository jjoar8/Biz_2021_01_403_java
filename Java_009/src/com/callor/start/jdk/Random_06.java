package com.callor.start.jdk;

import java.util.Random;

public class Random_06 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		for(int i = 0; i < 100; i++) {
			int num1 = i + 1;
			int num2 = rnd.nextInt(100) + 1;
			boolean bYes = num2 < 5;
			if(bYes) {
				System.out.println(num2 + "은(는) " + num1 + "번째 숫자입니다");
				break;
				// 절대 실행되지 않는다.
			}
		}
		
		System.out.println("================");
		
		int intEnd = 100;
		int count = 0;
		for(count = 0 ; count < intEnd ; count++) {
			int num = rnd.nextInt(100) + 1;
			if(num > 50) {
				break;
			}
		}
		
		// for() 반복문이 정상적으로 수행되고나면
		// count와 intEnd는 count == intEnd가 된다

		if(intEnd > count) {
			// for()가 어떤 이유로 중간에 break 되었다
			System.out.println("for 중단");
			System.out.println((count + 1) + "번째에서 값 발견");
		} else {
			System.out.println("for 반복 수행 모두 완료");
			System.out.println("값을 찾을 수 없음");
		}	

		
	}

}

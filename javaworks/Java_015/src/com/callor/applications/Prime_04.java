package com.callor.applications;

import java.util.Random;

/*
 * 배열 없이 단순하게 난수를 생성하고
 * 소수인지 판별하여 출력하기
 * 중복(이중) 반복문
 * 
 */

public class Prime_04 {
	
	public static void main(String[] args) {

		int intPrimeSum = 0;
		int intPrimeCount = 0;
		
		Random rnd = new Random();
		for(int i = 0; i < 10; i++) {
			int rndNum = rnd.nextInt(1000) + 2;
			
			// 생선된 난수(rndNum)값이 소수인지 검사
			int index = 0;
			for(index = 2; index < rndNum; index++) {
				if(rndNum % index == 0) {
					break;
				} // if end
			} // 안쪽 for end
			
			if(index < rndNum) {
				System.out.println(rndNum + "는 소수 아님");
			} else {
				System.out.println(rndNum + "는 소수");
				intPrimeSum += rndNum;
				intPrimeCount ++;
			} // if end
		} // 바깥 for end
		
		System.out.println("합계 : " + intPrimeSum);
		System.out.println("개수 : " + intPrimeCount);
		
	}

}

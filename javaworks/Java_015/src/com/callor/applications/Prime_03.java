package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.PrimeServiceV2;

public class Prime_03 {
	
	public static void main(String[] args) {
		
		// 키보드로 2 이상 숫자를 입력 받는다
		Scanner scan = new Scanner(System.in);
		System.out.print("2 이상 숫자 입력 >> ");
		int input = scan.nextInt();
		
		// PrimeServiceV2의 prime() method를 호출하여
		// input값을 넣고 반환된 값을 result에 저장한다
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		int result = psV2.prime(input);
		
		// input 숫자가 소수가 아니면 result 값은 -1이다
		if(result < 0) {
			System.out.println(input + "는 소수가 아님");
		} 
		// input 숫자가 소수면 같은 숫자가 반환된다
		else {
			System.out.println(input + "는 소수임");
		}
		
	}

}

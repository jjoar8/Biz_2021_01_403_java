package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.PrimeServiceV2;

public class Prime_03 {
	
	public static void main(String[] args) {
		
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		Scanner scan = new Scanner(System.in);
				
		System.out.print("2 이상 숫자 입력 >> ");
		int keyNum = scan.nextInt();
		
		if(psV2.prime(keyNum) < 0) {
			System.out.println(keyNum + "는 소수가 아님");
		} else {
			System.out.println(keyNum + "는 소수임");
		}
		
	}

}

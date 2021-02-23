package com.callor.applications;

import java.util.Scanner;

public class Prime_010 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("2 이상 정수 입력 >> ");
		int keyNum = scan.nextInt();
		
		int pos = 0;
		for(pos = 2; pos < keyNum; pos++) {
			if(keyNum % pos == 0) {
				break;
			}
		}
		
		// pos의 값은?
		System.out.println(pos);
		
		// for 반복문이 중간에 break 되면
		// 		항상 pos < keyNum 관계가 된다
		
		if(pos < keyNum) {
			System.out.println(keyNum + "는 소수가 아님");
		
		//for 반복문이 break 없이 모두 완료되었으면
		} else {
			System.out.println(keyNum + "는 소수임");
		}
		
		
	}

}

package com.callor.applications;

import java.util.Scanner;

public class Prime_01 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
				
		System.out.print("2 이상의 정수 입력 >> ");
		int intInput = scan.nextInt();
				
		for(int i = 0; i < intInput; i++) {
			int num = i + 2;
			if((intInput / num == 1) && (intInput % num == 0)) {
				System.out.println(intInput + "은(는) 소수입니다");
			} else if(intInput % num == 0){
				System.out.println(intInput + "은(는) 소수가 아닙니다");
				break;
			}
		}
		
	}	

}

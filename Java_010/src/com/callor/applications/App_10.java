package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.myclass.MyGuGuDan;

public class App_10 {
	
	public static void main(String[] args) {
		
		MyGuGuDan myDan = new MyGuGuDan();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("숫자 (2 ~ 9) >> ");
			int num = scan.nextInt();
			
			if(num < 2 || num > 9) {
				System.out.println("어허 제대로 입력하슈");
				System.out.println("2 ~ 9까지 숫자만 입력하슈");
				System.out.println("장난ㄴㄴ 다시 입력");
			} else {
				myDan.print(num);
			}
		}
		
		
	}

}

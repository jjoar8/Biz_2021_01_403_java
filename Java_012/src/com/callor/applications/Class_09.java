package com.callor.applications;

import com.callor.applications.sevice.ClassServiceV7;

import java.util.Scanner;

public class Class_09 {
	
	public static void main(String[] args) {
		
		ClassServiceV7 csV7 = new ClassServiceV7();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력(2 ~ 9) >> ");
		int num = scan.nextInt();
		
		csV7.guguDan(num);
		
	}

}

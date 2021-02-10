package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.myclass.MyGuGuDan;

public class App_08 {
	
	public static void main(String[] args) {
		
		MyGuGuDan myDan = new MyGuGuDan();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 (2 ~ 9) >> ");
		int num = scan.nextInt();
		
		// 변수가 붙은게 아니라 키보드로 입력한 숫자가 전달 되는 것
		myDan.print(num);
		
	}

}

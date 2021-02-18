package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

import com.callor.applications.myclass.MyGuGuDan;

public class App_07 {
	
	public static void main(String[] args) {
		
		MyGuGuDan myGu = new MyGuGuDan();
		
		// MyGuGUDan 클래스에 정의된 print() method 호출
		// MyGuGuDan 클래스의 print() method 호출
		// print(int) . . . arguments ()
		// () 안에 포함되는 값을 arguments라고 한다
		myGu.print(6);
		
		Random rnd = new Random();
		rnd.nextInt(10);
		
		Scanner scan = new Scanner(System.in);
		scan.nextInt();
		
		Random rd = new Random();
		rd.nextInt();
		
		
	}

}

package com.callor.start.jdk.keyinput;

import java.util.Random;
import java.util.Scanner;

public class KeyInput_03 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		// Random 클래스를 사용하여 1 ~ 100까지 숫자 중 1개를 생성하여
		// num1 변수에 저장
		int num1 = rnd.nextInt(100) + 1;
		
		System.out.print("숫자 입력 >> ");
		int num2 = scan.nextInt();
		
		System.out.print(num2 + "은(는) ");
		
		if(num2 > num1) {
			System.out.println(num1 + "보다 크다");
		} else if(num2 == num1) {
			System.out.println(num1 + "와 같다");
		} else if(num2 < num1) {
			System.out.println(num1 + "보다 작다");
		}
		
	}

}

package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_02 {
	
	public static void main(String[] args) {
		
		// 1. 100개의 요소를 저장할 수 있는
		// 정수형 배열 intNums 선언 및 생성(초기화)
		int[] intNum = new int[100];
		
		// 2. Random 클래스를 사용하여 1 ~ 10까지의 
		// 정수를 생성하여 intNums 배열에 저장
		Random rnd = new Random();
		for(int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(10) + 1;
		}
		
		// 3. Scanner 클래스를 사용하여 키보드를 통해
		// 1 ~ 10까지 정수를 하나 입력 받고
		
		Scanner scan = new Scanner(System.in);
		System.out.print("1 ~ 10까지 정수 입력 >> ");
		int intInput = scan.nextInt();
		
		// 입력 받은 정수가 
		// 배열 intNums의 몇 번째에 나타나는지 위치 번호 출력
		
		for(int i = 0; i < intNum.length; i++) {
			if(intNum[i] == intInput) {
				System.out.printf("%d은(는) %d번째에 나타납니다\n", intInput, i);
			}
		}
		
		
		
		
	}

}

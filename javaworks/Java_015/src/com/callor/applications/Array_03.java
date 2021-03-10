package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_03 {
	
	public static void main(String[] args) {
		
		int[] intNum = new int[100];
		
		Random rnd = new Random();
		for(int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(10) + 1;
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("1 ~ 10까지 정수 입력 >> ");
		int intInput = scan.nextInt();
		
		// 입력 받은 정수가 
		// 배열 intNums의 몇번째에 최초로 나타나는지
		
		for(int first = 0; first < intNum.length; first++) {
			if(intNum[first] == intInput) {
				System.out.printf("%d은(는) %d번째에서 최초로 나타납니다\n", intInput, first);
				break;
			}
		}
		
		
		
		
	}

}

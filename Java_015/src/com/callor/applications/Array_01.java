package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_01 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		int[] intNums = new int[100];
		int inputNums = 0;
		int countNums = 0;
		
		for(int i = 0; i < intNums.length; i++) { // i < 100 말고 length 써라~~!
			intNums[i] = rnd.nextInt(10) + 1;
		}
		
		System.out.print("1 ~ 10까지 숫자 입력 >> ");
		inputNums = scan.nextInt();
		
		for(int i = 0; i < intNums.length; i++) {
			if(inputNums == intNums[i]) {
				countNums++;
			}
		}
		
		System.out.printf("숫자 %d은(는) %d번 저장되어 있습니다", inputNums, countNums);

				
		
	}

}

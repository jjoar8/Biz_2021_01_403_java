package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_04 {
	
	public static void main(String[] args) {
		
		int[] intNums = new int[100];
		
		Random rnd = new Random();
		for(int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("1 ~ 10까지 숫자 입력 >> ");
		int intInput = scan.nextInt();
		
		int count = 0;
		for(int i = 0; i < intNums.length; i++) {
			if(intNums[i] == intInput) {
				count = i;
			}
		}
		
		System.out.printf("%d는 %d번째에 마지막으로 나타납니다", intInput, count);
		
	}

}

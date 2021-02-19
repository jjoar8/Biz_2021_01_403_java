package com.callor.applications;

import java.util.Random;

public class Score_05 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] intKor = new int[20];
		
		// 1 ~ 100까지 중의 임의 수를 20개 만들어서
		// intKor 배열 0번주소 ~ 19번주소 위치에 한개씩 저장
		for(int index = 0; index < 20; index++) {
			int num = rnd.nextInt(100) + 1;
			intKor[index] = num;	
		}
		
		for(int index = 0; index < 20; index++) {
			System.out.printf("%d번주소 : %-3d\n", index, intKor[index]);
		}
		
		
	}

}

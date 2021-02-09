package com.callor.start;

/*
 * 1  2  3  4  5
 * 6  7  8  9  10
 *  
 */

public class NumList_01 {
	
	public static void main(String[] args) {
		
		for(int i = 0 ; i < 100 ; i++) {
			int num1 = i + 1;
			System.out.println(num1);
		}
		
		System.out.println("================");
		
		for(int i = 0 ; i < 100 ; i++) {
			int num1 = i + 1;
			System.out.print(num1 + ", ");
			if(num1 % 5 == 0) {
				System.out.println();
			}
		}
		
		System.out.println("================");
		
		for(int i = 0 ; i < 100 ; i++) {
			int num1 = i + 1;
			System.out.print(num1 + "\t"); 
			// 백슬래시 + 영문자 = ESCAPE 문자
			// "\t" : TAB key
			if(num1 % 5 == 0) {
				System.out.println();
			}
		}
		
		System.out.println("================");
		System.out.println("구구단");
		System.out.println("----------------");
		for(int i = 0 ; i < 10 ; i++) {
			int dan = 7;
			System.out.println(dan + "\tx\t" + i + "\t=\t" + dan * i);
		}

		System.out.println("================");
		
		System.out.print("대한민국\t");
		System.out.print("우리나라\t");
		System.out.print("만세\n");
		System.out.print("Republic of Korea");
		System.out.print("\n\n\n\n\n"); // 훨씬 간편하다
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
	}

}

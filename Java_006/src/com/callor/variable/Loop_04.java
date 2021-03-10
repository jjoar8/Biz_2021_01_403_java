package com.callor.variable;

public class Loop_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intDan = 3;
		int num1 = 0;
		
		System.out.println("================");
		System.out.println("구구단");
		System.out.println("----------------");
		
		num1 = 1;
		for( ; num1 < 10;) {
			
			System.out.print(intDan);
			System.out.print(" × ");
			System.out.print(num1);
			System.out.print(" = ");
			System.out.println(intDan * num1);
			num1 += 1;		
		}
		
		System.out.println("================");
		
		for(num1 = 1; num1 < 5;) {
			System.out.println(num1);
			num1 += 1;
		}
		
		System.out.println("================");
		
		/*
		 * for() 명령문이 실행되는 순서
		 */
		
		//  (1)       (2)        (8)
		for(num1 = 1; num1 < 10; num1 += 1) {
			System.out.print(intDan); // (3)
			System.out.print(" × ");  // (4)
			System.out.print(num1);   // (5)
			System.out.print(" = ");   //(6)
			System.out.println(intDan * num1); //(7)
		}
		
	}

}

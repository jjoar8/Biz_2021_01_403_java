package com.callor.varriable;

public class Varriable_02 {

	public static void main(String[] args) {
		
		// 변수를 0으로 선언하고 값을 넣는 것이 원칙이다

		int num1 = 0;
		int num2 = 0;

		num1 = 30;
		num2 = 40;
		
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		int result4 = 0;
		int result5 = 0;
		
		result1 = num1 + num2;
		result2 = num2 - num1;
		result3 = num1 * num2;
		result4 = num2 / num1;
		result5 = num2 % num1;
		
		// 30 + 40 = 70
		System.out.println("30 + 40 = " + (30 + 40));
		
		
		// 덧셈
		System.out.print(num1);
		System.out.print(" + ");
		System.out.print(num2);
		System.out.print(" = ");
		System.out.println(result1);
		
		// 뺄셈
		System.out.print(num2);
		System.out.print(" - ");
		System.out.print(num1);
		System.out.print(" = ");
		System.out.println(result2);
		
		// 곱셈
		System.out.print(num1);
		System.out.print(" × ");
		System.out.print(num2);
		System.out.print(" = ");
		System.out.println(result3);
		
		// 나눗셈
		System.out.print(num2);
		System.out.print(" ÷ ");
		System.out.print(num1);
		System.out.print(" = ");
		System.out.println(result4);
		
		// 나머지
		System.out.print(num2);
		System.out.print(" MODE ");
		System.out.print(num1);
		System.out.print(" = ");
		System.out.println(result5);

	}

}

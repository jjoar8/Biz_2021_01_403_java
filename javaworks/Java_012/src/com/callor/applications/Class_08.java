package com.callor.applications;

import com.callor.applications.sevice.ClassServiceV6;

public class Class_08 {
	
	public static void main(String[] args) {
		
		ClassServiceV6 csV6 = new ClassServiceV6();

		int num1 = 88;
		int num2 = 99;
		
		// 각각 method에 변수 num1, num2를 전달하고
		// = 변수 num1과 num2에 담긴 값을 전달
		// 변수를 전달하는게 아닙니다~
		int add = csV6.add(num1, num2);		
		int subst = csV6.substraction(num1,num2);
		System.out.printf("%d와 %d의\n덧셈 : %d\n뺄셈 : %d\n", num1, num2, add, subst);
		
	}

}

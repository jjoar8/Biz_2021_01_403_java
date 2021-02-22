package com.callor.applications;

public class Numbers_02 {
	
	public static void main(String[] args) {
		
		int intNum1 = 33;
		int intNum2 = 77;
		
		// 변수 num을 잠깐 사용하고 지우기 위해 while문 사용
		while(true) {
			int num = intNum1;
			intNum1 = intNum2;
			intNum2 = num;
			break;
		}
		
//		intNum1 = intNum1 + intNum2;
//		intNum2 = intNum1 - intNum2;
//		intNum1 = intNum1 - intNum2;
		
		System.out.println("intNum1 = " + intNum1);
		System.out.println("intNum2 = " + intNum2);
	
	}

}

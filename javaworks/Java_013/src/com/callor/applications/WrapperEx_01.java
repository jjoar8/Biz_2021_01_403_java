package com.callor.applications;

public class WrapperEx_01 {
	
	public static void main(String[] args) {
		
		/*
		 * wrapper class
		 * 
		 */
		
		int num1 = 10;
		
		// 아래 두 코드는 하는 일이 같다
		float floatNum3 = Float.valueOf(30);
		floatNum3 = (float)30;
		
		// 정수 50을 Float형으로 변환하여 저장
		Float floatNum4 = Float.valueOf(50);
		// 다시 Float형 50을 정수형으로 변환하여 저장
		int intNum4 = floatNum4.intValue();
		
	}

}

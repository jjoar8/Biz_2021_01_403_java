package com.callor.start.bool;

public class BoolAlge_02 {
	
	public static void main(String[] args) {
		
		boolean bYes1 = 3 > 3;
		boolean bYes2 = 3 == 3;
		
		// false && true == false
		boolean bYes3 = bYes1 && bYes2;
		
		// false || true == true
		boolean bYes4 = bYes1 || bYes2;
		
		int num1 = 100;
		int num2 = 200;
		
		// 이미 왼쪽에서 true 이기 때문에 오른쪽을 연산하지 않는다
		boolean bYes5 = (num1 > 50) || (num2 += 20) > 300;
		// num2 = 200
		System.out.println(num2);
		
		if(num1 > 50) {
			num2 += 20;
		}
		
		// 이미 왼쪽에서 false 이기 때문에 오른쪽을 연산하지 않는다
		bYes5 = (num1 < 50) && (num2 += 20) < 300;
		System.out.println(num1);
		
		if(num1 < 50) {
			num2 += 20;
		}
		
		
	}

}

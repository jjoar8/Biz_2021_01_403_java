package com.callor.applications;

import com.callor.applications.sevice.ClassServiceV7;

public class Class_10 {
	
	public static void main(String[] args) {
		
		ClassServiceV7 csV7 = new ClassServiceV7();
				
		for(int num = 2; num < 10; num++) {
			csV7.guguDan(num);
		}
		
	}

}

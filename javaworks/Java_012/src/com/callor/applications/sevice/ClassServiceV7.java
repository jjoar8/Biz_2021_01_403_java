package com.callor.applications.sevice;

public class ClassServiceV7 {
	
	public void guguDan(int dan) {
		
		while(true) {
			if(dan < 2) {
				System.out.println("2 이상의 수를 입력");
				break;
			} else if(dan > 9) {
				System.out.println("9 이하의 수를 입력");
				break;
			} else {
				System.out.println("===========================");
				System.out.printf("%d단 구구단\n", dan);
				System.out.println("---------------------------");
		
				for(int num = 2; num < 10; num++) {
					System.out.printf("%d x %d = %3d\n", dan, num, dan*num);
				}
		
				System.out.println("===========================");
				break;
			}				
		}	
	
		
	}

}

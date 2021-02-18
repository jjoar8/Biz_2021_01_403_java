package com.callor.variable;

public class Loop_05 {

	public static void main(String[] args) {
		
		int intDan = 7;
		// local variable, local scope > main() method 영역
		
		for(int num = 1; num < 10; num += 1) {
			
		}

		// 사라졌으므로 다시 선언할 수 있다
		for(int num = 1; num < 100; num += 1) {
			
		}
		
		// for문이 끝나면 변수 num은 사라진다
		// System.out.println(num); 
		// 이 코드는 변수가 없다
		
		for(int num = 20; num < 42; num += 1) {
			 System.out.println("안녕");
		}
		
		//  시작하는 값  비교하는 값  증가하는 값
		for(int num = 12; num <= 20; num += 1) {
			System.out.println("반가워");
		}
		
		for(int num = 12; num <= 20; num += 2) {
			System.out.println(num);
		}

	}

}

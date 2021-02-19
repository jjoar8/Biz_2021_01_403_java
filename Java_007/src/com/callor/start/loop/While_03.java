package com.callor.start.loop;

public class While_03 {

	public static void main(String[] args) {
		
		int index = 0;
		while(true) {
			if(++index % 3 == 0) {
				System.out.println(index + "는 3의 배수");
			}
			// if(index % 3 > 0)
			else {
				System.out.println(index + " 3의 배수 아님");
			} // 3의 배수를 찾는 것이므로 index == 3 이 옳다
			
			if(index > 1000) { // 이 코드가 항상 같은 값이 나올 것인가
				break;
			}
			
		}

	}

}

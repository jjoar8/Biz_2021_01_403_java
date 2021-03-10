package com.callor.opp;

public class StringEQ_01 {
	
	public static void main(String[] args) {
		
		// Java9 이후 사용 금지된 코드
		Integer num4 = new Integer(30);
		Integer num5 = 30;
		Integer num6 = 30;
		
		float num7 = 30.0f;
		
		// 정수형변수에 저장된 값과 
		// 실수형변수에 저장된 값 비교 연산
		System.out.println(num6 == num7);
		
		//	type이 다른 값끼리 비교를 할 때는 상당한 주의가 필요
		System.out.println(num6 == (int)num7);
		
		System.out.println("==============================");
		
		String str1 = "KOREA";
		String str2 = "KOREA";
		String str3 = "Korea";
		String str4 = "kOREA";
		String str5 = "KOREA "; // white space
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
		System.out.println(str4 == str5);
		System.out.println(str1 == str5);

		System.out.println("==============================");
		
		// 문자열 변수를 일반(Primitive) 변수처럼 선언하면
		// == 연산으로 같은지 비교가 가능하다(비교가 된다x)
		String str11 = "KOREA";

		// 문자열 변수를 클래스 방식으로 선언하면
		// == 연산으로 같은지 비교가 불가능하다
		String str6 = new String("KOREA");
		String str7 = new String("KOREA");
		
		System.out.println(str11 == str6);
		System.out.println(str6 == str7); // 문자열 기억장소를 비교함
		
		/*
		 * 문자열(변수)은 생성하는 방법에 따라
		 * 	일반 변수와 다른 현상을 보일 때가 있다
		 * 
		 * 특히 변수에 저장된 값이 같음에도 불구하고
		 * 	EQ(==) 연산을 사용하여 같은지 비교하면
		 * 	false 결과가 나기도 한다
		 * 
		 * 만약 코드 중간에 어떤 이유로 이러한 현상이 발생한다면
		 * 	if(문자열변수== "문자열") 과 같은 코드에서
		 * 	예측할 수 없는 논리적 오류가 발생할 것이다
		 * 
		 * 이러한 이유 때문에 문자열은
		 * 	절대 EQ(==) 연산을 수행하지 않는다
		 * 
		 * 문자열을 비교할 때는 문자열.equals("비교값") 형식의
		 * 	method를 사용해야 한다 
		 */

		boolean bYes = str11.equals(str7);
		System.out.println("문자열 equals():" + bYes);
		
		System.out.println("==============================");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		System.out.println(str1.equals(str5));
		System.out.println(str1.equals(str6));
		System.out.println(str1.equals(str7));
		
		System.out.println("==============================");
		
		System.out.println(str1.equalsIgnoreCase(str3));
		System.out.println(str1.equalsIgnoreCase(str4));
		
		
		
		
	}
	
}

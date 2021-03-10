package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_01 {
	
	public static void main(String[] args) {
		
		// ProductVO 클래스를 사용하여 객체, 인스턴스를 생성
		ProductVO pVO = new ProductVO();
		
		// toString()
//		System.out.println("toString() : " + pVO.toString());
		
		// 키보드를 통해 입력 받아
		// 객체의 인스턴스변수에 저장하시오
		Scanner scan = new Scanner(System.in);

		System.out.println("=====================================");
		System.out.println("상품정보 등록(입력) 시스템 v1");
		System.out.println("-------------------------------------");
		System.out.println("상품정보를 입력하세요");
		System.out.println("-------------------------------------");
		
		System.out.print("상품코드 >> ");
		pVO.strPCode = scan.nextLine();
		
		System.out.print("상품명 >> ");
		pVO.strPName = scan.nextLine();
		
		System.out.print("거래처 >> ");
		pVO.strDName = scan.nextLine();
		
		System.out.print("품목 >> ");
		pVO.strItem = scan.nextLine();
		
		System.out.print("매입단가 >> ");
		pVO.iPrice = scan.nextInt();
		
		System.out.print("매출단가 >> ");
		pVO.oPrice = scan.nextInt();
		
		pVO.toString();
		
		// 디버깅 코드
		// 내가 만든 프로그램이 정상 작동되어 맞게 나오는지 확인
//		System.out.println("=====================================");
//		System.out.println("입력된 데이터 확인");
//		System.out.println("-------------------------------------");
//		System.out.printf("상품코드 : %s\n", pVO.strPCode);
//		System.out.printf("상품명 : %s\n", pVO.strPName);
//		System.out.printf("거래처 : %s\n", pVO.strItem);
//		System.out.printf("품목 : %s\n", pVO.strDName);
//		System.out.printf("매입단가 : %s\n", pVO.iPrice);
//		System.out.printf("매출단가 : %s\n", pVO.oPrice);
//		System.out.println("=====================================");
		
		
	}

}

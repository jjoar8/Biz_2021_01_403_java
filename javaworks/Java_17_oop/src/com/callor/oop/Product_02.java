package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_02 {

	public static void main(String[] args) {
		
		// ProductVO 클래스를 사용하여 객체배열 5개를 선언
		ProductVO[] pVO = new ProductVO[5];
		
		// 키보드를 통해 입력받아
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=====================================");
		System.out.println("상품정보 등록(입력) 시스템 v2");
		
		for(int i = 0; i < pVO.length; i++) {
			// 초기화
			pVO[i] = new ProductVO();

			System.out.println("-------------------------------------");
			System.out.println("상품정보를 입력하세요");
			System.out.println("-------------------------------------");

			System.out.print("상품코드 >> ");
			pVO[i].strPCode = scan.nextLine();
			
			System.out.print("상품명 >> ");
			pVO[i].strPName = scan.nextLine();
			
			System.out.print("거래처 >> ");
			pVO[i].strDName = scan.nextLine();
			
			System.out.print("품목 >> ");
			pVO[i].strItem = scan.nextLine();
			
			System.out.print("매입단가 >> ");
			pVO[i].iPrice = scan.nextInt();
			
			System.out.print("매출단가 >> ");
			pVO[i].oPrice = scan.nextInt();
			
			scan.nextLine();
			
		}
		
		// 디버깅
		for(int i = 0; i < pVO.length; i++) {
			pVO[i].toString();
		}
		
		
	}
}

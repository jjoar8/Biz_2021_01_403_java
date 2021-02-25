package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_01 {
	
	public static void main(String[] args) {
		
		// ProductVO 클래스를 사용하여 객체, 인스턴스를 생성
		ProductVO pVO = new ProductVO();
		
		// 키보드를 통해 입력 받아
		// 객체의 인스턴스변수에 저장하시오
		Scanner scan = new Scanner(System.in);
		
		System.out.print("상품코드 입력 >> ");
		pVO.strPCode = scan.nextLine();
		
		System.out.print("상품명 입력 >> ");
		pVO.strPName = scan.nextLine();
		
		System.out.print("거래처 입력 >> ");
		pVO.strDName = scan.nextLine();
		
		System.out.print("품목 입력 >> ");
		pVO.strItem = scan.nextLine();
		
		System.out.print("매입단가 입력 >> ");
		pVO.iPrice = scan.nextInt();
		
		System.out.print("매출단가 입력 >> ");
		pVO.oPrice = scan.nextInt();

		
	}

}

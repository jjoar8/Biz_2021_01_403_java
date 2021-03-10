package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ProductVO[] pVOs = new ProductVO[5];
		for(int i = 0; i < pVOs.length; i++) {
			pVOs[i] = new ProductVO();
		}
				
		System.out.println("=====================================");
		
		for(int i = 0; i < pVOs.length; i++) {
			String pCode = (i + 1) + "";
			pVOs[i].strPCode = pCode;
			
			System.out.println(pCode + "번 상품정보 입력");
			System.out.println("-------------------------------------");
			
			System.out.print("상품이름 >> ");
			pVOs[i].strPName = scan.nextLine();
			
			System.out.print("거래처 >> ");
			pVOs[i].strDName = scan.nextLine();
			
			System.out.print("품목 >> ");
			pVOs[i].strItem = scan.nextLine();
			
			while(true) {
				System.out.print("매입단가 >> ");
				String strIPrice = scan.nextLine();
				int intIPrice = Integer.valueOf(strIPrice);
				if(intIPrice < 0) {
					System.out.println("0원 이상 입력하시오");
				} else {
					pVOs[i].iPrice = intIPrice;
					break;
				}
			}
			while(true) {
				System.out.print("매출단가 >> ");
				String strOPrice = scan.nextLine();
				int intOPrice = Integer.valueOf(strOPrice);
				if(intOPrice < 0) {
					System.out.println("0원 이상 입력하시오");
				} else {
					pVOs[i].oPrice = intOPrice;
					break;
				}
			}
			
			pVOs[i].toString();
			
		}
		
	}

}

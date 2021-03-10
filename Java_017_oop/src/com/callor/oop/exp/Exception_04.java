package com.callor.oop.exp;

import com.callor.oop.model.ProductVO;

public class Exception_04 {
	
	public static void main(String[] args) {
		
		ProductVO[] pVOs = new ProductVO[3];
		
		// 근본적인 문제해결
		pVOs[0] = new ProductVO(); // 객체 초기화
		pVOs[0].strDName = "초코파이";
		
		System.out.println(pVOs[0].strDName);
		
		// 예외처리
		try {
			pVOs[0].strDName = "초코파이";
		} catch (NullPointerException e) {
			System.out.println("객체가 초기화 되지 않았음");
			
		}
		
		
	}

}

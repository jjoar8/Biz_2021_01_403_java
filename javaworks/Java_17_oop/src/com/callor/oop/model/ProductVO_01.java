package com.callor.oop.model;

public class ProductVO_01 {
	
	// 쇼핑몰 상품관리 프로젝트를 수행하기 위한 
	// Value Object 클래스 생성
	
	public String strCode; // 상품코드
	public String 상품명;
	public String 품목명;
	public String 거래처;
	
	// 매입단가와 매출단가는 이후 "상품거래" 등에서
	// 단가 * 수량의 연산을 수행해야 함
	public int 매입단가;
	public int 매출단가;
	
	
}

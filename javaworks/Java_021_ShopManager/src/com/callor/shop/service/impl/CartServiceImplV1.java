package com.callor.shop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.CartService;

//implements CartService interface
public class CartServiceImplV1 implements CartService {

	// 키보드 입력값을 받기 위해
	// Scanner 클래스를 사용하여 scan 객체 선언
	private Scanner scan;
	// CartVO 클래스에 따른 변수값을 저장할 리스트 선언
	private List<CartVO> cartList;

	// 메모리 관리를 위해 선언과 초기화 분리
	public CartServiceImplV1() {
		// scan 객체 초기화
		scan = new Scanner(System.in);
		cartList = new ArrayList<CartVO>();
	}

	@Override
	public void inputCart() {
		System.out.println("================================================");
		System.out.println("장바구니 상품 담기");
		System.out.println("------------------------------------------------");
		System.out.println("각 항목을 입력해주세요");

		System.out.print("구매자 >> ");
		String strUserName = scan.nextLine();

		System.out.print("상품명 >> ");
		String strProductName = scan.nextLine();

		int intPrice = 0;
		while (true) {
			System.out.print("단가 >> ");
			String strPrice = scan.nextLine();

			try {
				// 숫자가 아닌 값을 입력하면
				// exception 오류가 발생하는 부분
				intPrice = Integer.valueOf(strPrice);
				if (intPrice < 100) {
					System.out.println("단가는 100원 이상");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("숫자로 입력하세요");
			}
		} // Price while end

		int intQty = 0;
		while (true) {
			System.out.print("수량 >> ");
			String strQty = scan.nextLine();

			try {
				intQty = Integer.valueOf(strQty);
				if (intQty < 1) { // 원하는 기준을 확실하게
					System.out.println("수량은 1개 이상");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("숫자로 입력하세요");
			}
		} // Qty while end

		// 합계
		int intTotal = intPrice * intQty;

		// CartVO에 있는 변수를 가져와 각각 값을 저장
		CartVO cartVO = new CartVO();
		cartVO.setUserName(strUserName);
		cartVO.setProductName(strProductName);
		cartVO.setPrice(intPrice);
		cartVO.setQty(intQty);
		cartVO.setTotal(intTotal);

		// cartList 리스트에 저장
		cartList.add(cartVO);

	}

	@Override
	public void printAllCart() { // 전체 리스트

		int nSize = cartList.size();
		// 카트리스트에 들어있는 리스트 개수를 세어
		// nSize에 정수로 저장한다
		int countProduct = 0;
		int totalSum = 0;

		System.out.println("* 전체 장바구니 리스트");
		System.out.println("================================================");
		System.out.println("구매자\t상품명\t단가\t수량\t합계");
		System.out.println("------------------------------------------------");

		for (int i = 0; i < nSize; i++) {
			System.out.print(cartList.get(i).getUserName() + "\t");
			System.out.print(cartList.get(i).getProductName() + "\t");
			System.out.print(cartList.get(i).getQty() + "\t");
			System.out.print(cartList.get(i).getPrice() + "\t");
			System.out.println(cartList.get(i).getTotal());
			countProduct++;
			totalSum += cartList.get(i).getTotal();
		}

		System.out.println("------------------------------------------------");
		System.out.print("총합계\t");
		System.out.print(countProduct + "가지\t");
		System.out.println("\t\t" + totalSum);
		System.out.println("================================================");

	}

	@Override
	public void printUserCart() {

		int nSize = cartList.size();
		int countProduct = 0;
		int totalSum = 0;
		while (true) {
			System.out.println("구매자 이름을 입력해주세요");
			System.out.print("입력 >> ");
			String strUserName = scan.nextLine();

			System.out.println("* 구매자별 장바구니 리스트");
			System.out.println("================================================");
			System.out.println("구매자\t상품명\t단가\t수량\t합계");
			System.out.println("------------------------------------------------");
			for (int i = 0; i < nSize; i++) {
				// equals를 사용해서 문자열을 비교하고
				// 값이 같을 경우에만 코드 실행
				if (strUserName.equals(cartList.get(i).getUserName())) {
					System.out.print(cartList.get(i).getUserName() + "\t");
					System.out.print(cartList.get(i).getProductName() + "\t");
					System.out.print(cartList.get(i).getQty() + "\t");
					System.out.print(cartList.get(i).getPrice() + "\t");
					System.out.println(cartList.get(i).getTotal());
					countProduct++;
					totalSum += cartList.get(i).getTotal();
				}
			} // end for
			System.out.println("------------------------------------------------");
			System.out.print("총합계\t");
			System.out.print(countProduct + "가지\t");
			System.out.println("\t\t" + totalSum);
			System.out.println("================================================");
			break;
		} // end while

	}

}

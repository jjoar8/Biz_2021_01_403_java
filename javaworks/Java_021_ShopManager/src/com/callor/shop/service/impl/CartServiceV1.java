package com.callor.shop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.CartService;

public class CartServiceV1 implements CartService {

	// 스캐너, 리스트
	private Scanner scan;
	private List<CartVO> cartList;

	public CartServiceV1() {
		scan = new Scanner(System.in);
		cartList = new ArrayList<CartVO>();
	}

	@Override
	public void inputCart() {
		// 장바구니에 상품을 추가합니다
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
				intPrice = Integer.valueOf(strPrice);
				if (intPrice <= 100) {
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
				if (intQty <= 1) {
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

		CartVO cartVO = new CartVO();
		cartVO.setUserName(strUserName);
		cartVO.setProductName(strProductName);
		cartVO.setPrice(intPrice);
		cartVO.setQty(intQty);
		cartVO.setTotal(intTotal);

		cartList.add(cartVO);

	}

	@Override
	public void printCartAll() {

		int nSize = cartList.size();
		int checkProduct = 0;
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
			checkProduct++;
			totalSum += Integer.valueOf(cartList.get(i).getTotal());
		}

		System.out.println("------------------------------------------------");
		System.out.print("총합계\t");
		System.out.print(checkProduct + "가지\t");
		System.out.println("\t\t" + totalSum);
		System.out.println("================================================");

	}

	@Override
	public void printCart() {

		int nSize = cartList.size();
		int checkProduct = 0;
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
				if (strUserName.equals(cartList.get(i).getUserName())) {
					System.out.print(cartList.get(i).getUserName() + "\t");
					System.out.print(cartList.get(i).getProductName() + "\t");
					System.out.print(cartList.get(i).getQty() + "\t");
					System.out.print(cartList.get(i).getPrice() + "\t");
					System.out.println(cartList.get(i).getTotal());
					checkProduct++;
					totalSum += Integer.valueOf(cartList.get(i).getTotal());
				}
			} // end for
			System.out.println("------------------------------------------------");
			System.out.print("총합계\t");
			System.out.print(checkProduct + "가지\t");
			System.out.println("\t\t" + totalSum);
			System.out.println("================================================");
			break;
		} // end while

	}

}

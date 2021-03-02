package com.callor.opp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.opp.model.CartVO;

/*
 * Service 클래스
 * main() method에서 구현한 코드들을
 * 별도의 크랠스로 분리하고
 * 작은 method 단위로 코드를 작성하여
 * 전체적으로 단위코드가 작아지도록 하기 위한 기법
 * 이후에 유지보수(업그레이드, 오류정정)를
 * 		유리하게 하기위한 방법
 * 
 */

public class CartServiceV1 {
	
	// CartServiceV1 클래스에 cartList 객체를 인스턴스변수로 선언
	private List<CartVO> cartList = new ArrayList<CartVO>();
		
	/*
	 * inputCart() method에서 계속 사용할
	 * 		키보드 입력을 처리할 Scanner를
	 * 		인스턴스 영역으로 이동했다
	 * 인스턴스 영역에 선언된 객체들은
	 * 		특별한 경우가 아니면 private으로 일단 선언
	 */
	private Scanner scan = new Scanner(System.in);
	
	public void inputCart() {
		/*
		 * Scanner, File, Network 이러한 클래스들은
		 * 운영체제와 연동하여 컴퓨터 자체의 자원(Resource)을 사용하게 된다
		 * 컴퓨터 자체의 자원(Resource)는 유한하다
		 * 때문에 자원은 무턱대고 열고 사용만 해서는 안된다
		 * 자원을 사용하기 위해서 선언을 한 후
		 * 사용이 끝나면 반드시 반납(close)해 줘야 하낟
		 * 그래야만 Application이 실행되는 과정에서
		 * 자원의 누수(leak)이 발생하지 않는다
		 * 
		 * 여기(inputCart() method)는
		 * 사용방법에 따라서 수회 반복적으로 호출이 될 것이다
		 * 수회 반복적으로 호출되는 동안에
		 * Scanner가 열리고(연결) 닫히는 과정이 계속 반복된다
		 * Resource를 열고, 닫는 과정은
		 * 		실제 컴퓨터, 운영체제, 어플리케이션 입장에서는
		 * 상당히 많은 일을 수행해야 한다.
		 * 
		 * 이러한 과정은 어플리케이션의 성능을 저하시키는
		 * 중대한 원인이 될 수 있다
		 * 
		 * 그래서
		 * Scanner를 method() 내부에서 선언하지 않고
		 * 클래스의 인스턴스 영역으로 보낸다.
		 * 
		 */
		// Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			
			System.out.print("구매자 >> ");
			String strUserName = scan.nextLine();
			
			System.out.print("상품명 >> ");
			String strPName = scan.nextLine();
			
			int intQty = 0;
			while(true) { 
				System.out.print("수량 >> ");
				String strQty = scan.nextLine();
				try {
					intQty = Integer.valueOf(strQty);
					if(intQty < 2) {
						System.out.println("수량은 2 이상");
						continue;
					}
				} catch (Exception e) {
					System.out.println("수량은 숫자로 입력하세요");
				}
				break;
			}
			
			int intPrice = 0;
			while(true) { 
				System.out.print("단가 >> ");
				String strPrice = scan.nextLine();
				try {
					intPrice = Integer.valueOf(strPrice);
					if(intPrice < 1000) {
						System.out.println("단가는 1000원 이상");
						continue;
					}
				} catch (Exception e) {
					System.out.println("단가는 숫자로 입력하세요");
				}
				break;
			}
			
			CartVO cartVO = new CartVO();
			cartVO.setCartUserName(strUserName);
			cartVO.setCartPName(strPName);
			cartVO.setCartQty(intQty);
			cartVO.setCartPrice(intPrice);
			
			cartList.add(cartVO);
		}
		
	}
	
	public void printCartList() {
		System.out.println("=====================================");
		System.out.println("구매자\t상품명\t단가\t수량");
		System.out.println("-------------------------------------");
				
		for(int i = 0; i < 3; i++) {
			System.out.printf("%s\t%s\t%d\t%d\n", 
					cartList.get(i).getCartUserName(), 
					cartList.get(i).getCartPName(), 
					cartList.get(i).getCartPrice(), 
					cartList.get(i).getCartQty());
		}
		
		System.out.println("=====================================");
		
	}

}

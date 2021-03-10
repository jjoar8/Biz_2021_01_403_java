package com.callor.opp;

import com.callor.opp.service.CartService;
import com.callor.opp.service.impl.CartServiceImplV4;
import com.callor.opp.service.impl.MenuService;
import com.callor.opp.service.impl.MenuServiceImplV4;

public class CartEx_07 {
	
	public static void main(String[] args) {
		
		MenuService mService = new MenuServiceImplV4();
		CartService cService = new CartServiceImplV4();
		
		while (true) {
			
			mService.selectMenu();
			Integer menuItem = ((MenuServiceImplV4)mService).menuItem;
			if (menuItem == null) {
				break;
			} else if (menuItem == 1) {
				cService.inputCart();
			} else if (menuItem == 3) {
				cService.printCart();
			}
			
		}
		
		System.out.println("=========================================");
		System.out.println("업무종료 야 퇴근이다!!!");
		
	}

}

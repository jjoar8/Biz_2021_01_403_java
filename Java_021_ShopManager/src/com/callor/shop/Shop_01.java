package com.callor.shop;

import com.callor.shop.service.CartService;
import com.callor.shop.service.MenuService;
import com.callor.shop.service.impl.CartServiceImplV1;
import com.callor.shop.service.impl.MenuServiceImplV1;

public class Shop_01 {
	
	public static void main(String[] args) {
		
		CartService cService = new CartServiceImplV1();
		MenuService mService = new MenuServiceImplV1();
		
		while (true) {
			Integer menu = mService.selectMenu();
			if(menu == null) {
				break;
			} else if (menu == 1) {
				cService.inputCart();
			} else if (menu == 2) {
				cService.printAllCart();
			} else if (menu == 3) {
				cService.printUserCart();
			}
			
		}
		
	}

}

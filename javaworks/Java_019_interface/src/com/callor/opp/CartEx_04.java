package com.callor.opp;

import com.callor.opp.service.CartService;
import com.callor.opp.service.impl.CartServiceImplV3;

public class CartEx_04 {
	
	public static void main(String[] args) {
		
		CartService cService = new CartServiceImplV3();
		cService.inputCart();
		cService.printCart();
		
	}

}

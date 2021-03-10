package com.callor.opp;

import com.callor.opp.service.CartService;
import com.callor.opp.service.impl.CartServiceImplV1;

public class CartEx_03 {
	
	public static void main(String[] args) {
		
		CartService cServ = new CartServiceImplV1(); // V@ 부분만 수정하면 된다
		cServ.inputCart();
		cServ.printCart();
		
	}

}

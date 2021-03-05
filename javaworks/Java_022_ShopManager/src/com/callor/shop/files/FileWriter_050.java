package com.callor.shop.files;

import com.callor.shop.service.impl.RndServiceImplV10;

public class FileWriter_050 {
	
	public static void main(String[] args) {
		
		RndServiceImplV10 rndService = new RndServiceImplV10();
		
		rndService.makeRnd();
		rndService.saveFileRnd();
		
		
	}

}

package com.callor.shop.files;

import com.callor.shop.service.impl.RndServiceImplV1;

public class FileWriter_05 {
	
	public static void main(String[] args) {
		
		RndServiceImplV1 rndService = new RndServiceImplV1();
		
		rndService.makeNums();
		rndService.saveFileNums();
		
		
	}

}

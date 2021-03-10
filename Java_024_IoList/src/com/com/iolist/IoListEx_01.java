package com.com.iolist;

import com.com.iolist.service.IoListService;
import com.com.iolist.service.impl.IoListServiceImplV1;

public class IoListEx_01 {
	
	public static void main(String[] args) {
		
		IoListService ioService = new IoListServiceImplV1();
		
		ioService.loadFile();
		ioService.printIoList();
		
	}

}

package com.callor.shop.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RndServiceImplV1 {

	private List<String> strList;
	
	public RndServiceImplV1() {
		strList = new ArrayList<String>();
	}

	public void makeRnd() {

		Random rnd = new Random();
		
		for (int i = 0; i < 100; i++) {
			int intNums = rnd.nextInt(1000) + 1;
			strList.add(String.valueOf(intNums) + ":");
			if ((i + 1) % 5 == 0) {
				strList.add("\n");
			}
		} // end for
		
	}

	public void saveFileRnd() {
		
		String strFile = "src/com/callor/shop/files/nums.txt";

		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(strFile);
			printer = new PrintWriter(fileWriter);

			for (int i = 0; i < strList.size(); i++) {
				printer.print(strList.get(i));
			}

			printer.close();
			fileWriter.close();

			System.out.println("txt 파일로 저장 완료");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

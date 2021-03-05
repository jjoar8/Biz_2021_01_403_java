package com.callor.shop;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriter_01 {
	
	public static void main(String[] args) {
		
		String strNums = "src/com/callor/shop/nums.txt";
		Random rnd = new Random();
		
		FileWriter fileWriter = null;
		PrintWriter printer = null;
		
		try {
			fileWriter = new FileWriter(strNums);
			printer = new PrintWriter(strNums);
			
			for(int i = 0; i < 100; i++) {
				int intNums = rnd.nextInt(1000) + 1;
				printer.println(intNums); // 숫자일 경우에도 문자로 자동 형변환된다
			}
			
			printer.close();
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

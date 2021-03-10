package com.callor.shop.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileWriter_03 {
	
	public static void main(String[] args) {
		
		String strNums = "src/com/callor/shop/files/nums.txt";
		Random rnd = new Random();
		
		// 리스트
		List<Integer> intList = new ArrayList<Integer>();
		for(int i = 0; i < 100; i++) {
			
			// 1번 코드
			Integer num = rnd.nextInt(1000) + 1;
			intList.add(num);
			
			// 2번 코드
//			intList.add(rnd.nextInt(1000) + 1);
		}

		FileWriter fileWriter = null;
		PrintWriter printer = null;
		
		try {
			fileWriter = new FileWriter(strNums);
			printer = new PrintWriter(fileWriter);
			
			// 향상된 for
			for(Integer n : intList) {
				printer.println(n);
			}

			// 표준형 for
//			int nSize = intList.size();
//			for(int i = 0; i < nSize; i++) {
//				Integer n = intList.get(i);
//				printer.println(n);
//			}
			
			printer.close();
			fileWriter.close();
			
			System.out.println("Mission Complete!!!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

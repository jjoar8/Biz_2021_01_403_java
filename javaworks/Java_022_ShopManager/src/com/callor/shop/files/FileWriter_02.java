package com.callor.shop.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriter_02 {
	
	public static void main(String[] args) {
		
		String strNums = "src/com/callor/shop/files/nums.txt";
		Random rnd = new Random();
		
		// 배열
		int[] nums = new int[100];
		for(int i = 0; i < nums.length; i++) { // 값을 저장할 때는 foreach가 잘안된다
			nums[i] = rnd.nextInt(1000) + 1;
		}

		FileWriter fileWriter = null;
		PrintWriter printer = null;
		
		try {
			fileWriter = new FileWriter(strNums);
			printer = new PrintWriter(fileWriter);
			
			// nums 배열에 담긴 전체리스트를
			// 향상된 for로 반복하면서 파일에 출력
			for(int n : nums) {
				printer.println(n);
			}
			
			printer.close();
			fileWriter.close();
			
			System.out.println("Mission Complete!!!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

package com.callor.shop.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.shop.values.Values;

public class FileReader_01 {
	
	public static void main(String[] args) {
		
		List<String> strLines = new ArrayList<String>();
		String fileName = "src/com/callor/shop/files/nums_rnd_v2.txt";
		
		// 파일을 읽을 때 사용하는 클래스
		FileReader fileReader = null;
		BufferedReader buffer = null; // 4.
		
		try {
			
			fileReader = new FileReader(fileName);
			
			// 1. 아스키 코드
//			int ascii = fileReader.read(); // 한글자씩
//			System.out.println(ascii);
			
			// 2. Code point = 0xffffffff 오류
			// 0x = 16진수
			// ffffffff = 너무 큰수라서 -1로 처리
//			while(true) { 
//				int ascii = fileReader.read();
//				System.out.printf("%c\n", ascii);
//			}
			
			// 3. fileReader를 사용한 저수준 코드
//			while(true) { 
//				int ascii = fileReader.read();
//				if(ascii == -1) {
//					break;
//				}
//				System.out.printf("%c\n", ascii);
//			}
			
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				String str = buffer.readLine(); // nextLine()
				if (str == null) {
					break;
				}
				// System.out.println(str);
				strLines.add(str);
			}
			
			buffer.close();
			fileReader.close();
			
//			str = buffer.readLine(); // 한줄씩 읽어오는구나!
//			System.out.println(str);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // end try
		// 파일 읽기 끝
		
		// 그냥 프린트
//		for(String str : strLines) {
//			System.out.println(str);
//		}

		for(String str : strLines) {
			String[] nums = str.split(":");
			System.out.printf("첫번째 숫자 : %s\n", nums[0]);
			System.out.printf("두번째 숫자 : %s\n", nums[1]);
			System.out.printf("세번째 숫자 : %s\n", nums[2]);
			System.out.printf("네번째 숫자 : %s\n", nums[3]);
			System.out.printf("다섯번째 숫자 : %s\n", nums[4]);
			System.out.println(Values.dLine);
			
			int sum = Integer.valueOf(nums[0]);
			sum += Integer.valueOf(nums[1]);
			sum += Integer.valueOf(nums[2]);
			sum += Integer.valueOf(nums[3]);
			sum += Integer.valueOf(nums[4]);
			System.out.println("합계 : " + sum);
			
		}
		
		
	}

}

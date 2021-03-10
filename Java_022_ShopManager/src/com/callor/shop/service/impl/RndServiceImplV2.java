package com.callor.shop.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RndServiceImplV2 {

	private List<Integer> intList;
	private String fileName;
	
	/*
	 * 매개변수가 없는 생성자와
	 * 파일이름을 매개변수로 전달받아야 하는 생성자를 선언했다.
	 * 
	 * 매개변수가 없는 생성자를 호출하여 객체를 생성하면
	 * (= new RndServiceImplV2()라고 하면)
	 * 파일이름을 매개변수로 전달하면서
	 * 다시 매개변수가 있는 생성자를 호출한다
	 * 
	 */
	public RndServiceImplV2() { // *매개변수가 없는 생성자를 호출하면
		String fileName = "src/com/callor/shop/files/nums_rnd_v2.txt";
	}
	
	/*
	 * 매개변수가 있는 생성자를 객체를 생성할 때
	 * 반드시 파일이름을 전달받아야만 한다
	 * 
	 * = new RndServiceImplV2(파일이름);
	 * 
	 */
	public RndServiceImplV2(String fileName) { // *매개변수가 있는 생성자를 호출한다
		intList = new ArrayList<Integer>();
		this.fileName = fileName; // "src/com/callor/shop/files/nums_rnd_v2.txt";
	}

	public void makeRnd() {

		Random rnd = new Random();
		
		for (int i = 0; i < 100; i++) {
			Integer num = rnd.nextInt(1000) + 1;
			intList.add(num);
		}
		
	}
	
	public void saveFileRnd() {
		String fileName = "src/com/callor/shop/files/nums_rnd_v2.txt";
		this.saveFileRnd(fileName);
	}

	public void saveFileRnd(String fileName) {
		
		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);

			int nCount = 0;
			for (Integer n : intList) {
				printer.print(n + ":");
				if(++nCount % 5 == 0) {
					printer.println();
				}
			}

			printer.close();
			fileWriter.close();
			
			System.out.println("저장완료");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void loadFileRnd() {

	}

}

package com.com.iolist.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.com.iolist.model.IoListVO;
import com.com.iolist.service.IoListService;
import com.com.iolist.values.Values;

public class IoListServiceImplV1 implements IoListService{

	private List<IoListVO> ioList; // 객체 선언
	
	public IoListServiceImplV1() {
		ioList = new ArrayList<IoListVO>();
	}
	
	@Override
	public void loadFile() {
		String fileName = "src/com/com/iolist/매입매출데이터.txt";
		this.loadFile(fileName);
	}
	
	public void loadFile(String fileName) {
		// TODO 매입매출데이터를 읽어들여 유효한 정보만 저장
		
		// 기존에 저장되어 있던 정보 삭제
		ioList.removeAll(ioList);
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				String reader;
					reader = buffer.readLine();
				if(reader == null) {
					break;
				}
				
				// 읽어들인 문자열에서 공백을 없애고
				// 쉼표(,) 기준으로 잘라 data 배열에 저장
				reader = reader.replace(" ", "");
				String[] data = reader.split(",");
				
				IoListVO vo = new IoListVO(
						data[0], // 거래일자
						data[4], // 상품명
						data[5], // 거래처명
						data[6], // 대표자명
						data[7], // 구분
						Integer.valueOf(data[8]), // 매입단가
						Integer.valueOf(data[9]), // 판매단가
						Integer.valueOf(data[10]) // 수량
						);
				
				// data배열 값을 리스트에 저장
				ioList.add(vo);
				
			} // end while
			
		} catch (FileNotFoundException e) {
			System.out.println(fileName + " 파일이 없습니다");
		} catch (IOException e) {
			System.out.println("파일을 읽는 동안 문제가 발생했습니다");
		}
		
	}
	
	private void sortTotal() {
		// 구분이 1일때는 매입단가 * 수량, 판매금액은 0
		// 구분이 2일때는 판매단가 * 수량, 매입금액은 0
		
		for(IoListVO vo : ioList) {
			if(vo.getSort().equals("1")) {
				vo.setpTotal(vo.getpPrice() * vo.getQty());
				vo.setsTotal(0);
			} else if (vo.getSort().equals("2")) {
				vo.setsTotal(vo.getsPrice() * vo.getQty());
				vo.setpTotal(0);
			}
		}
	}
	
	@Override
	public void printIoList() {
		
		// 출력 전에 구분에 따른 total 계산
		this.sortTotal();
		
		System.out.println(Values.dLine);
		System.out.println("거래일자\t거래처\t대표자명\t상품이름\t매입금액\t판매금액");
		System.out.println(Values.sLine);
		
		for(IoListVO vo : ioList) {
			System.out.print(vo.getDate() + "\t");
			System.out.printf(vo.getCompany() + "\t");
			System.out.print(vo.getCustomer() + "\t");
			System.out.print(vo.getProduct() + "\t");
			System.out.print(vo.getpTotal() + "\t");
			System.out.print(vo.getsTotal() + "\n");
		}
		
		System.out.println(Values.dLine);
		
	}

	
	
	

}

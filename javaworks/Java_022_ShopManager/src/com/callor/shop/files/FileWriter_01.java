package com.callor.shop.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriter_01 {
	
	/*
	 * main() method : Java의 진입점 method
	 * 프로젝트를 가상머신에 의해 최초로 실행할 때
	 * 가상머신이 자동으로 호출하도록 만드는 method
	 * 
	 * FileWriter_01.main("...") 형식으로 호출이 된다
	 * 
	 */
	
	public static void main(String[] args) {
		
		// 컴퓨터에는 2가지 형식의 파일이 있다
		// 텍스트 파일 : 메모장으로 열었을 때 내용이 보임
		// 이진 파일(binary file) : 0과 1
		String strNums = "src/com/callor/shop/files/nums.txt";
		Random rnd = new Random();
		
		// 변수를 지금 바로 생성하지 않을 경우 clear를 해준다
		// 숫자형일 경우는 0으로
		// 클래스일 경우 null값으로
		FileWriter fileWriter = null;
		PrintWriter printer = null;
		
		try {
			// fileWriter 객체 생성
			// jvm은 운영체제와 통신을 연결시도 한다
			fileWriter = new FileWriter(strNums);
			
			/*
			 * fileWriter를 PrintWriter와 연결
			 * fileWriter만으로 파일 저장을 할 수 있지만 복잡하다
			 *  fileWriter를 직접 사용하여 파일 저장을 하는 방식을
			 *  저수준(Low level)방식이라고 한다.
			 *  
			 * fileWriter와 PrintWriter를 연결하면
			 * 	평소에 많이 사용하던 System.out.print() method와
			 * 	비슷한 방식으로 코드를 작성할 수 있다.
			 * 
			 * 이러한 방식을 고수준(High level) 방식이라고 한다.
			 * 	저수준보다 다소 느리게 작동될 수 있지만, 코드작성의 부담이 훨씬 줄어든다.
			 * 	또한 최근의 컴퓨터는 성능이 워낙 좋아져서 큰 차이가 나지 않는다.
			 * 
			 */
			printer = new PrintWriter(fileWriter);
//			printer = new PrintWriter(strNums); // 잘못작성한듯
			
			for(int i = 0; i < 100; i++) {
				int intNums = rnd.nextInt(1000) + 1;
				printer.println(intNums); // 숫자일 경우에도 문자로 자동 형변환된다
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

package com.callor.shop.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileWriter_04 {
	
	/*
	 * 클래스 영역에 변수를 선언하는 것은
	 * 현재 클래스가 포함하고 있는 모든 method들이
	 * 변수를 공유하여 코드를 수행하게 하려는 의도이다
	 * 
	 * 보통 생성자를 통해 객체를 생성하여 사용하는 클래스에
	 * 선언된 클래스 영역 변수를 "인스턴스변수"라고 한다
	 * 인스턴스 변수는 GC에 의해 메모리 관리가 자동으로 이루어진다
	 * 
	 * static method에서 필요한 변수들은
	 * 변수를 선언할 때 static 키워드를 추가하여 static 변수를 만든다
	 * static 변수는 GC이 접근하지 못한다.
	 * 프로젝트가 시작될 때 만들어지고, 계속 존재하는 상태이다.
	 * 프로젝트가 시작될 때 클래스가 자동으로 만들어지고
	 * 이때 static 변수들도 자동으로 생성된다
	 * 
	 * 클래스가 생성될 때 같이 만들어진다는 의미로
	 * static 키워드가 부착된 변수를 "클래스변수"라고 한다
	 * 
	 * static 변수는 선언과 생성을 동시에 하도록 코드를 작성한다
	 * 다만, static 생성자를 만들어 별도로 생성을 하는 경우도 있다
	 * 
	 */
	
	// 인스턴스 = 필요할 때 만들어서 쓰고 버린다
	// static은 인스턴스가 아님
	static String strNums = "src/com/callor/shop/files/nums.txt";
	static List<Integer> intList = new ArrayList<Integer>();
	
	/*
	 * main() method와 같은 클래스 내에 있는
	 * 	다른 method를 호출하여 코드를 수행할 경우
	 * 	main() method의 호출을 받는 method들은
	 * 	모두 static으로 선언되어야 한다
	 * >>> 메모리 관리에 상당히 불리해진다
	 * 
	 * main() method와 static으로 선언된 method들이
	 * 	클래스 영역에 선언된 변수를 공유하려면
	 * 	클래스 영역에 선언된 변수들도
	 * 	모두 static으로 선언되어야 한다
	 * 
	 */
	public static void main(String[] args) {
		
		/*
		 * static으로 선언된 method 내에서는
		 * 	같은 클래스의 다른 method를
		 * 	this.method() 형식으로 호출하지 못한다.
		 * 
		 */
		makeNums();
		saveFileNums();
		
	} // end main()
	
	private static void makeNums() {

		Random rnd = new Random();
		for(int i = 0; i < 100; i++) {
			intList.add(rnd.nextInt(1000) + 1);
		}

	}
	
	private static void saveFileNums() {
		
		FileWriter fileWriter = null;
		PrintWriter printer = null;
		
		try {
			fileWriter = new FileWriter(strNums);
			printer = new PrintWriter(fileWriter);
			
			printer.close();
			fileWriter.close();
			
			System.out.println("Mission Complete!!!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.callor.score.model.ScoreVO_T;
import com.callor.score.service.ScoreService_T;
import com.callor.score.values.Values;

/*
 * Service 클래스 코드 순서
 * 1. 입력한 또는 자동 생성한 데이터를 담아둘 List 객체 선언 및 생성
 * 2. 데이터를 입력 또는 생성하여 List에 담아두기
 * 
 */

public class ScoreServiceImplV1_T implements ScoreService_T{

	private List<ScoreVO_T> scoreList; // 객체선언
	public ScoreServiceImplV1_T() {
		scoreList = new ArrayList<ScoreVO_T>();
	}
	
	private String fileName = "src/com/callor/score/score.txt";

	
	@Override
	public void inputScore() {
		// TODO Scanner 클래스 사용
		Scanner scan = new Scanner(System.in);
		
	}
	
	/*
	 * Random 클래스를 사용하여 점수 생성
	 * makeScore()에서만 사용할 것이므로
	 * makeScore() method내에서 생성한다
	 */

	@Override
	public void makeScore() {
		// TODO Random 성적표 생성
		
		/* makeScore()는 호출될때마다 
		 * 20개씩 데이터를 생성하여 추가한다
		 * 이전에 저장된 데이터가 있더라도 계속 추가된다
		 * 
		 * list.remove(위치주소) : 특정 위치의 항목을 삭제
		 * list.removeAll(다른리스트)
		 * 
		 * 트릭을 사용한다
		 * scoreList에 담긴 데이터들 중에서
		 * 자신의 데이터와 일치하는 값들 모두를 삭제하라
		 * 
		 */
		scoreList.removeAll(scoreList);
		
		Random rnd = new Random();
		
		for(int i = 0; i < 20 ; i++) {
			ScoreVO_T scoreVO = new ScoreVO_T();
			
			// 학번 만들기
			// 00001 ~ 00020까지 문자열을 생성하여 저장
//			String strNum = String.format("%05d", i + 1);
			String strNum = String.format("2021%03d", i + 1);
			scoreVO.setStNum(strNum);
			
			// 국어점수 만들기
			scoreVO.setKor(rnd.nextInt(100)+1);
			
			int intEng = rnd.nextInt(100) + 1;
			scoreVO.setEng(intEng);
			
			int intMath= rnd.nextInt(100) + 1;
			scoreVO.setMath(intMath);
			
			int intMusic = rnd.nextInt(100) + 1;
			scoreVO.setMusic(intMusic);
			
			int intHistory = rnd.nextInt(100) + 1;
			scoreVO.setHistory(intHistory);
			
			scoreList.add(scoreVO);
		} // end for
		
		// 검사코드
		// for(ScoreVO_T vo : scoreList) {
			// System.out.println(vo.toString());
		// }
		
	}

	@Override
	public void saveScoreToFile() {
		// TODO Auto-generated method stub
		
		// 객체이름 명명
		// 클래스이름의 첫글자를 소문자로 하여
		// 클래스이름을 모두 사용한다
		FileWriter fileWriter = null;
		PrintWriter printer = null;
		
		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileName);
			
			// scoreList에 담긴 데이터를 파일로 출력
			for(ScoreVO_T vo : scoreList) {
				printer.print(vo.getStNum() + ":");
				printer.print(vo.getKor() + ":");
				printer.print(vo.getEng() + ":");
				printer.print(vo.getMath() + ":");
				printer.print(vo.getMusic() + ":");
				printer.print(vo.getHistory() + "\n");
			}
			
			printer.close();
			fileWriter.close();
			
			System.out.println("파일 저장 성공!!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("파일 생성 중 문제발생!!!");
		}
		
	}
	
	/*
	 * 성적이 저장되어 있는 score.txt 파일을 읽어
	 * 성적정보를 scoreList에 담기
	 * 
	 */
	@Override
	public void loadScoreFromFile() {
		
		// 기존에 저장되어 있던 리스트를 모두 제거
		// scoreList = new ArrayList<ScoreVO_T>();
		scoreList.removeAll(scoreList);
		
		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {

			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while (true) {
				String reader = buffer.readLine();
				if (reader == null) {
					break;
				}
				
				// 읽어들인 문자열을 콜론(:) 기준으로
				// 잘라서 scores 배열에 담아라
				String scores[] = reader.split(":");

				// 필드 생성자를 호출하여
				// 인스턴스 변수에 저장할 값을 전달하면서
				// 동시에 객체를 초기화(생성)
				ScoreVO_T vo = new ScoreVO_T(
						scores[0], // stNum
						Integer.valueOf(scores[1]), // kor
						Integer.valueOf(scores[2]), // eng
						Integer.valueOf(scores[3]), // math
						Integer.valueOf(scores[4]), // music
						Integer.valueOf(scores[5])  //history
						);

				scoreList.add(vo);
			} // end while

			buffer.close();
			fileReader.close();

		} catch (FileNotFoundException e) {
			System.out.println(fileName + "파일이 없습니다");
		} catch (IOException e) {
			System.out.println("파일을 읽는 동안 문제 발생");
		}
		
		this.printScore();

	}

	private void totalAndAvg() {
		for(ScoreVO_T vo : scoreList) {
			int sum = vo.getKor();
			sum += vo.getEng();
			sum += vo.getMath();
			sum += vo.getMusic();
			sum += vo.getHistory();
			
			float avg = (float)sum / 5;
			
			vo.setTotal(sum);
			vo.setAvg(avg);
		}
	}
	
	// 순위 메기기
	private void rankSet() {
		// list를 내림차순 정령
		int nSize = scoreList.size();
		
		for(int i = 0; i < nSize; i++) {
			for(int j = i + 1; j < nSize; j++) {
				if(scoreList.get(i).getTotal() < scoreList.get(j).getTotal()) {
					ScoreVO_T tVO = scoreList.get(i);
					scoreList.set(i, scoreList.get(j));
					scoreList.set(j, tVO);
				}
			}
		}
		
		for(int i = 0; i < nSize; i++) {
			scoreList.get(i).setRank(i + 1);
		}
		
		// 학번을 숫자로 변경한 후 정렬
//		for(int i = 0; i < nSize; i++) {
//			for(int j = i + 1; j < nSize; j++) {
//				int num1 = Integer.valueOf(scoreList.get(i).getStNum());
//				int num2 = Integer.valueOf(scoreList.get(j).getStNum());
//				if(num1 > num2) {
//					ScoreVO_T temp = scoreList.get(i);
//					scoreList.set(i, scoreList.get(j));
//					scoreList.set(j, temp);
//				}
//			}
//		} // end for
		
		// 문자열 비교 method를 사용하여 정렬
		for(int i = 0; i < nSize; i++) {
			for(int j = i + 1; i < nSize; j++) {
				
				ScoreVO_T voI = scoreList.get(i); 
				ScoreVO_T voJ = scoreList.get(j);
				
				// voI의 학번이 뒷번호인 경우 (값이 더 크다)
				if(voI.getStNum().compareTo(voJ.getStNum()) > 0) {
					ScoreVO_T tVO = scoreList.get(i);
					scoreList.set(i, scoreList.get(j));
					scoreList.set(j, tVO);
					
				}
			}
		}
			
		
		
	}
	
	@Override
	public void printScore() {
		
		// 출력 전에 총점 평균 계산
		this.totalAndAvg();
		
		// 출력 전 순위 생성
		this.rankSet();
		
		System.out.println(Values.dLine_T);
		System.out.println("빛나라 고교 성적처리 시스템 2021");
		System.out.println(Values.dLine_T);
		System.out.println("학번\t국어\t영어\t수학\t음악\t국사\t"
				+ "총점\t평균\t석차");
		System.out.println(Values.sLine_T);
		
		for(ScoreVO_T vo : scoreList) {
			System.out.print(vo.getStNum() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getMusic() + "\t");
			System.out.print(vo.getHistory() + "\t");

			System.out.print(vo.getTotal() + "\t");
			System.out.printf("%3.2f\t", vo.getAvg());
			System.out.print(vo.getRank() + "\n");
		}
		
		System.out.println(Values.dLine_T);

	}


}

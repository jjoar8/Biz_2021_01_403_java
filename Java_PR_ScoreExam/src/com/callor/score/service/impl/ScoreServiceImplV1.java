package com.callor.score.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.callor.score.values.Values;

public class ScoreServiceImplV1 implements ScoreService{
	
	private List<ScoreVO> scoreList;
	private Scanner scan;
	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}
	
	@Override
	public void inputScore() {
		// TODO 키보드를 통해 다음 항목을 입력받습니다
		// 학번, 국어, 영어, 수학 음악
		
		ScoreVO scoreVO = new ScoreVO();

		// 학번 입력 및 중복 검사
		while(true) {
			System.out.println(Values.dLine(70));
			System.out.print("학번 입력(예 : 00001) >> ");
			String strNum = scan.nextLine();

			ScoreVO check = null;
			for(ScoreVO vo : scoreList) {
				if(strNum.equals(vo.getStNum())) {
					check = vo;
				}
			}
			if(check == null) {
				scoreVO.setStNum(strNum);
				break;
			} else {
				System.out.println("이미 추가된 학번입니다");
			}
		}

		System.out.println(Values.dLine(70));

		System.out.println("국어 점수를 입력하세요");
		int intKor = this.scoreCheck(); // 과목 점수 유효성 검사
		System.out.println(Values.sLine(70));

		System.out.println("영어 점수를 입력하세요");
		int intEng = this.scoreCheck();
		System.out.println(Values.sLine(70));

		System.out.println("수학 점수를 입력하세요");
		int intMath = this.scoreCheck();
		System.out.println(Values.sLine(70));

		System.out.println("음악 점수를 입력하세요");
		int intMusic = this.scoreCheck();
		System.out.println(Values.sLine(70));

		scoreVO.setIntKor(intKor);
		scoreVO.setIntEng(intEng);
		scoreVO.setIntMath(intMath);
		scoreVO.setIntMusic(intMusic);

		scoreList.add(scoreVO);

		System.out.println("입력 결과 : " + scoreVO.toString());

		System.out.println(Values.dLine(70));
		System.out.println("성적 입력 완료");

	} // end inputScore()

	private int scoreCheck() {
		int num = 0;
		while(true) {
			try {
				System.out.print("입력(0 ~ 100점) >> ");
				String str = scan.nextLine();
				num = Integer.valueOf(str);
				if(num > 100) {
					System.out.println("점수는 100점까지 입력");
				} else if(num < 0) {
					System.out.println("점수는 0점 이상 입력");
				} else {
					return num;
				}
			} catch (Exception e) {
				System.out.println("점수는 숫자만 입력하세요");
			}
		}
	} // end scoreCheck()
	
	@Override
	public void saveScore() {
		String fileName = "src/com/callor/score/data/score.txt";
		this.saveScore(fileName);
	}
	
	public void saveScore(String fileName) {
		// TODO 파일로 저장합니다
		
		FileWriter fileWriter = null;
		PrintWriter printer = null;
		
		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileName);
			
			for(ScoreVO vo : scoreList) {
				printer.print(vo.getStNum() + ":");
				printer.print(vo.getIntKor() + ":");
				printer.print(vo.getIntEng() + ":");
				printer.print(vo.getIntMath() + ":");
				printer.print(vo.getIntMusic() + "\n");
			}
			
			printer.close();
			fileWriter.close();
			
			System.out.println("저장 완료 : " + fileName);
			
		} catch (IOException e) {
			System.out.println("파일 생성 중 문제발생");
		}
		
	}

	private void totalSumAndAvg() {

		for(ScoreVO vo : scoreList) {
			int sum = vo.getIntKor();
			sum += vo.getIntEng();
			sum += vo.getIntMath();
			sum += vo.getIntMusic();

			float avg = (float) sum / 4;

			vo.setIntSum(sum);
			vo.setFloatAvg(avg);
		}

	} // end totalSumAndAvg()
	
	@Override
	public void printScore() {
		// TODO 성적일람표를 console에 보여줍니다
		
		// 출력 전 총점, 평균 계산
		this.totalSumAndAvg();
		
		int sumKor = 0;
		int sumEng = 0;
		int sumMath = 0;
		int sumMusic = 0;
		
		int totalSum = 0;
		float totalAvg = 0;
		
		for(ScoreVO vo : scoreList) {
			sumKor += vo.getIntKor();
			sumEng += vo.getIntEng();
			sumMath += vo.getIntMath();
			sumMusic += vo.getIntMusic();
			totalSum += vo.getIntSum();
			totalAvg += vo.getFloatAvg();
		}
		
		int nSize = scoreList.size();
		float avgKor = (float) sumKor / nSize;
		float avgEng = (float) sumEng / nSize;
		float avgMath = (float) sumMath / nSize;
		float avgMusic = (float) sumMusic / nSize;
		totalAvg = (float) totalAvg / nSize;
		
		// 성적일람표 출력
		System.out.println(Values.dLine(70));
		System.out.println("성적일람표");
		System.out.println(Values.dLine(70));
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println(Values.sLine(70));
		
		for(ScoreVO vo : scoreList) {
			System.out.printf("%s\t", vo.getStNum());
			System.out.printf("%3d\t", vo.getIntKor());
			System.out.printf("%3d\t", vo.getIntEng());
			System.out.printf("%3d\t", vo.getIntMath());
			System.out.printf("%3d\t", vo.getIntMusic());
			System.out.printf("%d\t", vo.getIntSum());
			System.out.printf("%3.2f\n", vo.getFloatAvg());
		}
		
		System.out.println(Values.sLine(70));
		System.out.printf("총점 :\t%d\t%d\t%d\t%d\t%d\t\n", sumKor, sumEng, sumMath, sumMusic, totalSum);
		System.out.printf("평균 :\t%3.2f\t%3.2f\t%3.2f\t%3.2f\t\t%3.2f\n", avgKor, avgEng, avgMath, avgMusic, totalAvg);
		System.out.println(Values.dLine(70));
		
	}

}

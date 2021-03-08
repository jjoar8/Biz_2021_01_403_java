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

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.callor.score.values.Values;

public class ScoreServiceImplV1 implements ScoreService{

	private List<ScoreVO> scoreList;
	private String fileName = "src/com/callor/score/score.txt";
	
	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
	}
	
	@Override
	public void makeScore() {
		// TODO Random 클래스를 사용하여 학생 20명의 5과목 성적을
		// 1 ~ 100까지 범위에서 생성하여 파일에 저장한다
		// 총점과 평균을 구한다 (평균은 소수점이하 둘째 자리까지)
		
		Random rnd = new Random();
		ScoreVO scoreVO = new ScoreVO();
		
		for(int i = 0; i < Values.NUMBER_OF_STUDENT; i++) {
			int nums = rnd.nextInt(100) + 1;
			scoreVO.setIntKor(nums);
		}
		
		for(int i = 0; i < Values.NUMBER_OF_STUDENT; i++) {
			int nums = rnd.nextInt(100) + 1;
			scoreVO.setIntEng(nums);
		}
		
		for(int i = 0; i < Values.NUMBER_OF_STUDENT; i++) {
			int nums = rnd.nextInt(100) + 1;
			scoreVO.setIntMath(nums);
		}
		
		for(int i = 0; i < Values.NUMBER_OF_STUDENT; i++) {
			int nums = rnd.nextInt(100) + 1;
			scoreVO.setIntMusic(nums);
		}
		
		for(int i = 0; i < Values.NUMBER_OF_STUDENT; i++) {
			int nums = rnd.nextInt(100) + 1;
			scoreVO.setIntHistory(nums);
		}
		
//		int sum = scoreVO.getIntKor();
//		sum += scoreVO.getIntEng();
//		sum += scoreVO.getIntMath();
//		sum += scoreVO.getIntMusic();
//		sum += scoreVO.getIntHistory();
//		
//		Float avg = (float) sum / Values.NUMBER_OF_SUBJECT;
//		
//		scoreVO.setIntSum(sum);
//		scoreVO.setFloatAvg(avg);
		
		// scoreList에 저장
		scoreList.add(scoreVO);
		
	}

	@Override
	public void saveScoreToFile() {
		// TODO 과목별 성적을 파일에 저장한다
		
		FileWriter fileWriter = null;
		PrintWriter printer = null;
		
		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileName);
			
			for(int i = 0; i < Values.NUMBER_OF_STUDENT; i++) {
				printer.println(scoreList.get(i));
			}
			
			printer.close();
			fileWriter.close();
			
			System.out.println("저장완료");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // end try
		
	} // end saveScoreToFile

	@Override
	public void loadScoreFromFile() {
		// TODO 과목별 성적을 저장한 파일을 읽어
		// 총점과 평균을 계산한 후 출력한다
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	} // end loadScoreFromFile

}

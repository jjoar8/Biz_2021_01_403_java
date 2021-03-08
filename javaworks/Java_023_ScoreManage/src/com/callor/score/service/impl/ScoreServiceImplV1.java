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
import com.callor.score.model.ScoreVO_T;
import com.callor.score.service.ScoreService;
import com.callor.score.values.Values;

public class ScoreServiceImplV1 implements ScoreService{

	private List<ScoreVO> scoreList;
	private String fileName = "src/com/callor/score/homework.txt";
	
	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
	}
	
	@Override
	public void makeScore() {
		// TODO Random 클래스를 사용하여 학생 20명의 5과목 성적을
		// 1 ~ 100까지 범위에서 생성하여 파일에 저장한다
		// 총점과 평균을 구한다 (평균은 소수점이하 둘째 자리까지)
		
		Random rnd = new Random();
//		ScoreVO scoreVO = new ScoreVO(); // 이것도 for문 안에
		
		for(int i = 0; i < 20; i++) {
			ScoreVO scoreVO = new ScoreVO();
			
			int kor = rnd.nextInt(100) + 1;
			scoreVO.setIntKor(kor);
		
			int eng = rnd.nextInt(100) + 1;
			scoreVO.setIntEng(eng);
		
			int math = rnd.nextInt(100) + 1;
			scoreVO.setIntMath(math);
		
			int music = rnd.nextInt(100) + 1;
			scoreVO.setIntMusic(music);
		
			int history = rnd.nextInt(100) + 1;
			scoreVO.setIntHistory(history);
			
			scoreList.add(scoreVO);
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
//		scoreList.add(scoreVO); // for문 안에 했어야

		
	}

	@Override
	public void saveScoreToFile() {
		// TODO 과목별 성적을 파일에 저장한다
		
		FileWriter fileWriter = null;
		PrintWriter printer = null;
		
		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileName);
			
//			for(int i = 0; i < Values.NUMBER_OF_STUDENT; i++) {
//				printer.print(scoreList.get(i).getIntKor() + ":"); // 여기서 오류
//				printer.print(scoreList.get(i).getIntEng() + ":");
//				printer.print(scoreList.get(i).getIntMath() + ":");
//				printer.print(scoreList.get(i).getIntMusic() + ":");
//				printer.println(scoreList.get(i).getIntHistory() + ":");
//			}
			
			for(ScoreVO vo : scoreList) {
				printer.print(vo.getIntKor() + ":");
				printer.print(vo.getIntEng() + ":");
				printer.print(vo.getIntMath() + ":");
				printer.print(vo.getIntMusic() + ":");
				printer.print(vo.getIntHistory() + "\n");
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
		
		List<String> strLines = new ArrayList<String>();
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while (true) {
				String str = buffer.readLine();
				if (str == null) {
					break;
				}
				strLines.add(str);
			}
			
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for(String str : strLines) {
			String[] scores = str.split(":");
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setIntKor(Integer.valueOf(scores[0]));
			scoreVO.setIntEng(Integer.valueOf(scores[1]));
			scoreVO.setIntMath(Integer.valueOf(scores[2]));
			scoreVO.setIntMusic(Integer.valueOf(scores[3]));
			scoreVO.setIntHistory(Integer.valueOf(scores[4]));
			scoreList.add(scoreVO);
		}

		for(ScoreVO vo : scoreList) { // 리스트는 향상된 for 불가? 클래스는 가능?
			int sum = vo.getIntKor();
			sum += vo.getIntEng();
			sum += vo.getIntMath();
			sum += vo.getIntMusic();
			sum += vo.getIntHistory();

			float avg = (float) sum / Values.NUMBER_OF_SUBJECT;
			vo.setIntSum(sum);
			vo.setFloatAvg(avg);
		}

		System.out.println(Values.dLine);
		System.out.println("국어\t영어\t수학\t음악\t국사\t총점\t평균");
		System.out.println(Values.sLine);

		for(ScoreVO vo : scoreList) {
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%3.2f\n", 
					vo.getIntKor(), 
					vo.getIntEng(), 
					vo.getIntMath(), 
					vo.getIntMusic(), 
					vo.getIntHistory(), 
					vo.getIntSum(), 
					vo.getFloatAvg());
		}

		System.out.println(Values.dLine);
		
	} // end loadScoreFromFile

}

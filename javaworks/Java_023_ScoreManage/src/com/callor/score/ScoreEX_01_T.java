package com.callor.score;

import com.callor.score.service.ScoreService_T;
import com.callor.score.service.impl.ScoreServiceImplV1_T;

/*
 * ScoreService* 를 테스트하는 코드
 */

public class ScoreEX_01_T {
	
	public static void main(String[] args) {
		
		/*
		 * 인터페이스를 통하여
		 * *ServiceImpl*와 클래스를 사용하는 코드들 간에
		 * 약속이 만들어진다
		 * 
		 * 이런 환경이 되면, method가 달라서 발생하는 
		 * 여러 구조적 오류를 최소화 할 수 있다
		 * 
		 * 만약 implV1을 만들던 개발자가 코드를 미완성하더라도
		 * implV1 클래스를 사용하는 곳에서는 오류가 발생하지 않고
		 * 다른 부분 코드를 작성할 수 있게 된다
		 * 
		 */
		
		
		ScoreService_T ssV1 = new ScoreServiceImplV1_T();
		
		ssV1.inputScore();
		ssV1.makeScore();
		ssV1.saveScoreToFile();
		ssV1.loadScoreFromFile();
		ssV1.printScore();
		
		System.out.println("테스트 코드");
		
	}

}

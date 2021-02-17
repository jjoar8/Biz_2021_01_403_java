package com.callor.applications;

import com.callor.applications.service.ScoreService;

public class Score_02 {
	
	public static void main(String[] args) {
		
		ScoreService myScore = new ScoreService();
		
		System.out.println("조아라의 성적표");
		
		myScore.score();
		
	}
	

}

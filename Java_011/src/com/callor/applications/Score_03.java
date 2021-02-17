package com.callor.applications;

import com.callor.applications.service.ScoreServiceV2;

public class Score_03 {
	
	public static void main(String[] args) {
		
		ScoreServiceV2 scServiceV2 = new ScoreServiceV2();
		scServiceV2.print(88,77,56);
		scServiceV2.sum(99,88,77);
		
		scServiceV2.sum();
		scServiceV2.sum(1,2,3,4);
	}

}

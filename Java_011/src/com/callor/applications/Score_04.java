package com.callor.applications;

import com.callor.applications.service.ScoreServiceV3;

public class Score_04 {

	public static void main(String[] args) {

		ScoreServiceV3 scV3 = new ScoreServiceV3();
		
		scV3.sum();
		scV3.sum(20,40);
		
		float fnum1 = 43.25F;
		float fnum2 = 32.11F;
		scV3.sum(fnum1, fnum2);
		
		// scV3.sum(100D,fnum1)
		
	}

}

package com.callor.score.values;

public class Values {
	
	public final static String dLine = "================================================";
	public final static String sLine = "------------------------------------------------";

	public final static Integer MENU_START = 1;
	public final static Integer MENU_LAST = 3;
	
	public final static Integer MENU_MAKE_SCORE = 1;
	public final static Integer MENU_SAVE_SCORE = 2;
	public final static Integer MENU_LOAD_SCORE = 3;
	
	public final static Integer NUMBER_OF_STUDENT = 20;
	public final static Integer NUMBER_OF_SUBJECT = 5;
	
	// static final 변수 생성하기
	public static final String dLine_T;
	public static final String sLine_T;
	static { // static = 생성자 블럭 (method 아님)
		dLine_T = String.format("%050d",0).replace("0", "=");
		sLine_T = String.format("%050d",0).replace("0", "-");
	}
	
}

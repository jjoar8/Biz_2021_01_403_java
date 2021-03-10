package com.callor.score.model;

public class ScoreVO {
	
	// 학번, 국어, 영어, 수학, 음악
	// 총점, 평균
	
	private String stNum;
	
	private int intKor;
	private int intEng;
	private int intMath;
	private int intMusic;
	
	private int intSum;
	private float floatAvg;

	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
	}
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMath() {
		return intMath;
	}
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	public int getIntMusic() {
		return intMusic;
	}
	public void setIntMusic(int intMusic) {
		this.intMusic = intMusic;
	}
	public int getIntSum() {
		return intSum;
	}
	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}
	public float getFloatAvg() {
		return floatAvg;
	}
	public void setFloatAvg(float floatAvg) {
		this.floatAvg = floatAvg;
	}
	
	@Override
	public String toString() {
		return "ScoreVO [stNum=" + stNum + ", intKor=" + intKor + ", intEng=" + intEng + ", intMath=" + intMath
				+ ", intMusic=" + intMusic + ", intSum=" + intSum + ", floatAvg=" + floatAvg + "]";
	}

}

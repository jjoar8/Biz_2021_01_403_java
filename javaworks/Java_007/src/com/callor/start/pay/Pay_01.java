package com.callor.start.pay;

public class Pay_01 {
	
	public static void main(String[] args) {

		int pay = 4_789_800;
		int paper = 50_000;
		int sw = -1;
		
		for( ; pay > 0 ; ) {
			int count = pay / paper;
			System.out.println(paper + "원권 : " + count);
			pay -= (paper * count);
			
			if(sw < 0) {
				paper = paper / 5;
			}
			
			if(sw > 0) {
				paper = paper / 2;
			}
			
			sw *= (-1);

		}

	}

}

/*
int num = 0;
num++;

if(num % 2 == 0) {
paper /= 5;
}

if(num % 2 == 1) { 
paper /= 2;
}
*/
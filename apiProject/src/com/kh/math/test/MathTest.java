package com.kh.math.test;

public class MathTest {

	public static void main(String[] args) {
		double dNum = 1.5555;
		int result = (int)dNum;
		System.out.println(result);
		
		long result2 = Math.round(dNum);
		System.out.println(result2);
		
		double result3 = Math.round(dNum*10) / 10d;
		System.out.println(result3);
		
		double result4 = Math.ceil(dNum);
		System.out.println(result4);
	}
}

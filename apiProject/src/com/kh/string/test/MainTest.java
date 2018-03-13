package com.kh.string.test;

public class MainTest {
	public static void main(String[] args){
		int sum =0;
		
//		for(int i =0; i<args.length; i++){
//			
//		}
		
		String str = args[0];
		String[] strArr = str.split(",");
		for(int i = 0; i<strArr.length; i++){
			sum += Integer.parseInt(strArr[i]);
		}
		System.out.println(sum);
	}
}

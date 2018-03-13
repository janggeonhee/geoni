package com.kh.string.test;

import java.util.StringTokenizer;

public class StringParseTest {

	public static void main(String[] args) {
		String str = "Java, Oracle, Html, CSS, JS, jQuey, jsp, servlet, jstl/el, jdbc, ibatis, Spring";
		String[] subjects = str.split(", ");
		
		for(int i =0; i<subjects.length; i++){
			System.out.println((i+1) + " 번째 과목 " + subjects[i]);
		}
		System.out.println(str.substring(str.indexOf("H")));
		
		
		System.out.println(str.substring(str.indexOf("H") ,str.indexOf("H")+4 ));
		
		
		StringTokenizer st = new StringTokenizer(str, ", ");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}

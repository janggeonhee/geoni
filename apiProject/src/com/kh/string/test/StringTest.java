package com.kh.string.test;

import java.util.Formatter;

public class StringTest {

	public static void main(String[] args) {
		
		String str1 = "Hello Java";
		System.out.println(str1.hashCode());
		
		String str2 = "Hello Java";
		System.out.println(str2.hashCode());
		
		
		String str3 = new String("Hello Java");
		System.out.println(str3.hashCode());
		
		String str4 = str1 + "test";
		System.out.println(str4.hashCode());
		
		String num1 = "3";
		String num2 = "4";
		
		System.out.println(num1 + num2);
		System.out.println(Integer.parseInt(num1) + Integer.parseInt(num2));
		
		int i = 100;
		int j = 200;
		
		System.out.println(i+j);
		System.out.println(String.valueOf(i)+String.valueOf(j));
		
		Formatter f = new Formatter(System.out);
		f.format("%d, %d, %s, %f", 10,20,"장건희",1.5);
	}
}

package com.kh.string.test;

public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("java test");
		System.out.println(sb.hashCode());
		System.out.println(sb.toString());
		sb.append(" append Text  ");
		System.out.println(sb.hashCode());
		System.out.println(sb.toString());
		
		
		
		StringBuffer strBuff = new StringBuffer("Java Test");
		System.out.println(strBuff.hashCode());
		System.out.println(strBuff.toString());
		strBuff.append(" Hello world");
		System.out.println(strBuff.hashCode());
		System.out.println(strBuff.toString());
		
	}
}

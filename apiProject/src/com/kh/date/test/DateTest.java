package com.kh.date.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
		String ftToday = ft.format(today);
		System.out.println(ftToday);
		
		
		SimpleDateFormat ft2 = new SimpleDateFormat("나만의 포맷 : yyyy-MM-dd hh:mm:ss EE 이렇게 만들께요");
		Date data2 = new Date(0);
		
		System.out.println(ft2.format(today));
		System.out.println(ft2.format(data2));
		
		
		Calendar cal = new GregorianCalendar(1992, 11, 14);
		long timeSecond = cal.getTimeInMillis();
		
		Date date3 = new Date(timeSecond);
		System.out.println(ft2.format(date3));
		
		
		Date date4 = cal.getTime();
		System.out.println(ft2.format(date4));
	}
}

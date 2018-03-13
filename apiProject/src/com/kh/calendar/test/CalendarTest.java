package com.kh.calendar.test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		Calendar calendar = new GregorianCalendar();
		
		System.out.println(calendar);
		
		int year = calendar.get(Calendar.YEAR);
		System.out.println(year);
		int ampm = calendar.get(Calendar.AM_PM);
		System.out.println(ampm);
		
		
		String sAmPm = (ampm == Calendar.AM) ? "오전" : "오후";
		
		System.out.println(sAmPm);
		System.out.println(Calendar.AM);
		

		
	}
}

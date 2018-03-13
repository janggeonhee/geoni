package com.api.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateCalculator {
	
	public DateCalculator(){}	
	
	public int getDays(){
		int days= 0;
		Calendar start = new GregorianCalendar(1,0,1);
		Calendar today = new GregorianCalendar();
		
		// 1 ~2017년 12월 31일 까지
		for(int i =1; i<today.get(Calendar.YEAR); i++){
			if(isLeapYear(i)){
				days += 366;
			}else
				days += 365;
		}
		
		for(int i =0; i<today.get(Calendar.MONTH); i++){
			switch(i+1){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: 
				days += 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days +=30;
				break;
			case 2 :
				if(isLeapYear(today.get(Calendar.YEAR))){
					days += 29;
				}else{
					days += 28;
				}
				break;
			}			
		}
		days += today.get(Calendar.DAY_OF_MONTH);
	
		return days;
	}
	

	
	public boolean isLeapYear(int year){
		boolean result = false;
		if(year % 4==0 && (year % 100 != 0 || year %400 ==0)){
			result = true;
		}
		return false;
	}
}

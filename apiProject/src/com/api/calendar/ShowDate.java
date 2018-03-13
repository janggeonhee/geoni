package com.api.calendar;

public class ShowDate {

	public static void main(String[] args) {
		DateCalculator d = new DateCalculator();
		System.out.println(d.isLeapYear(2018) == true ? "윤년" : "평년");
		
		int days = d.getDays();
		System.out.println("총 날 " + days);
	}

}

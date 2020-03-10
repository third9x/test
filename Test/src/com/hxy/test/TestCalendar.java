package com.hxy.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestCalendar {
	public static void main(String[]args) throws ParseException {
		
		
		System.out.println("请输入日期：xxxx-xx-xx");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date date = df.parse(str);
		Calendar c = new GregorianCalendar();
		int nowday = c.get(Calendar.DAY_OF_MONTH);
		c.setTime(date);
		
		c.set(Calendar.DAY_OF_MONTH,1);
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		int days = c.get(Calendar.DAY_OF_WEEK);
		for(int i = 0;i < days-1;i++) {
			System.out.print("\t");
		}
	
		for(int i = 1;i <= c.getActualMaximum(Calendar.DATE);i++) {
			if(c.get(Calendar.DAY_OF_MONTH) == nowday) {
				System.out.print(c.get(Calendar.DAY_OF_MONTH)	+"* \t");
			}
			else {
				System.out.print(c.get(Calendar.DAY_OF_MONTH)	+"\t");
			}
		if(c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
			System.out.println();
		}
				c.add(Calendar.DAY_OF_MONTH, 1);
				
				
		}
	}	
}

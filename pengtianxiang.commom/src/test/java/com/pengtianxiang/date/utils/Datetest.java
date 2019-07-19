package com.pengtianxiang.date.utils;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.xml.crypto.Data;

import org.junit.Test;

public class Datetest {
	@Test
	public static void fun1getAge (){
		
		String format = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.CHINESE).format(new java.util.Date());
		System.out.println(format);
//		String date="1999/5/8";
//		int age = Dateutils.getAge(date);
//		System.out.println(age);
	}
	@Test
	public static void fungetDateByMonthInit (){
		String date="1999/5/8/14:24:26";
		int age = Dateutils.getAge(date);
		System.out.println(age);
	}
	@Test
	public static void fungetDateByMonthLast (){
		String date="1999/5/8/14:24:26";
		String age = Dateutils.getDateByMonthLast(date);
		System.out.println(age);
	}
	@Test
	public static void fungetDaysByFuture (){
		String date="1999/5/8/14:24:26";
		int age = Dateutils.getAge(date);
		System.out.println(age);
	}
	@Test
	public static void fungetDaysByDeparted (){
		String date="1999/5/8/14:24:26";
		int age = Dateutils.getAge(date);
		System.out.println(age);
	}

}

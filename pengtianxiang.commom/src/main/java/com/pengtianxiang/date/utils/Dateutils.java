package com.pengtianxiang.date.utils;

import java.util.Date;

public class Dateutils {
	/**
	 * 方法1：根据传入的日期获取年龄
	 * @param date
	 * @return
	 */
	
	public static int getAge (String date) {
		String[] split = date.split("/");
		int da=2019;
		int age=0;
		age=2019-Integer.parseInt(split[0]);
		System.out.println(split);
		return age;
	//TODO
	}

	
/**
 * 	方法2：根据传入的参数获取该日期的月初日期，例如给定的日期为“2019-09-19 19:29:39”，
 * 返回“2019-09-01 00:00:00”
	
 * @param src
 * @return
 */
	public static Date getDateByMonthInit (Date src) {
		return src;
	//TODO
	}
	
	/**
	 * 方法3 :根据传入的参数获取该日器的月末日期，
	 * 例如给定的日期为“2019-09-19 19:29:39”
	 * ，返回“2019-09-30 23:59:59”，注意月大月小以及闰年
	 * @param date
	 * @return
	 */
	public static String getDateByMonthLast(String date) {
		return date;
		//TODO
		}

/**
 * 方法4：求未来日期离今天还剩的天数
 * @param future
 * @return
 */
	
	public static int getDaysByFuture (Date future) {
		return 0;
		//TODO
		}

	
	/**
	 * 求过去日期离今天过去的天数
	 * @param departed
	 * @return
	 */
	public static int getDaysByDeparted (Date departed) {
		return 0;
		//TODO
		}

	
	
}

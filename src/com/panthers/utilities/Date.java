package com.panthers.utilities;


public class Date implements Comparable<Date> 
{
	private int month;
	private int day;
	private int year;
	
	public Date(int month, int day, int year)
	{
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public void setMonth(int month)
	{
		this.month = month;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public void setDay(int day)
	{
		this.day = day;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setYear(int Year)
	{
		this.year = year;
	}

	@Override
	public int compareTo(Date date) {
		if ((this.month == date.month) && (this.day == date.day) && (this.year == date.year))
			return 1;
		else 
			return 0;
	}
	
	
	

}

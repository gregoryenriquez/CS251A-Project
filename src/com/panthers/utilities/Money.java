package com.panthers.utilities;


public class Money implements Comparable <Money>
{
	private int majorAmount ;
	private int minorAmount;
	
	public int getMajorAmount ()
	{
		return majorAmount;
	}
	
	public int getMinorAmount ()
	{
		return minorAmount;
	}
	
	public Money (int majorAmount, int minorAmount)
	{
		this.majorAmount = majorAmount;
		this.minorAmount = minorAmount;
	}
	
	
	public Money add (Money other)
	{
		return new Money (this.majorAmount + other.majorAmount, this.minorAmount + other.minorAmount);
	}
	
	public Money sub (Money other)
	{
		return new Money (this.majorAmount + other.majorAmount, this.minorAmount + other.minorAmount);
	}

	@Override
	public int compareTo(Money other) {
		if ((this.majorAmount == other.majorAmount) && *(this.minorAmount == this.minorAmount))
			return 1;
		else
			return 0;
	}

}

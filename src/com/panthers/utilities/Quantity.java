package com.panthers.utilities;


public class Quantity implements Comparable <Quantity> 
{
	private double productQuantity;
	private Unit unit;
	
	
	public Quantity (double productQuantity, Unit unit)
	{
		super();
		this.productQuantity = productQuantity;
		this.unit = unit;
	}
	
	public double getQuantity ()
	{
		return productQuantity;
	}
	
	public Unit getUnit ()
	{
		return unit;
	}
	
	public void setQuantity (double productQuantity)
	{
		this.productQuantity = productQuantity;
	}
	
	public void setUnit (Unit unit)
	{
		this.unit = unit;
	}
	
	public Quantity add (Quantity other)
	{
		return new Quantity(this.productQuantity + other.productQuantity, this.unit);
	}
	
	public Quantity sub (Quantity other)
	{
		return new Quantity(this.productQuantity - other.productQuantity, this.unit);
	}

	@Override
	public int compareTo(Quantity other) {
		if (this.productQuantity == other.productQuantity)
			return 1;
		else
			return 0;
	}
	
	}

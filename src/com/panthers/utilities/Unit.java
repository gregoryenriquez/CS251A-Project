package com.panthers.utilities;

public class Unit {
	private String name;
	public static final Unit KILO = new Unit("kilo");
	public static final Unit GRAM = new Unit("gram");
	public static final Unit POUND = new Unit("pound");
	public static final Unit OUNCE = new Unit("ounce");
	public static final Unit GALLON = new Unit("gallon");
	public static final Unit LITRE = new Unit("liter");
	public static final Unit COUNT = new Unit("count");
	
	public Unit(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
}

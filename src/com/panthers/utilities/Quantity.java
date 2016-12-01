package com.panthers.utilities;

public class Quantity {
	private int amount;
	private Unit type;
	public Quantity(int a, Unit t) {
		this.amount = a;
		this.type = t;
		
	}
	
	public void add(Quantity q) {
		this.amount += q.getAmount();
	}
	
	public void sub(Quantity q) {
		this.amount -= q.getAmount();
	}
	
	public int getAmount() {
		return this.amount;
		
	}
}


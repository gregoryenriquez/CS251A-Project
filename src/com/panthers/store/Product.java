package com.panthers.store;

import com.panthers.utilities.Money;

public class Product {
	private Money unitPrice;
	private String UPC;
	private String description;
	
	public Product(String upc, String desc, Money m) {
		this.UPC = upc;
		this.description = desc;
		this.unitPrice = m;
	}
	
	public Money getPrice() {
		return unitPrice;
	}
	
	public void setPrice(Money m) {
		unitPrice = m;
	}
	
	public String getUPC() {
		return this.UPC;
	}
	
	public String getDescription() {
		return this.description;
	}
}

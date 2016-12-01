package com.panthers.store;

import java.util.ArrayList;

import com.panthers.utilities.Money;
import com.panthers.utilities.Supplier;

public class Product {
	private Money unitPrice;
	private String UPC;
	private String description;
	private ArrayList<Supplier> suppliers;
	
	public Product(String upc, String desc, Money m) {
		this.UPC = upc;
		this.description = desc;
		this.unitPrice = m;
		this.suppliers = new ArrayList<Supplier>();
	}
	
	public void addSupplier(Supplier s) {
		this.suppliers.add(s);
	}
	
	public void removeSupplier(Supplier s) {
		for (int i = 0; i < this.suppliers.size(); i++) {
			if (suppliers.get(i).getSupplierId() == s.getSupplierId()) {
				suppliers.remove(i);
				return;
			}
		}
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

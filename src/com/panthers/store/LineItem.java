package com.panthers.store;

import com.panthers.utilities.Quantity;

public class LineItem {
	private String storeId;
	private Product product;
	private Quantity quantity;
	
	public LineItem(String s, Product p, Quantity q) {
		this.storeId = s;
		this.product = p;
		this.quantity = q;
	}
	
	public String getStoreId() {
		return storeId;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public Quantity getQuantity() {
		return this.quantity;
	}
	
	public Money getLineItemPrice() {
		return new Money(this.product.getPrice() * this.quantity.getAmount());
	}
}

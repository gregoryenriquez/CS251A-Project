package com.panthers.store;

import com.panthers.services.InventoryManager;

public class LineItem {
	private String storeId;
	private Product product;
	
	public String getStoreId() {
		return storeId;
	}
	
	public Product getProduct() {
		return product;
	}
}

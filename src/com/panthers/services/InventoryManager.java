package com.panthers.services;

import com.panthers.store.Store;

public class InventoryManager {
	private static InventoryManager instance = null;
	
	public static InventoryManager getInstance() {
		if (instance == null) {
			instance = new InventoryManager();
		}
		return instance;
	}
	
	public Store queryInventory(String UPC) {
		return null;
	}
	
	public boolean addProduct(String UPC) {
		
	}
	
	public boolean archiveProduct(String UPC) {
		
	}
	
	public boolean executeReplenishmentOrder(ReplenishmentOrder ro) {
		
	}
}

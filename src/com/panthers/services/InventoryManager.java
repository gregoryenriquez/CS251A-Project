package com.panthers.services;

import com.panthers.orders.OrderPoint;
import com.panthers.orders.ReplenishmentOrder;
import com.panthers.store.Store;
import com.panthers.utilities.Quantity;

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
		return false;
	}
	
	public boolean archiveProduct(String UPC) {
		return false;
	}
	
	public boolean executeReplenishmentOrder(ReplenishmentOrder ro) {
		return false;
	}
	
	public void incrementStock(String UPC, Quantity q) {
		
	}
	
	public void decrementStock(String UPC, Quantity q) {
		
	}
	
	public boolean editStore(String UPC) {
		return false;
	}
	
	public OrderPoint calculateOrderPoint(Store store) {
		return new OrderPoint(null, null, null);
	}
	
	public void createTransaction() {
		
	}
}

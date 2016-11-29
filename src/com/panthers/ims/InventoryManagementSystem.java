package com.panthers.ims;

import com.panthers.external.WarehouseManager;
import com.panthers.ims.*;
import com.panthers.utilities.*;


public class InventoryManagementSystem {
	public int queryQuantity(String upc) {
		return 0;
	}
	
	public boolean executeTransaction(Order order) {
		return false;
	}
	
	public Report generateReport() {
		return null;
	}
	
	public boolean createStore(WarehouseManager house, Store store) {
		return false;
	}
	
	public boolean archiveStore(WarehouseManager house, Store store) {
		return false;
	}
	
	public void writeToLedger(Order order) {
		
	}
}

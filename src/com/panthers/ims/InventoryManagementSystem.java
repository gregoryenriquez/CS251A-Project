package com.panthers.ims;

import java.util.ArrayList;

import com.panthers.external.WarehouseManager;


public class InventoryManagementSystem {
  public static ArrayList<Order> ledger;
  public static WarehouseManager warehouseManager;
  
  public InventoryManagementSystem() {
    warehouseManager = new WarehouseManager();
  }
  
  public InventoryManagementSystem(WarehouseManager externalManager) {
    /*
     * if WarehouseManager is an external entity, then first set warehouse manager, otherwise default to local
     */
    warehouseManager = externalManager;
  }
  
	public int queryQuantity(String UPC, WarehouseManager wm) {
	  return wm.queryQuantity(UPC);
	}
	
	public boolean executeTransaction(Order order) {
	  writeToLedger(order);
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
	
	private void writeToLedger(Order order) {
		ledger.add(order);
	}
}

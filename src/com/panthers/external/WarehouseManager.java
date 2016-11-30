package com.panthers.external;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

import com.panthers.utilities.Warehouse;

public class WarehouseManager {
	private ArrayList<Warehouse> warehouses;
	private final int NUM_WAREHOUSES = 5;
	private Map<String, Integer> itemToWarehouse;
	
	public WarehouseManager() {
	  for (int i = 0; i < NUM_WAREHOUSES; i++) {
	    warehouses.add(new Warehouse());
	  }
	}
	
	public Integer getWarehouseNumber(String UPC) {
	  return itemToWarehouse.get(UPC);
	}
	
	public Integer sendItemToWarehouse(String UPC, String description, int quantity) throws Exception {
	  Random rand = new Random();
	  int warehouseNum = rand.nextInt() % NUM_WAREHOUSES;
	  warehouses.get(warehouseNum).addItem(UPC, description, quantity);
	  itemToWarehouse.put(UPC, new Integer(warehouseNum));
	  return new Integer(warehouseNum);
	}
	
	public int queryQuantity(String UPC) {
	  int warehouseNum = itemToWarehouse.get(UPC);
	  return warehouses.get(warehouseNum).queryQuantity(UPC);
	}
}

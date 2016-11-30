package com.panthers.external;

import java.util.ArrayList;

import com.panthers.utilities.Warehouse;

public class WarehouseManager {
	private ArrayList<Warehouse> warehouses;
	private final int NUM_WAREHOUSES = 5;
	
	public WarehouseManager() {
	  for (int i = 0; i < NUM_WAREHOUSES; i++) {
	    warehouses.add(new Warehouse());
	  }
	}
}

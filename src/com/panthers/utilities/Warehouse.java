package com.panthers.utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Warehouse {
	private Map<String, Aisle> aisles;
	
	public Warehouse() {
		aisles = new HashMap();
	}
	
	public Item retrieveItem(String UPC) {
		return aisles.get(UPC).shelves.get(UPC).stores.get(UPC).item.item;
	}
	
	private class Aisle {
		private Map<String, Shelf> shelves;
	}
	
	private class Shelf {
		private Map<String, Store> stores;
	}
	
	private class Store {
		private LineItem item;
	}
	
	private class LineItem {
		private Item item;
		private int quantity;
	}
	
	private class Item {
		private String UPC;
		private String description;
	}
}

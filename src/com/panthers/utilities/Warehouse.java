package com.panthers.utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Warehouse {
	private ArrayList<Aisle> aisles;
	private Map<String, WarehouseLocation> itemLocations;
	
	private int MAX_AISLES = 100;
	private int MAX_SHELVES = 100;
	private int MAX_STORES = 100;
	
	public Warehouse() {
	  aisles = new ArrayList<Aisle>(MAX_AISLES);
	  for (int i = 0; i < aisles.size(); i++) {
	    aisles.add(new Aisle());
	  }
	  itemLocations = new HashMap<String, WarehouseLocation>();
		
	}
	
	public Item retrieveItem(String UPC, int quantity) throws Exception {
	  WarehouseLocation whLoc = itemLocations.get(UPC);
	  if (whLoc == null) {
	    // item does not exist in the warehouse
	    return null;
	  } else {
	    // find item & deduct quantity from existing store
	    LineItem lit = aisles.get(whLoc.getAisle()).shelves.get(whLoc.getShelf()).stores.get(whLoc.getStore()).lineItem;
	    lit.deduct(quantity);
	    return lit.item;
	  }
	  
	}
	
	public void addItem(String UPC, String description, int quantity) throws Exception {
	 Item doesItemExist = retrieveItem(UPC, 0);
	 if (doesItemExist == null) {
	   // find empty store, add item, add item description, add quantity
	 } else {
	   // add to existing store case, add quantity
	 }
	}
	
	public int queryQuantity(String UPC) {
	  WarehouseLocation whLoc = itemLocations.get(UPC);
	  if (whLoc == null) {
	    return 0;
	  } else {
	    LineItem lit = aisles.get(whLoc.getAisle()).shelves.get(whLoc.getShelf()).stores.get(whLoc.getStore()).lineItem;
	    return lit.quantity;
	  }
	}
	
	private class WarehouseLocation {
	  private int aisleNum;
	  private int shelfNum;
	  private int storeNum;
	  private WarehouseLocation(int aisle, int shelf, int store) {
	    aisleNum = aisle;
	    shelfNum = shelf;
	    storeNum = store;
	  }
	  public int getAisle() {return aisleNum;};
	  public int getShelf() {return shelfNum;};
	  public int getStore() {return storeNum;};
	}
	
	private class Aisle {
		private ArrayList<Shelf> shelves;
		public Aisle() {
		  shelves = new ArrayList<Shelf>(MAX_SHELVES);
		  for (int i = 0; i < shelves.size(); i++) {
		    shelves.add(new Shelf());
		  }
		}
	}
	
	private class Shelf {
		private ArrayList<Store> stores;
		public Shelf() {
		  stores = new ArrayList<Store>(MAX_STORES);
		  for (int i = 0 ; i < stores.size(); i++) {
		    stores.add(new Store());
		  }
		}
	}
	
	private class Store {
	  public Store(LineItem lit) {
	    this.lineItem = lit;
	  }
	  public Store() {
	    this.lineItem = null;
	  }
		private LineItem lineItem;
	}
	
	private class LineItem {
		private Item item;
		private int quantity;
		
		public LineItem(Item it, int qty) {
		  this.item = it;
		  this.quantity = qty;
		}
		
		public void add(int qty) {
		  this.quantity += qty;
		}
		
		public void deduct(int qty) throws Exception {
		  if (this.quantity - qty < 0) {
		    throw new Exception("Insufficient quantity for item: " + item.description);
		  }
		  this.quantity -= qty;
		}
	}
	
	private class Item {
		private String UPC;
		private String description;
	}
}

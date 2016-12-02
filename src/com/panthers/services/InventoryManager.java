package com.panthers.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.panthers.orders.OrderPoint;
import com.panthers.orders.ReplenishmentOrder;
import com.panthers.store.LineItem;
import com.panthers.store.Product;
import com.panthers.store.Store;
import com.panthers.store.Store.StoreStatus;
import com.panthers.utilities.Money;
import com.panthers.utilities.Quantity;

public class InventoryManager {
	private static InventoryManager instance = null;
	private Map<String, Store> inventory;
	
	public static InventoryManager getInstance() {
		if (instance == null) {
			instance = new InventoryManager();
		}
		return instance;
	}
	
	public InventoryManager() {
		inventory = new HashMap<String, Store>();
	}
	
	public Store queryInventory(String UPC) {
		return inventory.get(UPC);
	}
	
	public boolean addProduct(String UPC, String name, String description) {
		Product product = new Product(UPC, name, description, new Money(0));
		if (inventory.put(UPC, new Store(UPC, product, new OrderPoint())) == null) {
			return false;
		}
		return true;
	}
	
	public boolean archiveProduct(String UPC) {
		if (inventory.get(UPC) == null) {
			return false;
		}
		inventory.get(UPC).setStoreStatus(StoreStatus.ARCHIVED);
		return true;
	}
	
	public boolean executeReplenishmentOrder(ReplenishmentOrder order) {
		ArrayList<LineItem> lineItems = order.getLineItems();
		for (int i = 0; i < lineItems.size(); i++) {
			String upc = lineItems.get(i).getProduct().getUpc();
			Quantity quantity = lineItems.get(i).getQuantity();
			inventory.get(upc).addProductQuantity(quantity);
		}
		return true;
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

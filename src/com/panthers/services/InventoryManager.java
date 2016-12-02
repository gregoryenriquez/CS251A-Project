package com.panthers.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.panthers.orders.Order;
import com.panthers.orders.OrderPoint;
import com.panthers.orders.ReplenishmentOrder;
import com.panthers.orders.Transaction;
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
			String upc = lineItems.get(i).getProduct().getUPC();
			Quantity quantity = lineItems.get(i).getQuantity();
			try {
				incrementAndWrite(upc, quantity, order);
			} catch (Exception e) {
				return false;
			}
		}
		return true;
	}
	
	public void incrementAndWrite(String UPC, Quantity quantity, Order order) throws Exception {
		incrementStock(UPC, quantity);
		createTransaction(inventory.get(UPC), order);
	}
	
	public void decrementAndWrite(String UPC, Quantity quantity, Order order) throws Exception {
		decrementStock(UPC, quantity);
		createTransaction(inventory.get(UPC), order);
	}
	
	private void incrementStock(String UPC, Quantity q) throws Exception{
		inventory.get(UPC).addProductQuantity(q);
	}
	
	private void decrementStock(String UPC, Quantity q) throws Exception {
		inventory.get(UPC).removeProductQuantity(q);
	}
		
	public OrderPoint calculateOrderPoint(Store store) {
		return new OrderPoint();
	}
	
	public void createTransaction(Store store, Order order) {
		store.addRecord(new Transaction(order, order.getTransactionDate()));
	}
	
	public void reserveQuantity(String UPC, Quantity quantity) throws Exception {
		inventory.get(UPC).addReservedQuantity(quantity);
	}
	
	public void releaseQuantity(String UPC, Quantity quantity) throws Exception {
		inventory.get(UPC).removeReservedQuantity(quantity);
	}
}

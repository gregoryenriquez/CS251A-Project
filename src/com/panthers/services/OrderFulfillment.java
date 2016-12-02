package com.panthers.services;

import java.util.ArrayList;

import com.panthers.orders.PurchaseOrder;
import com.panthers.store.LineItem;
import com.panthers.utilities.Quantity;

public class OrderFulfillment {
	public Quantity queryQuantity(String UPC) {
		return InventoryManager.getInstance().queryInventory(UPC).getProductQuantity();
	}
	
	public boolean executePurchaseOrder(PurchaseOrder po) {
		InventoryManager im = InventoryManager.getInstance();
		ArrayList<LineItem> lineItems = po.getLineItems();
		for (int i = 0; i < lineItems.size(); i++) {
			LineItem li = lineItems.get(i);
			try {
				im.decrementAndWrite(li.getProduct().getUPC(), li.getQuantity(), po);
			} catch (Exception e) {
				return false;
			}
		}
		return true;
	}
	
	public boolean reserveProducts(PurchaseOrder po) { 
		InventoryManager im = InventoryManager.getInstance();
		ArrayList<LineItem> lineItems = po.getLineItems();
		for (int i = 0; i < lineItems.size(); i++) {
			LineItem li = lineItems.get(i);
			try {
				im.reserveQuantity(li.getProduct().getUPC(), li.getQuantity());
			} catch (Exception e) {
				return false;
			}
		}
		return true;
	}
}

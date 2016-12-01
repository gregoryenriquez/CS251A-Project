package com.panthers.services;

import com.panthers.orders.PurchaseOrder;
import com.panthers.utilities.Quantity;
import com.panthers.utilities.Unit;

public class OrderFulfillment {
	public Quantity queryQuantity(String UPC) {
		return new Quantity(0, Unit.COUNT);
	}
	
	public boolean executePurchaseOrder(PurchaseOrder po) {
		return false;
	}
	
	public boolean reserveProducts(PurchaseOrder po) { 
		return false;
	}
}

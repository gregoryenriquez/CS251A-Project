package com.panthers.orders;

import java.util.ArrayList;

import com.panthers.store.LineItem;
import com.panthers.utilities.Date;
import com.panthers.utilities.Money;

public class PurchaseOrder extends Order {
	private String customerId;
	
	public PurchaseOrder(int id, Date pd, Date td, Money p,
			ArrayList<LineItem> li, String customerId) {
		super(id, pd, td, p, li);
		this.customerId = customerId;
	}
	
	public String getCustomerId() {
		return this.customerId;
	}
}

package com.panthers.orders;

import com.panthers.utilities.Date;
import com.panthers.utilities.Money;

public class PurchaseOrder extends Order {
	public PurchaseOrder(int id, Date pd, Date td, Money p, String cid) {
		super(id, pd, td, p);
		this.customerId = cid;
		// TODO Auto-generated constructor stub
	}

	
	private String customerId;
	
	public String getCustomerId() {
		return customerId;
	}
}

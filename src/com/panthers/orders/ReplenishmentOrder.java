package com.panthers.orders;

import java.util.ArrayList;

import com.panthers.store.LineItem;
import com.panthers.utilities.Date;
import com.panthers.utilities.Money;
import com.panthers.utilities.Supplier;

public class ReplenishmentOrder extends Order {
	private Supplier supplier;

	public ReplenishmentOrder(int id, Date pd, Date td, Money p,
			ArrayList<LineItem> li, Supplier supplier) {
		super(id, pd, td, p, li);
		this.supplier = supplier;
	}
	
	public Supplier getSupplier() {
		return this.supplier;
	}
}

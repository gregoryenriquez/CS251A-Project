package com.panthers.orders;

import com.panthers.utilities.Supplier;

public class ReplenishmentOrder extends Order {
	private Supplier supplier;
	public ReplenishmentOrder(Supplier s) {
		supplier = s;
	}
}

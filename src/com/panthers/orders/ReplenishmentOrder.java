package com.panthers.orders;

import com.panthers.utilities.Date;
import com.panthers.utilities.Money;
import com.panthers.utilities.Supplier;

public class ReplenishmentOrder extends Order {
	public ReplenishmentOrder(int id, Date pd, Date td, Money p, Supplier s) {
		super(id, pd, td, p);
		this.supplier = s;
	}

	private Supplier supplier;

}

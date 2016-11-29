package com.panthers.ims;

import com.panthers.utilities.Phone;

public class ReplenishmentOrder extends Order{
	private String supplierName;
	private Phone supplierPhone;
	
	public ReplenishmentOrder() {
		

	}
	
	public enum REPLENISHMENT_ORDER_STATUS {
		PROCESSING,
		DELIVERED,
		OUT_OF_STOCK
	}


}

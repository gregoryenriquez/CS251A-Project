package com.panthers.ims;

public class ReplenishmentOrder extends Order{
	public ReplenishmentOrder() {
		

	}
	
	public enum REPLENISHMENT_ORDER_STATUS {
		PROCESSING,
		DELIVERED,
		OUT_OF_STOCK
	}


}

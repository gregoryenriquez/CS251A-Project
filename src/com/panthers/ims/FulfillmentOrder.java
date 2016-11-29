package com.panthers.ims;

import com.panthers.utilities.Address;

public class FulfillmentOrder extends Order{
	private int customerId;
	private Address srcAddr;
	private Address destAddr;
	private static int highestId;
	
	public enum FULFILLMENT_ORDER_STATUS {
		ORDER_FULFILLED,
		PROCESSING
	}
	
	public FulfillmentOrder(Address srcAddr, Address destAddr) {
		customerId = highestId;
		highestId++;
		
	}
}

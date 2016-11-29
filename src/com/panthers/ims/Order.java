package com.panthers.ims;

public class Order {
	private int orderId;
	public static int highestId;
	
	public Order() {
		orderId = highestId;
		highestId++;
	}
	
	public int getOrderId() {
		return orderId;
	}
}

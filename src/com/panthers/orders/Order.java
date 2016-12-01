package com.panthers.orders;

import com.panthers.utilities.Date;
import com.panthers.utilities.Money;

public class Order {
	public enum ORDER_STATUS {
		ORDER_PROCESSING,
		ORDER_COMPLETE
	}
	
	private int orderId;
	private Date purchaseOrderDate;
	private Date transactionDate;
	private String customerId;
	private Money totalPrice;
	
	public Order(int id, Date pd, Date td, String cid, Money p) {
		orderId = id;
		purchaseOrderDate = pd;
		// TODO: transaction date generated when order received?
		transactionDate = td; 
		customerId = cid;
		totalPrice = p;
	}
	
	public int getOrderId() {
		return orderId;
	}
}

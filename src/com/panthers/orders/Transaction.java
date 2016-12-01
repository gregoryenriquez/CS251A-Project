package com.panthers.orders;

import com.panthers.utilities.Date;

public class Transaction {
	public static enum TRANSACTION_TYPE {
		PURCHASE,
		REPLENLISHMENT
	}
	
	private Order order;
	private String transactionId;
	private Date executedDate;
	private TRANSACTION_TYPE ttype;
	
	public Transaction(Order order, Date d) {
		if (order instanceof PurchaseOrder) {
			this.ttype = TRANSACTION_TYPE.PURCHASE;
		} else if (order instanceof ReplenishmentOrder) {
			this.ttype = TRANSACTION_TYPE.REPLENLISHMENT;
		}
		this.order = order;
		this.transactionId = Long.toString(System.currentTimeMillis());
		this.executedDate = d;
	}
	
	public Order getOrder() {
		return this.order;
	}
	
	public String getId() {
		return this.transactionId;
	}
	
	public Date getExecutedDate() {
		return this.executedDate;
	}
	
	public TRANSACTION_TYPE getTransactionType() {
		return this.ttype;
	}
}

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
}

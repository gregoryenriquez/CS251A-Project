package com.panthers.orders;

import java.util.ArrayList;

import com.panthers.services.InventoryManager;
import com.panthers.store.LineItem;
import com.panthers.utilities.Date;
import com.panthers.utilities.Money;

public abstract class Order {
	// Order and related order classes have no set functions as orders cannot be modified once created other than order status
	public enum ORDER_STATUS {
		ORDER_PROCESSING,
		ORDER_COMPLETE
	}
	
	private int orderId;
	private Date purchaseOrderDate;
	private Date transactionDate;
	private Money totalPrice;
	private ArrayList<LineItem> lineItems;
	private ORDER_STATUS orderStatus;
	
	public Order(int id, Date pd, Date td, Money p, ArrayList<LineItem> li) {
		this.orderId = id;
		this.purchaseOrderDate = pd;
		// TODO: transaction date generated when order received?
		this.transactionDate = td; 
		this.totalPrice = p;
		this.lineItems = li;
		this.totalPrice = new Money(0);
		this.orderStatus = ORDER_STATUS.ORDER_PROCESSING;
		
		for (int i = 0; i < lineItems.size(); i++) {
			this.totalPrice.add(lineItems.get(i).getProduct().getPrice());
		}
		
		
	}
	
	public int getOrderId() {
		return this.orderId;
	}
	
	public Date getPurchaseOrderDate() {
		return this.purchaseOrderDate;
	}
	
	public Date getTransactionDate() {
		return this.transactionDate;
	}
	
	public Money getTotalPrice() {
		return this.totalPrice;
	}
	
	public ArrayList<LineItem> getLineItems() {
		return this.lineItems;
	}
	
	public void setOrderComplete() {
		this.orderStatus = ORDER_STATUS.ORDER_COMPLETE;
	}
	
	public ORDER_STATUS getOrderStatus() {
		return this.orderStatus;
	}
}

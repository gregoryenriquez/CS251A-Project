package com.panthers.orders;

import java.util.ArrayList;

import com.panthers.services.InventoryManager;
import com.panthers.store.LineItem;
import com.panthers.utilities.Date;
import com.panthers.utilities.Money;

public abstract class Order {
	// Order and related order classes have no set functions as orders cannot be modified once created other than order status
	public enum OrderStatus {
		ORDER_PROCESSING,
		ORDER_COMPLETE
	}
	
	private int orderId;
	private Date purchaseOrderDate;
	private Date transactionDate;
	private Money totalPrice;
	private ArrayList<LineItem> lineItems;
	private OrderStatus orderStatus;
	
	public Order(int id, Date pd, Date td, Money p, ArrayList<LineItem> li) {
		this.orderId = id;
		this.purchaseOrderDate = pd;
		// TODO: transaction date generated when order received?
		this.transactionDate = td; 
		this.totalPrice = p;
		this.lineItems = li;
		this.totalPrice = new Money(0.0d);
		this.orderStatus = OrderStatus.ORDER_PROCESSING;
		
		for (int i = 0; i < lineItems.size(); i++) {
			this.totalPrice = new Money(this.totalPrice.getAmount() + lineItems.get(i).getProduct().getPrice().getAmount());
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
		this.orderStatus = OrderStatus.ORDER_COMPLETE;
	}
	
	public OrderStatus getOrderStatus() {
		return this.orderStatus;
	}

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.orderId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Order other = (Order) obj;
        if (this.orderId != other.orderId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Order{" + "orderId=" + orderId + ", purchaseOrderDate=" + purchaseOrderDate + ", transactionDate=" + transactionDate + ", totalPrice=" + totalPrice + ", lineItems=" + lineItems + ", orderStatus=" + orderStatus + '}';
    }
        
        
}

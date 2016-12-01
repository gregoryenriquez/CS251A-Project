package com.panthers.orders;

import com.panthers.utilities.Date;
import com.panthers.utilities.Quantity;

public class OrderPoint {
	private Quantity orderQuantity;
	private Date orderBy;
	private Quantity threshold;
	
	public OrderPoint(Quantity oq, Date d, Quantity thresh) {
		this.orderQuantity = oq;
		this.orderBy = d;
		this.threshold = thresh;
	}
	
	public void setThreshold(Quantity q) {
		this.threshold = q;
	}
	
	public void setOrderQuantity(Quantity q) {
		this.orderQuantity = q;
	}
	
	public Quantity getThreshold() {
		return this.threshold;
	}
	
	public Quantity getOrderQuantity() {
		return this.orderQuantity;
	}
}


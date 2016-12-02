package com.panthers.orders;

import com.panthers.utilities.Date;
import com.panthers.utilities.Quantity;
import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.orderQuantity);
        hash = 83 * hash + Objects.hashCode(this.orderBy);
        hash = 83 * hash + Objects.hashCode(this.threshold);
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
        final OrderPoint other = (OrderPoint) obj;
        if (!Objects.equals(this.orderQuantity, other.orderQuantity)) {
            return false;
        }
        if (!Objects.equals(this.orderBy, other.orderBy)) {
            return false;
        }
        if (!Objects.equals(this.threshold, other.threshold)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OrderPoint{" + "orderQuantity=" + orderQuantity + ", orderBy=" + orderBy + ", threshold=" + threshold + '}';
    }
}


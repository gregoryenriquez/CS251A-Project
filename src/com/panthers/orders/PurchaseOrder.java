package com.panthers.orders;

import java.util.ArrayList;

import com.panthers.store.LineItem;
import com.panthers.utilities.Date;
import com.panthers.utilities.Money;
import java.util.Objects;

public class PurchaseOrder extends Order {
    private String customerId;
	
    public PurchaseOrder(int id, Date pd, Date td, Money p,
			ArrayList<LineItem> li, String customerId) {
        super(id, pd, td, p, li);
        this.customerId = customerId;
    }
	
    public String getCustomerId() {
        return this.customerId;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 67 * hash + Objects.hashCode(this.customerId);
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
        final PurchaseOrder other = (PurchaseOrder) obj;
        if (!Objects.equals(this.customerId, other.customerId)) {
            return false;
        }
        if (!super.equals(obj)) return false;
        
        return true;
    }

    @Override
    public String toString() {
        return "PurchaseOrder{" + "customerId=" + customerId + '}';
    }
}

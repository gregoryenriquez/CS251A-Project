package com.panthers.orders;

import java.util.ArrayList;

import com.panthers.store.LineItem;
import com.panthers.utilities.Date;
import com.panthers.utilities.Money;
import com.panthers.utilities.Supplier;
import java.util.Objects;

public class ReplenishmentOrder extends Order {
    private Supplier supplier;

    public ReplenishmentOrder(int id, Date pd, Date td, Money p,
                            ArrayList<LineItem> li, Supplier supplier) {
        super(id, pd, td, p, li);
        this.supplier = supplier;
    }
	
    public Supplier getSupplier() {
        return this.supplier;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 47 * hash + Objects.hashCode(this.supplier);
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
        final ReplenishmentOrder other = (ReplenishmentOrder) obj;
        if (!Objects.equals(this.supplier, other.supplier)) {
            return false;
        }
        if (!super.equals(obj)) return false;
        
        return true;
    }

    @Override
    public String toString() {
        return "ReplenishmentOrder{" + "supplier=" + supplier + '}';
    }   
}

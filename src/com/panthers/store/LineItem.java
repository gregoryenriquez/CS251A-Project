package com.panthers.store;

import java.util.Objects;

import com.panthers.utilities.Quantity;

public class LineItem {
	private String storeId;
	private Product product;
	private Quantity quantity;

    public LineItem(String storeId, Product product) {
        this.storeId = storeId;
        this.product = product;
        this.quantity = new Quantity(0, Quantity.Unit.count);
    }
	
    public String getStoreId() {
        return this.storeId;
    }
	
    public Product getProduct() {
        return this.product;
    }
    
    public Quantity getQuantity() {
    	return this.quantity;
    }
    
    public void addQuantity(Quantity q) throws Exception {
    	this.quantity.add(q);
    }
    
    public void removeQuantity(Quantity q) throws Exception {
    	this.quantity.sub(q);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.storeId);
        hash = 79 * hash + Objects.hashCode(this.product);
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
        final LineItem other = (LineItem) obj;
        if (!Objects.equals(this.storeId, other.storeId)) {
            return false;
        }
        if (!Objects.equals(this.product, other.product)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LineItem{" + "storeId=" + storeId + ", product=" + product + '}';
    }
}

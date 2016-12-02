package com.panthers.store;

import com.panthers.services.InventoryManager;
import java.util.Objects;

public class LineItem {
	private String storeId;
	private Product product;

    public LineItem(String storeId, Product product) {
        this.storeId = storeId;
        this.product = product;
    }
	
    public String getStoreId() {
        return storeId;
    }
	
    public Product getProduct() {
        return product;
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

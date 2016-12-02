package com.panthers.store;

import com.panthers.utilities.Money;
import java.util.Objects;

public class Product {
	private Money unitPrice;
	private String UPC;
	private String description;
	
	public Product(String upc, String desc, Money m) {
		this.UPC = upc;
		this.description = desc;
		this.unitPrice = m;
	}
	
	public Money getPrice() {
		return unitPrice;
	}
	
	public void setPrice(Money m) {
		unitPrice = m;
	}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.UPC);
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
        final Product other = (Product) obj;
        if (!Objects.equals(this.UPC, other.UPC)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Product{" + "unitPrice=" + unitPrice + ", UPC=" + UPC + ", description=" + description + '}';
    }
}

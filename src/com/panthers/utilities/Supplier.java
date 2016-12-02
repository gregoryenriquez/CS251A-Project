package com.panthers.utilities;

import java.util.Objects;

public class Supplier {

    private String supplierID;
    private String supplierName;

    public Supplier(String supplierID, String supplierName) {
        this.supplierID = supplierID;
        this.supplierName = supplierName;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public String getSupplierName() {
        return supplierName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.supplierID);
        hash = 41 * hash + Objects.hashCode(this.supplierName);
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
        final Supplier other = (Supplier) obj;
        if (!Objects.equals(this.supplierID, other.supplierID)) {
            return false;
        }
        if (!Objects.equals(this.supplierName, other.supplierName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Supplier{" + "supplierID=" + supplierID + ", supplierName=" + supplierName + '}';
    }
}
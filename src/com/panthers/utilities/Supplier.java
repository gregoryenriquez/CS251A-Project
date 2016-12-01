package com.panthers.utilities;

public class Supplier {
	private String supplierId;
	private String supplierName;
	
	public Supplier(String id, String name) {
		this.supplierId = id;
		this.supplierName = name;
	}
	
	public String getSupplierId() {
		return this.supplierId;
	}
	
	public String getSupplierName() {
		return this.supplierName;
	}
}

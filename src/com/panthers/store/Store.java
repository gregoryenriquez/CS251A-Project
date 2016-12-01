package com.panthers.store;

import java.util.ArrayList;

import com.panthers.orders.OrderPoint;
import com.panthers.orders.Transaction;
import com.panthers.utilities.Quantity;
import com.panthers.utilities.Unit;

public class Store {
	private String storeId;
	private Quantity productQuantity;
	private Quantity reservedQuantity;
	private ArrayList<Transaction> records;
	private OrderPoint orderPoint;
	private Product product;
	
	public enum STORE_STATUS {
		LOW_STOCK,
		OUT_OF_STOCK,
		AVAILABLE
	}
	
	public Store(String id, Product p, OrderPoint op) {
		this.storeId = id;
		this.product = p;
		this.productQuantity = new Quantity(0, Unit.COUNT);
		this.reservedQuantity = new Quantity(0, Unit.COUNT);
		this.records = new ArrayList<Transaction>();
		this.orderPoint = op;
	}
	
	public String getId() {
		return this.storeId;
	}
	
	public void addProductQuantity(Quantity q) {
		this.productQuantity.add(q);
	}
	
	public void removeProductQuantity(Quantity q) {
		this.productQuantity.sub(q);
	}
	
	public Quantity getProductQuantity() {
		return this.productQuantity;
	}
	
	public void addReservedQuantity(Quantity q) {
		this.reservedQuantity.add(q);
	}
	
	public void removeReservedQuantity(Quantity q) {
		this.reservedQuantity.sub(q);
	}
	
	public Quantity getReservedQuantity() {
		return this.reservedQuantity;
	}
	
	public ArrayList<Transaction> getRecords() {
		return this.records;
	}
	
	public void addRecord(Transaction t) {
		this.records.add(t);
	}
	
	public OrderPoint getOrderPoint() {
		return this.orderPoint;
	}
	
	public void setOrderPoint(OrderPoint op) {
		this.orderPoint = op;
	}
	
	public Product getProduct() {
		return this.product;
	}
	
	public void setProduct(Product p) {
		this.product = p;
	}

	
}

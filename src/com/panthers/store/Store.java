package com.panthers.store;

import java.util.ArrayList;
import java.util.Objects;

import com.panthers.orders.OrderPoint;
import com.panthers.orders.Transaction;
import com.panthers.utilities.Quantity;

public class Store {
	private String storeId;
	private Quantity productQuantity;
	private Quantity reservedQuantity;
	private ArrayList<Transaction> records;
	private OrderPoint orderPoint;
	private Product product;
	private StoreStatus status;
	
	public enum StoreStatus {
		LOW_STOCK,
		OUT_OF_STOCK,
		AVAILABLE,
		ARCHIVED
	}
	
	public Store(String id, Product product, OrderPoint orderPoint) {
		this.storeId = id;
		this.product = product;
		this.productQuantity = new Quantity(0, null); 
		this.reservedQuantity = new Quantity(0, null); 
		this.records = new ArrayList<Transaction>();
		this.orderPoint = orderPoint;
		this.status = StoreStatus.AVAILABLE;
	}
	
	public void setStoreStatus(StoreStatus s) {
		this.status = s;
	}
	
	public String getId() {
		return this.storeId;
	}
	
	public void addProductQuantity(Quantity q) throws Exception {
		this.productQuantity.add(q);
	}
	
	public void removeProductQuantity(Quantity q) throws Exception {
		this.productQuantity.sub(q);
	}
	
	public Quantity getProductQuantity() {
		return this.productQuantity;
	}
	
	public void addReservedQuantity(Quantity q) throws Exception {
		this.reservedQuantity.add(q);
	}
	
	public void removeReservedQuantity(Quantity q) throws Exception {
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

    /**
     * @param q 
     * @return
     */
    private boolean addReservedProductQuantity(Quantity q) {
        // TODO implement here
        return false;
    }

    /**
     * @param q 
     * @return
     */
    private boolean removeReservedProductQuantity(Quantity q) {
        // TODO implement here
        return false;
    }


    public StoreStatus getStatus() {
        return status;
    }

    public void setStatus(StoreStatus status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.storeId);
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
        final Store other = (Store) obj;
        if (!Objects.equals(this.storeId, other.storeId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Store{" + "storeID=" + storeId + ", productQuantity=" + productQuantity + ", reservedQuantity=" + reservedQuantity + ", product=" + product + ", orderPoint=" + orderPoint + ", status=" + status + '}';
    }
}

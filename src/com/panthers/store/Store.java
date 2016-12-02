package com.panthers.store;

import com.panthers.orders.OrderPoint;
import com.panthers.orders.Transaction;
import java.util.Set;

import com.panthers.utilities.Quantity;
import java.util.Objects;

public class Store {
    /**
     * Default constructor
     */
    private String storeID;
    private Quantity[] productQuantity, reservedQuantity;
    private Product product;
    private Set<Transaction> statement;
    private OrderPoint orderPoint;
    private StoreStatus status;
    
    public Store(String storeID, Quantity[] productQuantity, Product product) {
        this.storeID = storeID;
        this.productQuantity = productQuantity;
        this.product = product;
    }

    /**
     * @param q 
     * @return
     */
    private boolean addProductQuantity(Quantity q) {
        // TODO implement here
        return false;
    }

    /**
     * @param q 
     * @return
     */
    private boolean removeProductQuantity(Quantity q) {
        // TODO implement here
        return false;
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

    /**
     * @param t 
     * @return
     */
    private boolean addRecord(Transaction t) {
        // TODO implement here
        return false;
    }

    private static class StoreStatus {

        public StoreStatus() {
        }
    }

    public Quantity[] getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Quantity[] productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Quantity[] getReservedQuantity() {
        return reservedQuantity;
    }

    public void setReservedQuantity(Quantity[] reservedQuantity) {
        this.reservedQuantity = reservedQuantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Set<Transaction> getStatement() {
        return statement;
    }

    public void setStatement(Set<Transaction> statement) {
        this.statement = statement;
    }

    public OrderPoint getOrderPoint() {
        return orderPoint;
    }

    public void setOrderPoint(OrderPoint orderPoint) {
        this.orderPoint = orderPoint;
    }

    public StoreStatus getStatus() {
        return status;
    }

    public void setStatus(StoreStatus status) {
        this.status = status;
    }

    public String getStoreID() {
        return storeID;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.storeID);
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
        if (!Objects.equals(this.storeID, other.storeID)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Store{" + "storeID=" + storeID + ", productQuantity=" + productQuantity + ", reservedQuantity=" + reservedQuantity + ", product=" + product + ", statement=" + statement + ", orderPoint=" + orderPoint + ", status=" + status + '}';
    }
}

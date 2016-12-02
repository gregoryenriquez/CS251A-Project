package com.panthers.orders;

import com.panthers.utilities.Date;
import java.io.Serializable;
import java.util.Objects;

public class Transaction implements Serializable {
	public static enum TRANSACTION_TYPE {
		PURCHASE,
		REPLENLISHMENT
	}
	
	private Order order;
	private String transactionId;
	private Date executedDate;
	private TRANSACTION_TYPE ttype;
	
	public Transaction(Order order, Date d) {
		if (order instanceof PurchaseOrder) {
			this.ttype = TRANSACTION_TYPE.PURCHASE;
		} else if (order instanceof ReplenishmentOrder) {
			this.ttype = TRANSACTION_TYPE.REPLENLISHMENT;
		}
		this.order = order;
		this.transactionId = Long.toString(System.currentTimeMillis());
		this.executedDate = d;
	}
	
	public Order getOrder() {
		return this.order;
	}
	
	public String getId() {
		return this.transactionId;
	}
	
	public Date getExecutedDate() {
		return this.executedDate;
	}
	
	public TRANSACTION_TYPE getTransactionType() {
		return this.ttype;
	}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.order);
        hash = 97 * hash + Objects.hashCode(this.transactionId);
        hash = 97 * hash + Objects.hashCode(this.executedDate);
        hash = 97 * hash + Objects.hashCode(this.ttype);
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
        final Transaction other = (Transaction) obj;
        if (!Objects.equals(this.transactionId, other.transactionId)) {
            return false;
        }
        if (!Objects.equals(this.order, other.order)) {
            return false;
        }
        if (!Objects.equals(this.executedDate, other.executedDate)) {
            return false;
        }
        if (this.ttype != other.ttype) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Transaction{" + "order=" + order + ", transactionId=" + transactionId + ", executedDate=" + executedDate + ", ttype=" + ttype + '}';
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthers.utilities;

import java.util.Objects;

/**
 *
 * @author wayne
 */

public class Money implements Comparable<Money> {

    public Money(double amount) {
        this.amount = amount;
    }

    private double amount;
    
    private void addDirectly(Money m1, Money m2)
    {
        m1.amount += m2.amount;
    }
    
    private void subDirectly(Money m1, Money m2)
    {
        m1.amount -= m2.amount;
    }
    
    private void mulDirectly(Money m1, Money m2)
    {
        m1.amount *= m2.amount;
    }
    
    private void divDirectly(Money m1, Money m2)
    {
        m1.amount /= m2.amount;
    }

    public void add(Money amt) {
        addDirectly(this, amt);
    }

    public void sub(Money amt) {
        subDirectly(this, amt);
    }

    public void mul(Money amt) {
        mulDirectly(this, amt);
    }

    public void div(Money amt) {
        divDirectly(this, amt);
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
        final Money other = (Money) obj;
        if (Double.doubleToLongBits(this.amount) != Double.doubleToLongBits(other.amount)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.amount) ^ (Double.doubleToLongBits(this.amount) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Money{" + "amount=" + amount + '}';
    }

    @Override
    public int compareTo(Money o) {
        if (this.amount < o.amount)
            return -1;
        
        if (this.amount > o.amount)
            return 1;
        
        return 0;
    }

    public double getAmount() {
        return amount;
    }
}

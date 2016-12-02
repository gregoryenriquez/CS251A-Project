/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthers.utilities;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Wei Chung Huang
 */

class Unit implements Serializable {
    
    public static Unit kilo = new Unit("kilo");
    public static Unit gram = new Unit("gram");
    public static Unit pound = new Unit("pound");
    public static Unit ounce = new Unit("ounce");
    public static Unit gallon = new Unit("gallon");
    public static Unit liter = new Unit("liter");
    public static Unit count = new Unit("count");

    private String name;
	
    public Unit(String name) {
	super();
	this.name = name;
    }

    @Override
    public String toString() {
	return "Unit [name=" + name + "]";
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Unit other = (Unit) obj;
	if (name == null) {
            if (other.name != null)
		return false;
	} 
        else if (!name.equals(other.name))
		return false;
	return true;
    }
}

enum Combiner {
    PER,
    BY,
    DASH
}

class CompositeUnit extends Unit {

    private Unit unit1;
    private Unit unit2;
    private Combiner composer;
    public CompositeUnit(Unit unit1, Combiner composer, Unit unit2) {
	super(unit1.toString() + " " + composer + " " + unit2.toString());
	this.unit1 = unit1;
	this.unit2 = unit2;
	this.composer = composer;
    }
    
    public Unit getUnit1() {
	return unit1;
    }
    public Unit getUnit2() {
	return unit2;
    }
    public Combiner getComposer() {
	return composer;
    }
}

public class Quantity implements Comparable<Quantity>, Serializable {

    private double amount;
    private Unit unit;
    
    public Quantity(double amount, Unit unit) {
	super();
	this.amount = amount;
	this.unit = unit;
    }

    public double getAmount() {
        return amount;
    }

    public Unit getUnit() {
        return unit;
    }

    public Quantity add(Quantity other) throws Exception {
	if(this.unit != other.unit) throw new Exception("incompatable units");
            return new Quantity(this.amount + other.amount, this.unit);
    }

    public Quantity sub(Quantity other) throws Exception {
	if(this.unit != other.unit) throw new Exception("incompatable units");
            return new Quantity(this.amount - other.amount, this.unit);
    }

    public Quantity mul(Quantity other) throws Exception {
	if(this.unit != other.unit) throw new Exception("incompatable units");
            return new Quantity(this.amount * other.amount, this.unit);
    }

    public Quantity div(Quantity other) throws Exception {
	if(this.unit != other.unit) throw new Exception("incompatable units");
            return new Quantity(this.amount / other.amount, this.unit);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.amount) ^ (Double.doubleToLongBits(this.amount) >>> 32));
        hash = 47 * hash + Objects.hashCode(this.unit);
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
        final Quantity other = (Quantity) obj;
        if (Double.doubleToLongBits(this.amount) != Double.doubleToLongBits(other.amount)) {
            return false;
        }
        if (!Objects.equals(this.unit, other.unit)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Quantity{" + "amount=" + amount + ", unit=" + unit + '}';
    }
    
    @Override
    public int compareTo(Quantity o) {
        if(this.unit == o.unit) return 0;
    	return Double.compare(this.amount, o.amount);
    }
}
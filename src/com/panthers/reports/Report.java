package com.panthers.reports;

import com.panthers.orders.Transaction;
import com.panthers.utilities.Quantity;
import java.util.*;

/**
 * @author Wei Chung Huang
 */
public abstract class Report {

    private Transaction transaction;
    private Quantity stockAvailability;
    private Date recordDate;   
}
package com.panthers.reports;

import com.panthers.orders.Transaction;
import com.panthers.utilities.Date;
import com.panthers.utilities.Money;

public class SalesRecorder implements Report {
	private static SalesRecorder instance = null;
	
	public static SalesRecorder getInstance() {
		if (instance == null) {
			instance = new SalesRecorder();
		}
		return instance;
	}
	
	@Override
	public void printReport() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveReportAsPDF() {
		// TODO Auto-generated method stub
		
	}

	public Money getAveragePrice(String UPC, Date start, Date end) {
		return null;
	}
	
	public Money getWarehouseValue() {
		return null;
	}
	
	public Transaction[] getSalesActivity(Date start, Date end) {
		return null;
	}
}

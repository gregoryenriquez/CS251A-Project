package com.panthers.reports;

import com.panthers.orders.Transaction;
import com.panthers.store.Store;

public class InventoryStatusRecorder implements Report {
	private static InventoryStatusRecorder instance = null;
	
	public static InventoryStatusRecorder getInstance() {
		if (instance == null) {
			instance = new InventoryStatusRecorder();
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
	
	private boolean searchInventory(String UPC) {
		return false;
	}
	
	public Transaction[] queryTransaction(Store store) {
		return null;
	}

}

package com.panthers.reports;

import com.panthers.orders.OrderPoint;
import com.panthers.orders.Transaction;
import com.panthers.services.InventoryManager;
import com.panthers.store.Store;
import com.panthers.utilities.Quantity;
import java.util.ArrayList;
import java.util.Arrays;

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
            // Deal with UI to display records
            
            //ArrayList<Store> stores = InventoryManager.getInstance().getStores();
            ArrayList<Store> stores = null;
            for (int i = 0; i < stores.size(); i++) {
                // String UPC = stores.get(i).getProduct().getUPC();
                String UPC = null;
                searchInventory(UPC);
            }
	}

	@Override
	public void saveReportAsPDF(String filePath) {
            // TODO Auto-generated method stub
            // Bascially, this area should generate PDF with layout of every records.
            // Then save file to given path
	}
	
	private boolean searchInventory(String UPC) {
            Store store = InventoryManager.getInstance().queryInventory(UPC);
            if (store == null)
                return false;
                        
            // Quantity productQuantity = store.getProductQuantity();
            // Quantity reservedQuanaity = store.getReservedQuantity();
            // Quantity quantityInHand = productQuantity - reservedQuanaity;
            // OrderPoint op = store.getOrderPoint();
            // StoreStatus productStatus = store.getStatus();
            
            return true;            
	}
	
	public ArrayList<Transaction> queryTransaction(Store store) {
            // Transaction[] trans = store.getStatements();
            Transaction[] trans = null;
            return new ArrayList<Transaction>(Arrays.asList(trans));
	}
}

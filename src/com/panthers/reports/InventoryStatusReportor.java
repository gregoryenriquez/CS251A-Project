package com.panthers.reports;

import com.panthers.orders.Transaction;
import com.panthers.store.Store;
import java.util.*;

/**
 * @author Wei Chung Huang
 */
public class InventoryStatusReportor extends Report implements IReport {

	private static InventoryStatusReportor instance = null;
	
	public static InventoryStatusReportor getInstance() {
		if (instance == null) {
			instance = new InventoryStatusReportor();
		}
		return instance;
	}

    /**
     * @param UPC 
     * @return
     */
    private String searchInventory(String UPC) {
        // TODO implement here
        return "";
    }

    /**
     * @param store Store 
     * @return
     */
    public Transaction queryTransaction(Store store) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<String> listAllUPCs() {
        // TODO implement here
        return null;
    }

    /**
     * @param UPC 
     * @return
     */
    public String listSupplierInfo(String UPC) {
        // TODO implement here
        return "";
    }

    /**
     * 
     */
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

    /**
     * @param filePath
     */
    @Override
    public void saveReportAsPDF(String filePath) {
            // TODO Auto-generated method stub
            // Bascially, this area should generate PDF with layout of every records.
            // Then save file to given path
    }

}
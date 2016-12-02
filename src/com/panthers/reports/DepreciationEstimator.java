package com.panthers.reports;

import com.panthers.orders.Transaction;
import com.panthers.services.InventoryManager;
import com.panthers.store.Store;
import com.panthers.utilities.Date;
import com.panthers.utilities.Money;
import java.util.ArrayList;
import java.util.Arrays;


public class DepreciationEstimator implements IReport {
	private static DepreciationEstimator instance = null;
	
	public static DepreciationEstimator getInstance() {
		if (instance == null) {
			instance = new DepreciationEstimator();
		}
		return instance;
	}
	
	
	@Override
	public void printReport() {
            // TODO Auto-generated method stub
            // Deal with UI to display records
		
	}

	@Override
	public void saveReportAsPDF(String filePath) {
            // TODO Auto-generated method stub
            // Bascially, this area should generate PDF with layout of every records.
            // Then save file to given path
		
	}
	
	public Money estimateRemainingValue(String UPC) {
            Store store = InventoryManager.getInstance().queryInventory(UPC);
            // float depreciationRatio = store.getDepreciationRatio();
            float depreciationRatio = 0.9f;
            // Money originalPrice = store.getProduct().getUnitPrice();
            Money originalPrice = new Money(100);
            double newPriceAmount = originalPrice.getAmount() * depreciationRatio;
            
            // Transaction[] allTrans = store.getStatements();
            Transaction[] allTrans = null;
            double totalNewAmount = 0;
            int totalBuyingCount = 0;
            ArrayList<Transaction> trans = new ArrayList<>(Arrays.asList(allTrans));
            for (int i = 0; i < trans.size(); i++) {
                Transaction t = trans.get(i);
                // if (t.getType == PURCHASE)
                //     continue;
                
                // Money buyingPrice = t.getOrder().getPrice();
                // Date buyingDate = t.getOrder().getPurchaseOrderDate();
                Money buyingPrice = null;
                Date buyingDate = null;
                Date currentDate = null;
                
                int durationInDays = Date.getDurationInDays(buyingDate, currentDate);
                int growingSteps = durationInDays % 30;
                Money currentPrice = new Money(buyingPrice.getAmount() * Math.pow(depreciationRatio, growingSteps));

                totalNewAmount += currentPrice.getAmount();
                totalBuyingCount++;
            }
            return new Money(totalNewAmount / totalBuyingCount);
	}	
}

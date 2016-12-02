package com.panthers.reports;

import com.panthers.orders.Transaction;
import com.panthers.utilities.Date;
import com.panthers.utilities.Quantity;
import java.util.List;

public class ForecastEstimator implements IReport {
	private static ForecastEstimator instance = null;
	
	public static ForecastEstimator getInstance() {
		if (instance == null) {
			instance = new ForecastEstimator();
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

	public Quantity predictStockAvailability(String UPC, Date date) {
            // Pull previous sales activity
            // Assume getting date from previous 1 year to have analysis
            
            Date analysisCurrentDate = null;
            Date analysisPreviousDate = null;
            List<Transaction> transFromDuration =
                    ValuationReportor.getInstance().getSalesActivity(analysisCurrentDate, analysisPreviousDate);
            // Do some analysis by using these transactions which include every selling prices and quantities
            // DataScienceAnalyzer(...);
            return null;
	}

}

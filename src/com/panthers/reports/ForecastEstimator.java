package com.panthers.reports;

import com.panthers.utilities.Date;
import com.panthers.utilities.Quantity;

public class ForecastEstimator implements Report {
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
		
	}

	@Override
	public void saveReportAsPDF() {
		// TODO Auto-generated method stub
		
	}

	public Quantity predictStockAvailability(String UPC, Date date) {
		return null;
	}

}

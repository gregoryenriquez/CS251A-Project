package com.panthers.reports;

import com.panthers.utilities.Money;


public class DepreciationEstimator implements Report {
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
		
	}

	@Override
	public void saveReportAsPDF(String filePath) {
		// TODO Auto-generated method stub
		
	}
	
	public Money estimateRemainingValue(String UPC) {
		return null;	
	}
	
}

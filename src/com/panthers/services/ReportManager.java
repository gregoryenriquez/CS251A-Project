package com.panthers.services;

import com.panthers.reports.DepreciationEstimator;
import com.panthers.reports.ForecastEstimator;
import com.panthers.reports.InventoryStatusRecorder;
import com.panthers.reports.SalesRecorder;

public class ReportManager {
	
	public static void generateInventoryStatusReport(String filePath) {
		InventoryStatusRecorder.getInstance().saveReportAsPDF(filePath);
	}
	
	public static void generateSalesReport(String filePath) {
		SalesRecorder.getInstance().saveReportAsPDF(filePath);
	}
	
	public static void generateValuationReport() {
		
	}
	
	public static void generateDepreciationReport(String filePath) {
		DepreciationEstimator.getInstance().saveReportAsPDF(filePath);
	}
	
	public static void generateForecastReport(String filePath) {
		ForecastEstimator.getInstance().saveReportAsPDF(filePath);
	}
	
	public static void generateValueReport(String filePath) {
		
	}
	
	public static void generateOverallReport(String filePath) {
		
	}
}

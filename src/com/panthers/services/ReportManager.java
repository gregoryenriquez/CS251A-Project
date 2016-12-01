package com.panthers.services;

import com.panthers.reports.DepreciationEstimator;
import com.panthers.reports.ForecastEstimator;
import com.panthers.reports.InventoryStatusRecorder;
import com.panthers.reports.SalesRecorder;

public class ReportManager {
	
	public static void generateInventoryStatusReport() {
		InventoryStatusRecorder.getInstance().saveReportAsPDF();
	}
	
	public static void generateSalesReport() {
		SalesRecorder.getInstance().saveReportAsPDF();
	}
	
	public static void generateValuationReport() {
		
	}
	
	public static void generateDepreciationReport() {
		DepreciationEstimator.getInstance().saveReportAsPDF();
	}
	
	public static void generateForecastReport() {
		ForecastEstimator.getInstance().saveReportAsPDF();
	}
	
	public static void generateValueReport() {
		
	}
	
	public static void generateOverallReport() {
		
	}
}

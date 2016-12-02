package com.panthers.reports;

/**
 * 
 */
public interface IReport {
    public void printReport();
    public void saveReportAsPDF(String filePath);
}
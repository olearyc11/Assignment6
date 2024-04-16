package com.coderscampus.Assignment06;

public class TeslaSalesApplication {

	public static void main(String[] args) {
		
		SalesReportService.generateSalesReport("Model 3", "model3.csv");
		SalesReportService.generateSalesReport("Model S", "modelS.csv");
		SalesReportService.generateSalesReport("Model X", "modelX.csv");
		
	}

}

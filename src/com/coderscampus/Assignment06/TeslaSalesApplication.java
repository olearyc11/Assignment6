package com.coderscampus.Assignment06;


import java.util.List;

public class TeslaSalesApplication {

	public static void main(String[] args) {
		
		List<Model> modelX = FileService.readFile("modelX.csv");
		List<Model> modelS = FileService.readFile("modelS.csv");
		List<Model> model3 = FileService.readFile("model3.csv");
		
		
		
		
		System.out.println("Model X Yearly Sales Report");
		System.out.println("-----------------------");
		System.out.println("2016 -> " + StreamService.findTotalYearlySales(modelX, "16"));
		System.out.println("2017 -> " + StreamService.findTotalYearlySales(modelX, "17"));
		System.out.println("2018 -> " + StreamService.findTotalYearlySales(modelX, "18"));
		System.out.println("2019 -> " + StreamService.findTotalYearlySales(modelX, "19") + "\n");
		System.out.println("The best month for Model X was: " + StreamService.findBestMonth(modelX));
		System.out.println("The worst month for Model X was: " + StreamService.findWorstMonth(modelX));
		
			  
		
		System.out.println("\n");
		System.out.println("Model S Yearly Sales Report");
		System.out.println("-----------------------");
		System.out.println("2016 -> " + StreamService.findTotalYearlySales(modelS, "16"));
		System.out.println("2017 -> " + StreamService.findTotalYearlySales(modelS, "17"));
		System.out.println("2018 -> " + StreamService.findTotalYearlySales(modelS, "18"));
		System.out.println("2019 -> " + StreamService.findTotalYearlySales(modelS, "19") + "\n");
		System.out.println("The best month for Model S was: " + StreamService.findBestMonth(modelS));
		System.out.println("The worst month for Model S was: " + StreamService.findWorstMonth(modelS));

		
		
		System.out.println("\n");		
		System.out.println("Model 3 Yearly Sales Report");
		System.out.println("-----------------------");
		System.out.println("2017 -> " + StreamService.findTotalYearlySales(model3, "17"));
		System.out.println("2018 -> " + StreamService.findTotalYearlySales(model3, "18"));
		System.out.println("2019 -> " + StreamService.findTotalYearlySales(model3, "19") + "\n");
		System.out.println("The best month for Model 3 was: " + StreamService.findBestMonth(model3));
		System.out.println("The worst month for Model 3 was: " + StreamService.findWorstMonth(model3));	  
		
		
		
	}
	
}

package com.coderscampus.Assignment06;

import java.util.List;
import java.util.stream.Collectors;

public class TeslaSalesApplication {

	public static void main(String[] args) {
		
		List<Model> modelX = FileService.readFile("modelX.csv");
		List<Model> modelS = FileService.readFile("modelS.csv");
		List<Model> model3 = FileService.readFile("model3.csv");
		
		
		
		
		System.out.println("Model X Yearly Sales Report");
		System.out.println("-----------------------");
		
		
		Integer modelX2016Sales = modelX.stream()
				 						.filter(date -> date.getDate().contains("16"))
				 						.collect(Collectors.summingInt(sales -> sales.getSales()));
		System.out.println("2016 -> " + modelX2016Sales);
		
		Integer modelX2017Sales = modelX.stream()
										.filter(date -> date.getDate().contains("17"))
										.collect(Collectors.summingInt(sales -> sales.getSales()));
		System.out.println("2017 -> " + modelX2017Sales);
		
		Integer modelX2018Sales = modelX.stream()
										.filter(date -> date.getDate().contains("18"))
										.collect(Collectors.summingInt(sales -> sales.getSales()));
		System.out.println("2018 -> " + modelX2018Sales);
		
		Integer modelX2019Sales = modelX.stream()
										.filter(date -> date.getDate().contains("19"))
										.collect(Collectors.summingInt(sales -> sales.getSales()));
		System.out.println("2019 -> " + modelX2019Sales);
		
			  
		

			  
		
		
		
	}
	
}

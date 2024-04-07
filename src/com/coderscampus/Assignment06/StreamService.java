package com.coderscampus.Assignment06;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamService {
	
	public static void findTotalYearlySales(List<Model> modelList, String teslaModel) {
		System.out.println(teslaModel +  " Yearly Sales Report");
		System.out.println("-----------------------");
		Map<Integer, Integer> salesByYear = modelList.stream()
													 .collect(Collectors.groupingBy(model -> model.getDate().getYear(), Collectors.summingInt(model -> model.getSales())));
			salesByYear.forEach((year, sales) -> {
				System.out.println(year + " -> " + sales);
			});
	}
		
	public static void findBestandWorstMonth(List<Model> modelList, String model) {
		modelList.stream()
				 .collect(Collectors.maxBy(Comparator.comparingInt(sales -> sales.getSales())))
				 .map(date -> date.getDate())
				 .ifPresent(bestMonth -> System.out.println("The best month for model " + model + " was: " + bestMonth));
			
											  
		modelList.stream()
				 .collect(Collectors.minBy(Comparator.comparingInt(sales -> sales.getSales())))
				 .map(date -> date.getDate())
				 .ifPresent(worstMonth -> System.out.println("The worst month for model " + model + " was: " + worstMonth));
			
	}
	
	
// 							OLD CODE	
	
//	public static Integer findTotalYearlySales(List<Model> modelList, String year) {
//		Integer yearlySales = modelList.stream()
//				 					   .filter(date -> date.getDate().contains(year))
//				 					   .collect(Collectors.summingInt(sales -> sales.getSales()));
//			return yearlySales;
//	}
//	
}

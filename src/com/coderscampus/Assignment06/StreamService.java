package com.coderscampus.Assignment06;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamService {
	

	public static Integer findTotalYearlySales(List<Model> modelList, String year) {
		Integer yearlySales = modelList.stream()
				 					   .filter(date -> date.getDate().contains(year))
				 					   .collect(Collectors.summingInt(sales -> sales.getSales()));
			return yearlySales;
	}
	
	public static void findBestandWorstMonth(List<Model> modelList, String model) {
		Optional<String> bestMonth = modelList.stream()
											  .collect(Collectors.maxBy(Comparator.comparingInt(sales -> sales.getSales())))
											  .map(date -> date.getDate());
			System.out.println("The best month for " + model + " was: " + bestMonth.get());
											  
		Optional<String> worstMonth = modelList.stream()
											   .collect(Collectors.minBy(Comparator.comparingInt(sales -> sales.getSales())))
											   .map(date -> date.getDate());
			System.out.println("The worst month for " + model + " was: " + worstMonth.get());
	}
	
}

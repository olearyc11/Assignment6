package com.coderscampus.Assignment06;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamService {
	
	public static String findBestMonth(List<Model> modelList) {
		Optional<String> bestMonth = modelList.stream()
				 							   .collect(Collectors.maxBy(Comparator.comparingInt(sales -> sales.getSales())))
				 							   .map(date -> date.getDate());
			return bestMonth.get();
	}

	
	public static String findWorstMonth(List<Model> modelList) {
		Optional<String> worstMonth = modelList.stream()
				 							  .collect(Collectors.minBy(Comparator.comparingInt(sales -> sales.getSales())))
				 							  .map(date -> date.getDate());
			return worstMonth.get();
	}
	
	
	public static Integer findTotalYearlySales(List<Model> modelList, String year) {
		Integer yearlySales = modelList.stream()
				 					   .filter(date -> date.getDate().contains(year))
				 					   .collect(Collectors.summingInt(sales -> sales.getSales()));
			return yearlySales;
	}
	
}

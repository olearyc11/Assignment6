package com.coderscampus.Assignment06;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SalesReportService {

	public static void generateSalesReport(String modelName, String modelFilePath) {
		List<Model> salesData = FileService.readFile(modelFilePath);
		findTotalYearlySales(salesData, modelName);
		findBestandWorstMonth(salesData, modelName);
		System.out.println("\n");

	}

	public static void findTotalYearlySales(List<Model> modelList, String modelName) {
		System.out.println(modelName + " Yearly Sales Report");
		System.out.println("-----------------------");
		Map<Integer, Integer> salesByYear = modelList.stream().collect(Collectors
				.groupingBy(model -> model.getDate().getYear(), Collectors.summingInt(model -> model.getSales())));
		salesByYear.forEach((year, sales) -> {
			System.out.println(year + " -> " + sales);
		});
	}

	public static void findBestandWorstMonth(List<Model> modelList, String modelName) {
		modelList.stream().collect(Collectors.maxBy(Comparator.comparingInt(sales -> sales.getSales())))
				.map(date -> date.getDate())
				.ifPresent(bestMonth -> System.out.println("The best month for model " + modelName + " was: " + bestMonth));

		modelList.stream().collect(Collectors.minBy(Comparator.comparingInt(sales -> sales.getSales())))
				.map(date -> date.getDate()).ifPresent(
						worstMonth -> System.out.println("The worst month for model " + modelName + " was: " + worstMonth));

	}

}

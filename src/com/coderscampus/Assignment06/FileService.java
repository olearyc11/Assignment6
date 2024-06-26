package com.coderscampus.Assignment06;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FileService {

	public static List<Model> readFile(String fileName) {
		List<Model> modelSales = new ArrayList<Model>();
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName));) {
			reader.readLine();
			String line;
			while ((line = reader.readLine()) != null) {
				String[] salesLine = line.split(",");
				YearMonth date = YearMonth.parse(salesLine[0], DateTimeFormatter.ofPattern("MMM-yy"));
				Integer sales = Integer.parseInt(salesLine[1]);
				modelSales.add(new Model(date, sales));
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found exception");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Input/Output exception");
			e.printStackTrace();
		}
		return modelSales;
	}
}

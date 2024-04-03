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
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName));){
			String line;
			reader.readLine();
			while((line = reader.readLine()) != null) {
				String[] salesLine = line.split(",");
				String date = convertDate(salesLine[0]);
				String sales = salesLine[1];
				modelSales.add(new Model(date, Integer.parseInt(sales)));
			}
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFound exception");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Input/Output exception");
			e.printStackTrace();
		}
		return modelSales;
	}
	
	
	
	public static String convertDate(String dateString) {
		YearMonth date = YearMonth.parse(dateString, DateTimeFormatter.ofPattern("MMM-yy"));
		return date.format(DateTimeFormatter.ofPattern("yyyy-MM"));
		
	}
	
}

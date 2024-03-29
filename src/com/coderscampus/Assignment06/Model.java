package com.coderscampus.Assignment06;

public class Model {

	String date;
	Integer sales;
	
	public Model(String date, Integer sales) {
		this.date = date;
		this.sales = sales;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getSales() {
		return sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}

	@Override
	public String toString() {
		return "Model [date=" + date + ", sales=" + sales + "]";
	}
	
	
	
	
}

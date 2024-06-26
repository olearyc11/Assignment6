package com.coderscampus.Assignment06;

import java.time.YearMonth;

public class Model {

	private YearMonth date;
	private Integer sales;

	public Model(YearMonth date, Integer sales) {
		this.date = date;
		this.sales = sales;
	}

	public YearMonth getDate() {
		return date;
	}

	public void setDate(YearMonth date) {
		this.date = date;
	}

	public Integer getSales() {
		return sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}
}

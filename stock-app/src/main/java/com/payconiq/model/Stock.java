package com.payconiq.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Stock {

	int id;
	String name;
	double currentPrice;
	String lastUpdate;
	
	public Stock() {
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		this.lastUpdate = dateFormat.format(date);
		
	}
	
	public Stock(int id, String name, double currentPrice) {
		super();
		this.id = id;
		this.name = name;
		this.currentPrice = currentPrice;
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		this.lastUpdate = dateFormat.format(date);
		
		
				
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public int getId() {
		return id;
	}

	public String getLastUpdate() {
		return lastUpdate;
	}

	public String getName() {
		return name;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

package com.payconiq.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.payconiq.model.Stock;



public class StockStub {
	
	private static Map<Integer, Stock> stocks = new HashMap<Integer, Stock>();
	
	private static int idIndex = 3;
	
	static {
		
		Stock a = new Stock(1, "Citigroup Inc.", 76.11);
		stocks.put(1, a);
		Stock b = new Stock(2, "Google Inc.", 179.18);
		stocks.put(2, b);
		Stock c = new Stock(3, "Microsoft Corporation.", 32.72);
		stocks.put(3, c);
		Stock d = new Stock(4, "GoldMan Sachs & Co.", 99.79);
		stocks.put(4, d);
	}
	
	public static List<Stock> list(){
		
		return new ArrayList<Stock>(stocks.values());
		
	}
	
	public static Stock create(Stock stock) {
		//idIndex  idIndex;
	//	stock.setId(idIndex);
		stocks.put(stock.getId(), stock);
		return stock;
		
	}
	
	public static Stock get(int id) {
		
		return stocks.get(id);
	}
	
	public static Stock updatePrice(int id, double price){

		Stock currStock = stocks.get(id);
		currStock.setCurrentPrice(price);
		stocks.put(id, currStock);
		return currStock;
	}

}

package com.payconiq.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.payconiq.model.Stock;
import com.payconiq.repository.StockStub;



@RestController
@RequestMapping("api/")
public class StockController {
	
	@RequestMapping(value ="stocks", method = RequestMethod.GET)
	public List<Stock> list(){
		return StockStub.list();
	}
	
	@RequestMapping(value="stocks", method = RequestMethod.POST)
	public Stock create(@RequestBody Stock stock) {
		return StockStub.create(stock);
	}
	
	@RequestMapping(value="stocks/{id}", method = RequestMethod.GET)
	public Stock getStock(@PathVariable int id) {
		return StockStub.get(id);
	}
	
	@RequestMapping(value="stocks/{id}", method = RequestMethod.PUT)
	public Stock updateStock(@PathVariable int id, @RequestBody Stock newStock ) {
		return StockStub.updatePrice(id, newStock.getCurrentPrice());
	}
}

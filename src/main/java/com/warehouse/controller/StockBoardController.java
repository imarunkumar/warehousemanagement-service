package com.warehouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.warehouse.model.StockBoard;
import com.warehouse.service.StockBoardService;

/**
 * @author arun
 * StockBoard controller class 
 *
 */
@RestController
@RequestMapping("/stock")
public class StockBoardController {
	
	@Autowired
	private StockBoardService stockBoardServ;
	/*
	 * List of Stock can be added
	 * 
	 * */
	@PostMapping("/add")
    public ResponseEntity<List<StockBoard>> addExpense(@RequestBody List<StockBoard> stockBoad) {
		stockBoardServ.addStock(stockBoad);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
	/*
	 * List of Stock will be updated
	 * 
	 * */
	@PostMapping("/update")
    public ResponseEntity<StockBoard> addExpense(@RequestBody StockBoard stockBoad) {
		stockBoardServ.updateStock(stockBoad);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
	
	/*
	 * fetching entire stocks from the DB
	 * 
	 * */
	
	@GetMapping("/get")
	public List<StockBoard> getAllStock(){
		return stockBoardServ.getAllStock();
	}
	
	/*
	 * Delete a stock from the DB
	 * 
	 * */
	@DeleteMapping("/delete/{stockID}")
	public String deleteStock(@PathVariable String stockID)
	{
		System.out.println(">>>>>>>>>>>>>>"+stockID);
		 stockBoardServ.deleteStock(stockID);
		return "Stock Deleted";
	}
}

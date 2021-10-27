package com.warehouse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warehouse.model.StockBoard;
import com.warehouse.repository.StockBoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StockBoardService {
	 @Autowired
	 StockBoardRepository stockBoardRepo;
	
	public void addStock(List<StockBoard> stock) {
		for (StockBoard stockBoard : stock) {
			stockBoardRepo.save(stockBoard);
		}
	}
	
	public List<StockBoard> getAllStock() {
		return stockBoardRepo.findAll();
	}
	
	public void deleteStock(String stockID) {
		stockBoardRepo.deleteById(stockID);
	}
	
	public void updateStock(StockBoard stockBoard) {
			stockBoardRepo.save(stockBoard);
	
	}

}

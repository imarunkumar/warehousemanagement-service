package com.warehouse.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.warehouse.model.StockBoard;

public interface StockBoardRepository extends MongoRepository<StockBoard, String> {

	@Query("{'stockName': ?0}")
    Optional<StockBoard> findByName(String stockName);
}

package com.warehouse.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="StockBoard")
public class StockBoard {
	 	
	    private String id;
	 	
	    public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getStockName() {
			return stockName;
		}
		public void setStockName(String stockName) {
			this.stockName = stockName;
		}
		public String getStockId() {
			return stockId;
		}
		
		public void setStockId(String stockId) {
			this.stockId = stockId;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public int getAmount() {
			return amount;
		}
		public void setAmount(int amount) {
			this.amount = amount;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		
		private String stockName;
		@Id
		private String stockId;
	    private String location;
	    private int amount;
	    private float price;

		
}

package com.warehouse.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="StockBoard")
public class StockBoard {
	 	
		@Id
		private String stockId;
		
	    private String id;
	    private String stockName;
	    private String location;
	    private int avaliable;
	    private int booked;
	    private float price;
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
		public int getAvaliable() {
			return avaliable;
		}
		public void setAvaliable(int avaliable) {
			this.avaliable = avaliable;
		}
		public int getBooked() {
			return booked;
		}
		public void setBooked(int booked) {
			this.booked = booked;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		
		

		
}

package com.mock;

public class StockMarketImpl implements IStockMarket {
   Portfolio pt;
	@Override
	public Double getPrice(String stockName) {
		double price=0;
		switch(stockName){
		case "TV":
			price=100.0;
			break;
			
		case "Laptop":
			price=500.0;
			break;
			
		case "CellPhone":
			price=300.0;
			break;
			
			default:
				System.out.println("There is no specified Stock Name");
		}
		
		return price;
	}

}

package com.mock;

import java.util.ArrayList;
import java.util.List;

import org.easymock.EasyMock;

// this is where the business logic exists
public class Portfolio {

	private String name;
	private IStockMarket stockMarket;

	private List<Stock> stocks = new ArrayList<Stock>();

	/*
	 * 
	 * this method gets the market value for each stock, sums it up and returns
	 * 
	 * the total value of the portfolio.
	 * 
	 */
	
	public Portfolio(){
		stockMarket=new StockMarketImpl();
	}

	public Double getTotalValue() {

		Double value = 0.0;
		//stockMarket = EasyMock.createMock(IStockMarket.class);
		//stockMarket=new StockMarketImpl();
		for (Stock stock : this.stocks) {
              if(stockMarket==null) throw new RuntimeException(" There is No Implemenation for IStockMarket");
			 value += (stockMarket.getPrice(stock.getName()) * stock.getQuantity());
			 
			 System.out.println("-- Name: "+stock.getName()
			 +" Quantity: "+stock.getQuantity()
			 +" Price:"+stockMarket.getPrice(stock.getName())
			 +" Total Price:"+stock.getQuantity()*stockMarket.getPrice(stock.getName()));

		}

		return value;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public List<Stock> getStocks() {

		return stocks;

	}

	public void setStocks(List<Stock> stocks) {

		this.stocks = stocks;

	}

	public void addStock(Stock stock) {

		stocks.add(stock);

	}

	public IStockMarket getStockMarket() {

		return stockMarket;

	}

	public void setStockMarket(IStockMarket stockMarket) {

		this.stockMarket = stockMarket;

	}

}
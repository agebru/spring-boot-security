package com.mock;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//creating a list of stocks
		List<Stock>stocks=new ArrayList<>();
		Stock stock1=new Stock("Laptop",4);
		Stock stock2=new Stock("TV",1);
		Stock stock3=new Stock("CellPhone",2);
		Stock stock4=new Stock("CellPhone",3);
		   stocks.add(stock1);
		   stocks.add(stock2);
		   stocks.add(stock3);
		    stocks.add(stock4);
		
		Portfolio p=new Portfolio();
		  p.setStocks(stocks);
		
		Double value=p.getTotalValue();
		
		
		//displaying the value of stocks
		System.out.println("\nGrand Total Stock Price:"+value);

	}

}

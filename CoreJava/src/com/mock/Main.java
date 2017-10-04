package com.mock;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Stock>stocks=new ArrayList<>();
		Stock stock1=new Stock("Laptop",4);
		Stock stock2=new Stock("TV",1);
		Stock stock3=new Stock("CellPhone",2);
		   stocks.add(stock1);
		   stocks.add(stock2);
		   stocks.add(stock3);
		
		
		
		
		Portfolio p=new Portfolio();
		  p.setStocks(stocks);
		
		Double value=p.getTotalValue();
		
		System.out.println("Grand Total Stock Price:"+value);

	}

}

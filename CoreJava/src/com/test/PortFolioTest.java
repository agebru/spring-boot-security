package com.test;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import com.mock.Portfolio;
import com.mock.Stock;
import com.mock.IStockMarket;
import static org.junit.Assert.assertEquals;

public class PortFolioTest {
	private Portfolio portfolio;
	private IStockMarket marketMock;

	
	@Before
	public void setUp() {

	portfolio = new Portfolio();
	 portfolio.setName("my Portfolio");

	marketMock = EasyMock.createMock(IStockMarket.class);
	
	//setting the implementation in the portifolio class with the mocked object
	portfolio.setStockMarket(marketMock);

	}

	@Test
 public void testGetTotalValue() {

	EasyMock.expect(marketMock.getPrice("EBAY")).andReturn(42.00);
	EasyMock.replay(marketMock);
	Stock ebayStock = new Stock("EBAY", 2);

	portfolio.addStock(ebayStock);

	assertEquals(84.00, portfolio.getTotalValue(),0);

	}
}

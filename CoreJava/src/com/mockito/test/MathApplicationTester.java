package com.mockito.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {

	private MathApplication mathApplication;
	private CalculatorService calcService;

	@Before
	public void setUp() {
		mathApplication = new MathApplication();
		calcService = mock(CalculatorService.class);
		mathApplication.setCalculatorService(calcService);
	}
	
	
	@Test
	public void testaddAndDouble(){
		when(calcService.add(30.0, 10.0)).thenReturn(40.0);
		assertEquals(mathApplication.addAndDouble(30.0, 10.0),80.0,0);
	}
	
	@Test
	public void testsubstractAndAdd1(){
		when(calcService.subtract(20.0, 10.0)).thenReturn(10.0);
		assertEquals(mathApplication.substractAndAdd1(20, 10),11,0);
	}
	
	@Test
	public void testmultiplyAndAdd10(){
		when(calcService.multiply(10.0, 20.0)).thenReturn(200.0);
		assertEquals(mathApplication.multiplyAndAdd10(10, 20),210.0,0);
		
	}
	
}

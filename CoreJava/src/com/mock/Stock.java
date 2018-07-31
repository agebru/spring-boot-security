package com.mock;

public class Stock {
	private String name;
	private int quantity;

	
	public Stock (){
		
	}
	public Stock(String name, int quantity) {

		this.name = name;
		this.quantity = quantity;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {

		this.name = name;

	}

	public int getQuantity() {

		return quantity;

	}

	public void setQuantity(int quantity) {

		this.quantity = quantity;

	}
	
	
	//adding toString method
	@Override
	public String toString() {
		return "Stock [name=" + name + ", quantity=" + quantity + "]";
	}
	
	public void display_stock_in_feature(){
		String stk=toString();
	}
	
	

}
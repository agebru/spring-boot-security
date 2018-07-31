package com.corejava;

public class DigitCounter {

	public static void main(String[] args) {
		int number=882456;
		int counter=0;
		//System.out.println("===> "+counter);
	
		while(number>0){
			number=number/10;
			counter++;
			
		}
System.out.println("===> "+counter);
	}

}

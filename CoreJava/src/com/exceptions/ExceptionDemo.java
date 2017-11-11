package com.exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionDemo {

	public static void main(String[] args) {
		try{
		printFileJava7();
		}
		catch(Exception ex){
			ex.printStackTrace();
			
		}

	}
		
	private static void printFileJava7() throws IOException {

	    try(FileInputStream input = new FileInputStream("file1.txt")) {

	        int data = input.read();
	        while(data != -1){
	            System.out.print((char) data);
	            data = input.read();
	        }
	    }
	}

}

package com.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionAndInheritance {

	public static void main(String[] args)throws IOException {
		

		
		System.out.println("The contents of the external data is: ");
		Parent p=new Parent();
		 p.display();
		 
		 
		 Child c=new Child();
		 c.display();
	}

}

class Parent{
	
	public void display() throws IOException{
		try(FileInputStream input=new FileInputStream(new File("file1.txt"))){
			int data=input.read();
			while(data!=-1){
				System.out.print((char)data);
				data=input.read();
			}
			
		}
	}
	
	protected void hello(){
		System.out.println("Hello");
	}
}





class Child extends Parent{
	
	// this Overriden method can throw any RuntimeException and any
	// other sub exceptions of the parent class method
	//But not Broader Exceptions than the parent class exceptions
	// If we add ',Exception' to the list of throw below --> it will cause and error
	
	@Override
	public void display() throws RuntimeException,IOException,FileNotFoundException{
		System.out.println("Overiding the parent method");
	}
	
	@Override
	public void hello(){
		System.out.println("Hello");
	}
}
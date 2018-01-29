package com.read.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReader {

	public static void main(String[] args) throws IOException {
		
		read_file("emails.txt");

	}
	public static void read_file(String email) throws IOException{
		try(FileInputStream input=new FileInputStream(new File(email))){
			int data=input.read();
			int emailCount=0;
			while(data!=-1){
				System.out.print((char)data);
				data=input.read();
				//emailCount++;
			}
			
			//System.out.println("\nEmails Found: "+emailCount);
			
		}
	}
}





abstract class A{
	abstract void overload();
}
abstract class B extends A{
	abstract void overload();
}

package multhitreading;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public final class Test {

	public static void main(String[] args) throws IllegalAgeException{
		// Either I need to use Throws in the main() or 
		// Either I need to use try catch statement in the caller
		
		Map<String, Integer> items1=new HashMap<String,Integer>();
		Map<String, Integer> items2=new Hashtable<String,Integer>();
		
		
		System.out.println("Inter your age: ");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		//int age=-10;
		//try
		//{
		if(age<0)throw new IllegalAgeException("Age cant be -ve integer");
		
		else{
			  System.out.println("You are Old enough to take this lesson!");
		  }
		//} 
				/*catch (IllegalAgeException e) {
						
						e.printStackTrace();
					}*/
		}

}

class IllegalAgeException extends Exception     // if this is RuntimeException, no try catch in main
{
	private static final long serialVersionUID = 1L;

	// private static String message;
	IllegalAgeException(String message) {
		super(message);

	}
}
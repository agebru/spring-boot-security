package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
//import static java.lang.System.out;

public class CollectionsDemo {

	public static void main(String[] args) {
		List<Integer> values=Arrays.asList(1,2,3,4,5,6,8,12);
		//print all the elements of the collection
		
		//values.forEach(System.out::println);
		//print the sum of all the collection elements
		int sum=values.stream().reduce(0, (x,y)->x+y);
		System.out.println("Sum of Numbers:"+sum);
		
		// print the first even element greater than 3 and square it
		int num=values.stream().filter(x->x%2==0)
		               .filter(x->x>3)
		               .map(x->x*x)
		               .findFirst()
		               .orElse(0);
		
		System.out.println("The first Even element greater than three ==> "+Math.sqrt(num));		
		
		// find the summ of all even integers less than 10
	int sumEven=values.stream().filter(x->x%2==0)
                       .filter(x->x<10)
                       .reduce(0,(x,y)->x+y);
	System.out.println("Sum of Even integers less than 10 ==> "+sumEven);
	
		// print the product of all odd integers less than 8
	
	int product=values.stream().filter(x->x%2!=0)
            .filter(x->x<8)
            .reduce(1,(x,y)->x*y);
	System.out.println("Product of Odd integers less than 8 ==> "+product);
	
		//print the number of even numbers and odd numbers
	long countEven=values.stream().filter(x->x%2==0).count();
	System.out.println("Number of even ==> "+countEven);

	}

}

package Exam;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello there");
		
		double result=divide(10,0);
		System.out.println("The Result:"+result);

	}
	
	public static double divide(int a,int b) throws ArithmeticException{
		return a/b;
	}

}

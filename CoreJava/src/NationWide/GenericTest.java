package NationWide;

public class GenericTest {

	public static void main(String[] args) {
		Employee e1=new Employee("Amanuel","Kahsay",28);
		Product p1=new Product("101","Laptop",340.30);
		
		
		GenericType<Employee> gt=new GenericType<>();
		
		gt.setAuthor("Mark");
		gt.setT(new Employee("Berhe","Hagos",40));
		
		System.out.println("==> "+gt.getT());
		
		
		

	}

}

package Exam;

public class IkmTest {
	private static int count_instances = 0;
	private int x;

	static {
		System.out.println("In block 1");
		count_instances++;
	}

	{
		System.out.println("I am called every time an object is created");
	}

	private int[] mydata;
	{
		System.out.println("In Block 2");
		mydata = new int[count_instances];
		for (int k = 0; k < count_instances; k++) {
			mydata[k] = k;
			// System.out.print(data[i]+",");
		}
		
	}

	/*
	 * { System.out.println("In block 2"); data = new int[count]; for (int i =
	 * 0; i < count; i++) { data[i] = i; } }
	 */
	public static void main(String[] args) {
		System.out.println("\n Shows on how to initialize instance variables\n");
		System.out.println("Count = " + count_instances);// System.out.println("Count
															// = " + count);
	

		IkmTest test1 = new IkmTest();
		// System.out.println("Executed after Block 2");
		IkmTest test2 = new IkmTest();

		/*
		 * IkmTest test1 = new IkmTest(); System.out.println(
		 * "Before 2nd call to new"); IkmTest test2 = new IkmTest();
		 */
	}
}
package NationWide;

public class Employee {
	private String fname;
	private String lname;
	private int age;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Employee(String fname, String lname, int age) {
	
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", lname=" + lname + ", age=" + age + "]";
	}
	
	
	
	

}

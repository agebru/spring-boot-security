package emanuel.main.dao;

import java.util.ArrayList;
import java.util.List;

import emanuel.main.domain.Address;
import emanuel.main.domain.Company;
import emanuel.main.domain.Employee;

public class EmployeeRepository {
	private static List<Employee> employees=new ArrayList<>();
	
	static{
		Employee emp1=new Employee();
		 emp1.setEmpId(101);
		 emp1.setFirstName("Amanuel");
		 emp1.setLastName("Gebru");
		 emp1.setCompany(loadCompany());
			
		
		
		Employee emp2=new Employee();
		emp2.setEmpId(102);
		 emp2.setFirstName("Berihu");
		 emp2.setLastName("Zeru");
		 emp2.setCompany(loadCompany3());
		 
		 
		Employee emp3=new Employee();
		 emp3.setEmpId(103);
		 emp3.setFirstName("Kahsu");
		 emp3.setLastName("Belay");
		 emp3.setCompany(loadCompany2());
		 
		 
		 Employee emp4=new Employee();
		 emp4.setEmpId(104);
		 emp4.setFirstName("Betty");
		 emp4.setLastName("Hagos");
		 emp4.setCompany(loadCompany2());
		 
		 Employee emp5=new Employee();
		 emp5.setEmpId(105);
		 emp5.setFirstName("Selam");
		 emp5.setLastName("Hadgu");
		 emp5.setCompany(loadCompany2());
		 
		 
		 
		 employees.add(emp1);	 
		 employees.add(emp2);	 
		 employees.add(emp3);
		 employees.add(emp4);
		 employees.add(emp5);
	}
	
	
	
	
	public static List<Employee> loadEmployees(){
		return employees;
	}




	private static Company loadCompany() {
		Company comp=new Company();
		comp.setCompanyId("chM");
		comp.setCompanyName("Chase bank");
		List<Address> addresses=new ArrayList<>();
		Address adress1=new Address();
		adress1.setCity("Comlumbus");
		adress1.setStreet("Santa barbara");
		adress1.setZipCode(43213);
		
		addresses.add(adress1);
		comp.setAddresses(addresses);
		//comp.setEmployees(employees);
		return comp;
	}
	
	
	
	private static Company loadCompany2() {
		Company comp=new Company();
		comp.setCompanyId("att");
		comp.setCompanyName("AT & T");
		List<Address> addresses=new ArrayList<>();
		Address adress1=new Address();
		adress1.setCity("Comlumbus");
		adress1.setStreet("James Road");
		adress1.setZipCode(45321);
		
		addresses.add(adress1);
		comp.setAddresses(addresses);
		//comp.setEmployees(employees);
		return comp;
	}
	
	private static Company loadCompany3() {
		Company comp=new Company();
		comp.setCompanyId("Cbe");
		comp.setCompanyName("Commercial Bank of Ethiopia");
		List<Address> addresses=new ArrayList<>();
		Address adress1=new Address();
		adress1.setCity("Addis Ababa");
		adress1.setStreet("mexico st");
		adress1.setZipCode(595);
		
		Address adress2=new Address();
		adress2.setCity("Mekelle");
		adress2.setStreet("Hawelti st");
		adress2.setZipCode(20189);
		
		addresses.add(adress1);
		addresses.add(adress2);
		comp.setAddresses(addresses);
		//comp.setEmployees(employees);
		return comp;
	}

}

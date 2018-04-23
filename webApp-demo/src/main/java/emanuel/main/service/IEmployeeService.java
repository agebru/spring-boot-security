package emanuel.main.service;

import java.util.List;

import emanuel.main.domain.Employee;
import emanuel.main.domain.EmployeeNotFoundException;

public interface IEmployeeService {
	List<Employee> findAll();
	Employee findOne(int empId)throws EmployeeNotFoundException;
	List<Employee> findByCompany(String companyId);
	
	void deleteEmployee(int empId);
	void save(Employee employee);
	
	

}

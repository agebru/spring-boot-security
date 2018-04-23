package emanuel.main.dao;

import java.util.List;

import emanuel.main.domain.Employee;
import emanuel.main.domain.EmployeeNotFoundException;

public interface IEmployeeDao {
	List<Employee> findAll();
	Employee findOne(int empId) throws EmployeeNotFoundException;
	List<Employee> findByCompany(String companyId);
	
	void deleteEmployee(int empId);
	void save(Employee employee);
}

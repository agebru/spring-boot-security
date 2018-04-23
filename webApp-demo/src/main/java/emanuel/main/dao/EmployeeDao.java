package emanuel.main.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import emanuel.main.domain.Employee;
import emanuel.main.domain.EmployeeNotFoundException;

@Repository
public class EmployeeDao implements IEmployeeDao {

	@Override
	public List<Employee> findAll() {
		return EmployeeRepository.loadEmployees();
	}

	@Override
	public Employee findOne(int empId) throws EmployeeNotFoundException {
		List<Employee> employees=EmployeeRepository.loadEmployees();
		Employee emp=null;
		for(Employee e:employees){
			if(e.getEmpId()==empId){
				emp=e;
				break;
			}
		}
		if(emp==null)throw new EmployeeNotFoundException("Employee with id "+empId+" not found");
		return emp;
	}

	@Override
	public List<Employee> findByCompany(String companyId) {		
		return EmployeeRepository.loadEmployees().stream().filter(e->e.getCompany()
				.getCompanyId().equalsIgnoreCase(companyId)).collect(Collectors.toList());
	}

	@Override
	public void deleteEmployee(int empId) {
		List<Employee> employees = EmployeeRepository.loadEmployees();		
		boolean rmif = employees.removeIf(e->e.getEmpId()==empId);
		if(rmif==false){
			System.out.println("No such Employee found");
		}
		else
			System.out.println("EMployee with id "+empId+" deleted. ");
	}

	@Override
	public void save(Employee employee) {
		List<Employee> employees = EmployeeRepository.loadEmployees();
		employees.add(employee);
	}

}

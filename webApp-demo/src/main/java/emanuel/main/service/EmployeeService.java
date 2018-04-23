package emanuel.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import emanuel.main.dao.IEmployeeDao;
import emanuel.main.domain.Employee;
import emanuel.main.domain.EmployeeNotFoundException;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	private IEmployeeDao EmployeeDao;
	
	@Override
	public List<Employee> findAll() {
		return EmployeeDao.findAll();
	}

	@Override
	public Employee findOne(int empId) throws EmployeeNotFoundException {
		return EmployeeDao.findOne(empId);
	}

	@Override
	public List<Employee> findByCompany(String companyId) {
		return EmployeeDao.findByCompany(companyId);
	}

	@Override
	public void deleteEmployee(int empId) {
		EmployeeDao.deleteEmployee(empId);
		
	}

	@Override
	@PreAuthorize("'ROLE_ADMIN'")
	public void save(Employee employee) {
		EmployeeDao.save(employee);
		
	}

}

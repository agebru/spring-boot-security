package emanuel.main.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import emanuel.main.domain.Company;
import emanuel.main.domain.Employee;
import emanuel.main.domain.EmployeeNotFoundException;
import emanuel.main.service.IEmployeeService;
import emanuel.main.service.RecordMapper;

@RestController
public class EmployeeController {
	
	@Autowired
	private IEmployeeService EmployeeService;
	
		
	@GetMapping("/")
	public String home(){
		return "------- Home -----";
	}
	
	/*@GetMapping(value="/employees")
	public List<Employee> findAll(){
		return EmployeeService.findAll();
	}*/
	
	
	@GetMapping(value="/employees")
	public RecordMapper findAll(){
	    RecordMapper mapper=new RecordMapper();
		mapper.setRecords(EmployeeService.findAll());
		mapper.setNumRecords(EmployeeService.findAll().size());
		return mapper;
	}
	
	/*@GetMapping(value="/employees/{empId}")
	public Employee findById(@PathVariable("empId") int id) throws EmployeeNotFoundException{
		return EmployeeService.findOne(id);
	}*/
	
	@GetMapping(value="/employees/{empId}")
	public RecordMapper findById(@PathVariable("empId") int id) throws EmployeeNotFoundException{
		RecordMapper mapper=new RecordMapper();
		mapper.setRecords(Arrays.asList(EmployeeService.findOne(id)));
		mapper.setNumRecords((Arrays.asList(EmployeeService.findOne(id)).size()));
		return mapper;
	}
	
	
	@GetMapping(value="/employees/company/{companyId}")
	public RecordMapper  findByCompany(@PathVariable("companyId") String companyId ){
		RecordMapper mapper=new RecordMapper();
		
		Company comp=new Company();
		for(Employee e:EmployeeService.findByCompany(companyId)){
			 comp=e.getCompany();
		}
		
		mapper.setRecords(EmployeeService.findByCompany(companyId));
		mapper.setNumRecords(EmployeeService.findByCompany(companyId).size());
		mapper.setMessage(" Employees Working in "+comp.getCompanyName());
		return mapper;
	}
	
	/*@GetMapping(value="/employees/delete/{id}")
	public List<Employee> deleteEmployee(@PathVariable("id") int id){
		EmployeeService.deleteEmployee(id);
		return EmployeeService.findAll();
	}*/
	
	@GetMapping(value="/employees/delete/{id}")
	public RecordMapper deleteEmployee(@PathVariable("id") int id){
		EmployeeService.deleteEmployee(id);
		RecordMapper mapper=new RecordMapper();
		mapper.setRecords( EmployeeService.findAll());
		mapper.setNumRecords( EmployeeService.findAll().size());
		mapper.setMessage("Record Deleted");
		return mapper;
	}

}

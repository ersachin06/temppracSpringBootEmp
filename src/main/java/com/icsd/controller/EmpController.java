package com.icsd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icsd.model.DeptnoWiseSum;
import com.icsd.model.EmployeeModel;
import com.icsd.servicei.EmployeeService;




@RestController
public class EmpController 
{
	@Autowired
	 EmployeeService empservice;
//	
	@RequestMapping("/getGrpByDeptno")
	public List<DeptnoWiseSum> getGroupByDeptno()
	{
		//customised query
		return empservice.groupByDeptno();
	}

	@RequestMapping("/getOneQueryAnn")
	public EmployeeModel getFindOneQueryAnn()
	{
		//customised query
		return empservice.findOne("KING");
	}
	
	
	@RequestMapping("/getTemp")
	public String getTemp()
	{
		return "hello icsd tech labs";
	}
	@GetMapping("/getEmployeesByDeptnoOrderByySalAsc")
	public List<EmployeeModel> getEmployeeByDeptnoOrderBySalAsc()
	{
		
		return empservice.getEmployeeByDeptnoOrderBySalAsc(10);
		
	}
	@GetMapping("/getEmployeeByEname")
	public List<EmployeeModel> getEmployeesByEname()
	{
		
		return empservice.getEmployeeByEname("SMITH");
		
	}
	
	@GetMapping("/getEmpContainsEnameLIKE")
	public List<EmployeeModel> getEmpContainsEnameLIKE()
	{
		
		return empservice.getEmpContainsEnameLIKE("T");
		
	}
	@GetMapping("/getEmployeeByEnameIgnoreCase")
	public List<EmployeeModel> getEmployeesByEnameIgnoreCase()
	{
		
		return empservice.getEmployyeByEnameIgnoreCase("smith");
		
	}
	@GetMapping("/getEmployeeByMgrAndDeptno")
	public List<EmployeeModel> getDsitinctEmployeeByMgrAndDeptno()
	{
		
		return empservice.getDistinctEmployeeByMgrAndDeptno(7698, 30);
		
	}
	@GetMapping("/getEmpByMgrDeptno")
	public List<EmployeeModel> getEmployeesByMgrAndDeptno()
	{
		
		return empservice.getEmployeeByMgrAndDeptno(7698, 30);
		
	}
	@GetMapping("/employees")
	public List<EmployeeModel> getEmployeeList()
	{System.out.println("insidde get");
		return empservice.getEmployeeList();
		
	}
	@GetMapping("/employees/{empid}")
	public EmployeeModel getEmployeeById(@PathVariable("empid") int empid)//employess/1
	//path param- employees/1-- this is pura url.
	{
		System.out.println("insde get with id");
		return empservice.getEmployeeById(empid);
	}
//	To be able to convert the JSON sent as HTTP Body content into a Java object which we can use in our application we need to use the @RequestBody annotation for the method argument.
//	Convert JSON into our own custom class
//	When we use the @RequestBody to annotate the method argument we are telling the framework to convert the JSON or XML payload which is in the request body of HTTP request into the object of a given type
	@PostMapping("/employees")
	public void addEmployee(@RequestBody EmployeeModel emp)
	{
		//json - ename in json is smae as ename variabvle in class emp.
		System.out.println("hereeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
		System.out.println(emp.getEmpno());
		System.out.println("Date received is : "+ emp);
		 empservice.addEmployee(emp);
	}
	
	@PutMapping("/employees")
	public void updateEmployee(@RequestBody EmployeeModel emp)
	{
		System.out.println(emp.getEmpno());
		System.out.println(emp.getEname());
		System.out.println(emp.getHiredate());
		System.out.println("insidde put");
		empservice.updateEmp(emp);
	}
	
	@DeleteMapping("/employees/{empid}")
	public void deleteEmployee(@PathVariable int empid)
	{
		System.out.println("inside delete");
		empservice.deleteEmp(empid);
		
	}
}



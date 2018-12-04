package com.icsd.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icsd.model.EmployeeModel;
import com.icsd.repo.EmployeeRepository;
import com.icsd.servicei.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService 
{

	@Autowired
	private EmployeeRepository emprepo;
	
	@Override
	public List<EmployeeModel> getEmployeeList() {
		
		return emprepo.findAll();
	}

	@Override
	public void addEmployee(EmployeeModel emp) {
		emprepo.save(emp);
		System.out.println("Emp inserted");
		
	}

	@Override
	public EmployeeModel getEmployeeById(int empid) {
	
		System.out.println("Emp get by id fired");
		EmployeeModel emp=emprepo.findById(empid).get();
		return emp;
	}

	@Override
	public void updateEmp(EmployeeModel emp) 
	{
		emprepo.save(emp);
		System.out.println("data updated");
		
	}

	@Override
	public void deleteEmp(int empid) {
		emprepo.deleteById(empid);
		
	}

	
}

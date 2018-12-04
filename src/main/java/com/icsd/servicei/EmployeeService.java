package com.icsd.servicei;

import java.util.List;

import com.icsd.model.EmployeeModel;

public interface EmployeeService {

	
	public List<EmployeeModel> getEmployeeList();
	public void addEmployee(EmployeeModel emp);
	public EmployeeModel getEmployeeById(int empid);
	public void updateEmp(EmployeeModel emp);
	public void deleteEmp(int empid);
	
	
}

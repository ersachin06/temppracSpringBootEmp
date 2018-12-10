package com.icsd.servicei;

import java.util.List;

import com.icsd.model.DeptnoWiseSum;
import com.icsd.model.EmployeeModel;

public interface EmployeeService {

	
	public List<EmployeeModel> getEmployeeList();
	public void addEmployee(EmployeeModel emp);
	public EmployeeModel getEmployeeById(int empid);
	public void updateEmp(EmployeeModel emp);
	public void deleteEmp(int empid);
	public List<EmployeeModel> getEmployeeByMgrAndDeptno(int mgr,int deptno);
	// Enables the distinct flag for the query
   public List<EmployeeModel> getDistinctEmployeeByMgrAndDeptno(int mgr,int deptno);
   // Enabling ignoring case for an individual property
	 public List<EmployeeModel> getEmployyeByEnameIgnoreCase(String ename);
	 public List<EmployeeModel> getEmployeeByEname(String ename);
	 public List<EmployeeModel> getEmployeeByDeptnoOrderBySalAsc(int deptno);
	 
	 public List<EmployeeModel> getEmpContainsEnameLIKE(String ename);
	 
	 public EmployeeModel findOne(String ename);
	 public   List<DeptnoWiseSum> groupByDeptno();
	//List<EmployeeModel> findByEmailAddressAndLastname(EmailAddress emailAddress, String lastname);

//	  // Enables the distinct flag for the query
//	  List<EmployeeModel> findDistinctPeopleByLastnameOrFirstname(String lastname, String firstname);
//	  List<EmployeeModel> findPeopleDistinctByLastnameOrFirstname(String lastname, String firstname);
//
//	  // Enabling ignoring case for an individual property
//	  List<EmployeeModel> findByLastnameIgnoreCase(String lastname);
//	  // Enabling ignoring case for all suitable properties
//	  List<EmployeeModel> findByLastnameAndFirstnameAllIgnoreCase(String lastname, String firstname);
//
//	  // Enabling static ORDER BY for a query
//	  List<EmployeeModel> findByLastnameOrderByFirstnameAsc(String lastname);
//	  List<EmployeeModel> findByLastnameOrderByFirstnameDesc(String lastname);
}

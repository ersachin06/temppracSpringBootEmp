package com.icsd.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icsd.model.DeptnoWiseSum;
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
	//List<EmployeeModel> findByEmailAddressAndLastname(EmailAddress emailAddress, String lastname);
	public List<EmployeeModel> getEmployeeByMgrAndDeptno(int mgr,int deptno)
	{
		System.out.println("....................................");
		System.out.println(mgr+" "+ deptno);
		System.out.println("....................................");
		List<EmployeeModel> emp=emprepo.findByMgrAndDeptno(mgr, deptno);//7698 30
		return emp;
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
	@Override
	public List<EmployeeModel> getDistinctEmployeeByMgrAndDeptno(int mgr,int deptno)
	{
		System.out.println("....................................");
		System.out.println(mgr+" "+ deptno);
		System.out.println("....................................");
		List<EmployeeModel> emp=emprepo.findDistinctEmployeeByMgrAndDeptno(7698, 30);
		return emp;
	}
	@Override
	public List<EmployeeModel> getEmployyeByEnameIgnoreCase(String ename) {
		// TODO Auto-generated method stub
		List<EmployeeModel> lst=emprepo.findByEnameIgnoreCase(ename);
		return lst;
	}
	@Override
	public List<EmployeeModel> getEmployeeByEname(String ename) {
		// TODO Auto-generated method stub
		List<EmployeeModel> lst=emprepo.findByEname(ename);
		
		return lst;
	}
	@Override
	public List<EmployeeModel> getEmployeeByDeptnoOrderBySalAsc(int deptno) {
		// TODO Auto-generated method stub
		List<EmployeeModel> lst=emprepo.findByDeptnoOrderBySalAsc(deptno);
		return lst;
	}
	@Override
	public List<EmployeeModel> getEmpContainsEnameLIKE(String ename) {
		List<EmployeeModel> lst=emprepo.findByEnameContaining(ename);
		return lst;
	}
	public EmployeeModel findOne(String ename)
	{
		EmployeeModel e=emprepo.findOne(ename);
		return e;
	}
	@Override
	public   List<DeptnoWiseSum> groupByDeptno() {
	
		  List<DeptnoWiseSum> d=emprepo.findGpByDeptno();
		return d;
	}

	
}

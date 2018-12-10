package com.icsd.services;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.icsd.model.DeptModel;

import com.icsd.model.EmployeeModel;
import com.icsd.repo.DeptRepository;
import com.icsd.repo.EmployeeRepository;
import com.icsd.servicei.DeptService;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService 
{
	@Autowired
	private DeptRepository deptrepo;
	@Autowired
	EmployeeRepository repo;
	@Override
	public void addDept() {
		// TODO Auto-generated method stub
		DeptModel dept=new DeptModel(46, "tpt", "delhi");
		EmployeeModel e1=new EmployeeModel(105, "deepak", "ANALYST", 7839, new Date(), 800, 1200.0, 46);
		Set<EmployeeModel> emps=new HashSet<EmployeeModel>();
		emps.add(e1);
		dept.setEmps(emps);
		deptrepo.save(dept);
		
		System.out.println("emp with dept saved");
	}

///	@Autowired
	//private DeptRepository deptrepo;

//	@Override
//	public void addDept() {
//		// TODO Auto-generated method stub
//		//DeptModel dept=new DeptModel(40, "tpt", "delhi");
//		Set emp=new HashSet();
//		emp.add(new EmployeeModel(45, "deepak", "ANALYST", 7839, new Date(), 800, 1200.0, 10, dept));
//		//                    (int empnoname, String job, Integer mgr, Date hiredate, double sal, Double comm,
//			//	int deptno, DeptModel deptModel)
//		//dept.set
//		deptrepo.save(dept);
//		
//	}
}

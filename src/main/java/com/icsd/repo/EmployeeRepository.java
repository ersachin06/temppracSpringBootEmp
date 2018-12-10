package com.icsd.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.icsd.model.DeptnoWiseSum;
import com.icsd.model.EmployeeModel;



public interface EmployeeRepository extends JpaRepository<EmployeeModel, Integer> 
{
	List<EmployeeModel> findByMgrAndDeptno(Integer mgr, int deptno);
	//List<EmployeeModel> findDistinctEmployeeByJob(String job);//7698 30
	List<EmployeeModel> findDistinctEmployeeByMgrAndDeptno(Integer mgr,int deptno);
	List<EmployeeModel> findEmployeeDistinctByMgrAndDeptno(Integer mgr,int deptno);
	public List<EmployeeModel> findByEnameIgnoreCase(String ename);
	public List<EmployeeModel> findByEname(String ename);
	public List<EmployeeModel> findByDeptnoOrderBySalAsc(int deptno);
	
	
    List<EmployeeModel> findByEnameContaining(String ename);
    //List<Person> findPersonByHobbyName(String name);
    
    @Query("select e from EmployeeModel e where e.ename = ?1 and  e.deptno=10")
    EmployeeModel findOne(String ename);
    
	
    @Query("SELECT  new com.icsd.model.DeptnoWiseSum(sum(e.sal),e.deptno) FROM  EmployeeModel   e GROUP BY  e.deptno")
     List<DeptnoWiseSum> findGpByDeptno();
    
    
		 
		 
}

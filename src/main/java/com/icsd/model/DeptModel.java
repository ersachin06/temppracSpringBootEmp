package com.icsd.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//dept -countinnets
@Entity
@Table(name="dept")
public class DeptModel 
{
	@Id
	int deptno;
	String dname;
	String loc;
	
	 public Set<EmployeeModel> getEmps() {
		return emps;
	}




	public void setEmps(Set<EmployeeModel> emps) {
		this.emps = emps;
	}
	//@OneToMany(mappedBy="deptModel", cascade = CascadeType.ALL)
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="deptno")
	Set<EmployeeModel> emps;
	 //Set emp = new HashSet();

	 
	public DeptModel()
	{
		
	}
	
	
	
	
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}




	public DeptModel(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}




	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
}

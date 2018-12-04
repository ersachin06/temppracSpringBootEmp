package com.icsd.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

//desc emp
//Name     Null     Type         
//-------- -------- ------------ 
//EMPNO    NOT NULL NUMBER(4)    
//ENAME             VARCHAR2(10) 
//JOB               VARCHAR2(9)  
//MGR               NUMBER(4)    
//HIREDATE          DATE         
//SAL               NUMBER(7,2)  
//COMM              NUMBER(7,2)  
//DEPTNO            NUMBER(2)

@Entity
@Table(name="emp")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeModel 
{
	@Id
	@Column(name="empno")
	public int empno;
	public String ename;
	public String job;
//	@JsonInclude(JsonInclude.Include.NON_NULL)
	public Integer mgr;//to handle null values - as mgr is having null value 
	public Date hiredate;
	
	public double sal;
	 
	
	public Double comm;//to handle null values - as comm is having null value
	public int deptno;
	
	public EmployeeModel()
	{
		super();
		comm=null;//this null will be inserted into tbl emp.
		System.out.println("Employee model default cer called");
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Integer getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Double getComm() {
		return comm;
	}
	public void setComm(String comm) 
	{
		if(comm ==null )
		{
			this.comm=0.0;
			System.out.println("comm is null");
		}
		else
		{
		    this.comm =Double.parseDouble(comm);
		}
		if(comm.equals("null"))
		{
			
			System.out.println("comm is 'null'");
		}
		//this.comm=0.0;
		
//		  if(null != Double.valueOf(comm)){
//		        this.comm =Double.parseDouble(comm);
//
//		    }else{
//		        this.comm = 0.0;
//		    }
		//this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	
}

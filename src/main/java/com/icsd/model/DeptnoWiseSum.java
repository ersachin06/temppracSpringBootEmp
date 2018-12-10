package com.icsd.model;

public class DeptnoWiseSum 
{
	double sum;
	int deptno;
	public DeptnoWiseSum()
	{
		
	}
	public DeptnoWiseSum(double sum, int deptno) {
		super();
		this.sum = sum;
		this.deptno = deptno;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	@Override
	public String toString() {
		return "DeptnoWiseSum [sum=" + sum + ", deptno=" + deptno + "]";
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
}

package com.icsd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icsd.model.DeptnoWiseSum;
import com.icsd.servicei.DeptService;
import com.icsd.servicei.EmployeeService;

@RestController
public class DeptController 
{
	@Autowired
	DeptService deptservice;
//	
	@RequestMapping("/addDept")
	public String addDepttt()
	{
		//customised query
		deptservice.addDept();
		return "hello icsd";
	}
}
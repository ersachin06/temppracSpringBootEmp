package com.icsd.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.icsd.model.EmployeeModel;



public interface EmployeeRepository extends JpaRepository<EmployeeModel, Integer> 
{

}

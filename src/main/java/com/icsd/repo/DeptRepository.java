package com.icsd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icsd.model.DeptModel;

public interface DeptRepository extends JpaRepository<DeptModel, Integer>
{

}

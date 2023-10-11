package com.dl.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dl.model.EmpModel;

public interface EmpRepo extends JpaRepository<EmpModel, Integer>{

}

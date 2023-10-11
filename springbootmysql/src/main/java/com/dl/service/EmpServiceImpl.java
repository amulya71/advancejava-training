package com.dl.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dl.model.EmpModel;
import com.dl.repo.EmpRepo;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired(required = false)
	EmpRepo empRepo;

	@Override
	public List<EmpModel> getEmployee() {
		List<EmpModel> findAll = empRepo.findAll();
		List<EmpModel> filteredList = new ArrayList<>();
		for (EmpModel emp : findAll) {
			String jobTitle = emp.getEmpJob();
			if (jobTitle.equals("LAW")) {
				filteredList.add(emp);
			}
		}

		return filteredList;
	}

}

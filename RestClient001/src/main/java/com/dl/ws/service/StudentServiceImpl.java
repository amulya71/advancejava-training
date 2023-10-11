package com.dl.ws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dl.ws.dao.StudentDao;
import com.dl.ws.models.StudentModel;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Override
	public String getStudent() {
		return studentDao.getStudent();
	}

	@Override
	public List<String> getStudentList() {
		return studentDao.getStudentList();
	}

	@Override
	public StudentModel getStudentModel() {
		return studentDao.getStudentModel();
	}

	@Override
	public List<StudentModel> getStudentModelList() {
		return studentDao.getStudentModelList();
	}

	@Override
	public StudentModel getStudentBySerialNumber(int serialNumber) {
		return studentDao.getStudentBySerialNumber(serialNumber);
	}

	
	
	

}

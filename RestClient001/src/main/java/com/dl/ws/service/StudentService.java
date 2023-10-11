package com.dl.ws.service;

import java.util.List;

import com.dl.ws.models.StudentModel;

public interface StudentService {
	
	String getStudent();
	
	List<String> getStudentList();
	
	StudentModel getStudentModel();
	
	List<StudentModel> getStudentModelList();
	
	StudentModel getStudentBySerialNumber(int i);
	
	

}

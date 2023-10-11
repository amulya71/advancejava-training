package com.dl.ws.dao;

import java.util.List;

import com.dl.ws.models.StudentModel;

public interface StudentDao {
	
	String getStudent();
	
	List<String> getStudentList();
	
	StudentModel getStudentModel();
	
	List<StudentModel> getStudentModelList();
	
	StudentModel getStudentBySerialNumber(int i);

}

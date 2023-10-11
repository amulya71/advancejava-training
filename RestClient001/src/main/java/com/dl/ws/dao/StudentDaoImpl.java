package com.dl.ws.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.dl.ws.models.StudentModel;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Override
	public String getStudent() {
		String studentName = "Reuben";
		String studentId = "101";
		return studentName + " " + studentId;
	}

	@Override
	public List<String> getStudentList() {
		List<String> students = new ArrayList<>();
		students.add("Reuben");
		students.add("Kumar");
		students.add("Ammu");

		return students;
	}

	@Override
	public StudentModel getStudentModel() {
		StudentModel model = new StudentModel();
		model.setContact(242405);
		model.setFirstName("reuben");
		model.setId(101);
		model.setLastName("Kumar");
		model.setLocation("hyd");

		return model;
	}

	@Override
	public List<StudentModel> getStudentModelList() {
		List<StudentModel> students = new ArrayList<>();
		students.add(new StudentModel(101, "Sai", "Kiran", 9876543210L, "Hyd"));
		students.add(new StudentModel(102, "Sai", "Kumar", 9876543210L, "Hyd"));
		students.add(new StudentModel(103, "Sai", "Krishna", 9876543210L, "Hyd"));

		return students;
	}

	@Override
	public StudentModel getStudentBySerialNumber(int i) {
		Map<Integer, StudentModel> students = new HashMap<Integer, StudentModel>();
		students.put(1, new StudentModel(101, "Sai", "Kiran", 9876543210L, "Hyd"));
		students.put(2, new StudentModel(102, "Sai", "Kumar", 9876543210L, "Hyd"));
		students.put(3, new StudentModel(103, "Sai", "Krishna", 9876543210L, "Hyd"));
		
		StudentModel student = students.get(i);
		
		if (student != null) {
			return student; // Return the student as a list
	    } else {
	        return new StudentModel();
	    }
		
		
	}



}

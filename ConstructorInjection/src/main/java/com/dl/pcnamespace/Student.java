package com.dl.pcnamespace;

public class Student {

	private int rollNo;
	private String studentName;
	private String university;

	public Student() {
	}

	public Student(int rollNo, String studentName, String university) {
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.university = university;
	}
	

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", university=" + university + "]";
	}

}

package com.dl.valueaselement;

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

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", university=" + university + "]";
	}

}

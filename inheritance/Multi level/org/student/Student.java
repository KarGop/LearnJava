package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name: Karthi");
	}
	public void studentDept() {
		System.out.println("Student Department : CSE");
	}
	public void studentId() {
		System.out.println("Student ID : 1511");
	}

	public static void main(String[] args) {
		Student student = new Student();
		student.collegeCode();
		student.collegeName();
		student.collegeRank();
		student.deptName();
		student.studentId();
		student.studentName();
		student.studentDept();

	}

}

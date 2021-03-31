package org.Student;

import org.Department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Ramkumar Ramiah");
	}

	public void studentDept() {
		System.out.println("Mechanical");
	}

	public void studentId() {
		System.out.println("4171");
	}

	public void getStudentInfo(int Id) {
System.out.println("Student id: " +Id);
	}

	public void getStudentInfo(int Id, String Name) {
		System.out.println("Student id: " + Id + "Student Name: " +Name);
	}

	public void getStudentInfo(String Email, long Ph_no) {
		System.out.println("Student email: " + Email + "Student phone: " +Ph_no);
	}

	public static void main(String[] args) {

		Student student = new Student();

		student.getStudentInfo(4171);
		student.getStudentInfo(4171, "RKR");
		student.getStudentInfo("ramramiah102@gmail.com", 9750249477l);
		
		
		
		/*
		 * student.studentName(); student.studentDept(); student.studentId();
		 * student.deptName(); student.collegeName(); student.collegeCode();
		 * student.collegeRank();
		 */

	}
}

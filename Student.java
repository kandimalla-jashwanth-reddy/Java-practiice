package Encapsulation;

public class Student {
	private int rollNumber;
	private String name;
	private boolean isAttended;
	
	public Student(int rollNumber) {
		this.rollNumber =rollNumber;
	}
	public void setStudentAttendence(boolean flag) {
		if(!isAttended)
		isAttended =flag;
		System.out.println("teacher is assigned attendence");
	}
	public boolean getStudentAttendence() {
		System.out.println("teacher accessed student attendence.");
		return isAttended;
	}
}

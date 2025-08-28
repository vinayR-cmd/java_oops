package com.Student;

public class Regular_student extends Student{
	int attendence_per;
	String classroom;
	
	public Regular_student(String name,String dept, int roll_no, double age,int attendence_per,String classroom) {
//		this.name=name;
//		use super keyword to 
		super(name,dept,roll_no,age);
		this.attendence_per=attendence_per;
		this.classroom=classroom;
		
	}
	public Regular_student() {
		this.name=null;
		this.dept=null;
		this.roll=0;
		this.age=0.0f;
		this.attendence_per=0;
		this.classroom=null;
		
	}
	public void payFee() {
		System.out.println("The student "+name+"paid the tution fee + library fee+ lab fee");
	}
}

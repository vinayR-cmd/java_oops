package com.Student;

public class HostelStudent extends Regular_student{
	String hostel_name;
	int room_no;
	
	public HostelStudent(String name,String dept, int roll_no, double age,int attendence_per,String classroom,String hostel_name, int room_no) {
		super(name,dept,roll_no,age,attendence_per,classroom);
		this.hostel_name=hostel_name;
		this.room_no=room_no;
		
	}
	
	public void payFee() {
		System.out.println("The student "+name+"paid the tution fee + library fee+ lab fee +hostel fees");
	}
}

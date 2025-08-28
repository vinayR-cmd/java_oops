package com.Student;


public class test_student {
	public static  void main(String[] args) {
		Student s1=new Student("Rohan","AI",67,20);
		
		System.out.println("the name of the student is : "+s1.name);
		Regular_student rs=new Regular_student("Riya","AI",90,20,90,"H703");
		rs.display_info();
//		function overriding 
		rs.payFee();
		s1.payFee();
		HostelStudent hs1=new HostelStudent("Riya","AI",90,20,90,"H703","Tagore",228);
		hs1.payFee();
		s1.search(20);
		s1.search("rohan","ai");
		s1.search(20,"vinay");
	}
}

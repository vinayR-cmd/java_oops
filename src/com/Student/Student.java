package com.Student;

public class Student {
	String name;
	String dept="AI";
	int roll;
	double age;
	static String clg_name="KIET";
	
//	here is the function overloading as in both constructors the number of the parameters are different
	public Student(String name,String dept, int roll_no, double age){
		this.name=name;
		this.dept=dept;
		this.roll=roll_no;
		this.age=age;
	}
	public Student() {
		this.name=null;
		this.dept=null;
		this.roll=0;
		this.age=0.0f;
	}
	void  search(int roll) {
		System.out.println("The roll no is : "+roll);
	}
	void search(String name, String dept) {
		System.out.println("The name is "+name+"and the dept is :"+dept);
	}
	void search(int roll, String name) {
		System.out.println("The roll is :"+roll+"abd the name is :"+name);
	}
	
	public void studying(int hours) {
		System.out.println("The student"+name+"is studying for "+hours);
	}
	public void read_write(){
		System.out.println("the student can read and write");
	}
	public void display_info() {
		System.out.println("The student name is "+ name +"and age is "+age +"and roll no is "+roll+"and department is :"+dept);
	}
	public void payFee() {
		System.out.println("The student "+name+"paid the tution fee");
	}
	
//	public static void main(String[] args) {
//		Student s1=new Student();
//		Student s2=new Student();
//		s1.display_info();
//		s1.name="Billu";
//		s1.dept="CSEAI";
//		s1.roll=999;
//		s1.age=14;
//		s1.display_info();
////		System.out.println("clg_name is : "+s1.clg_name);
////		Student.clg_name="ABES";
////		System.out.println("clg_name is : "+s1.clg_name);
////		System.out.println("clg_name is : "+s2.clg_name);
////		s1.clg_name="NIET";
////		System.out.println("clg_name is : "+s1.clg_name);
////		System.out.println("clg_name is : "+s2.clg_name);
////		s1.dept="ME";
////      final variable can't be updated again 
////		System.out.println("Dept name is :"+s1.dept);
//		Student s3=new Student("NOTTY","AI",34,21);
//		s3.display_info();
//	}
	
}

package example.access.packge;

import com.Student.Student;
//  to get all the classes of the package 
//import com.Student.*;


// to access the protected variable from another class by making a sub class 
// use public class test extends Student
public class test extends Student {
	public static  void main(String[] args) {
		Student s1=new Student("Rohan","AI",67,20);
		test t1=new test();
		System.out.println("the name of the student is : "+t1.name);
	}
}

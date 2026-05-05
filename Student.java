package com.staticusages.java;

public class Student {
 int rollno;
 String name;
static String college="AIS";

 Student (int r,String n){
	 rollno=r;
	 name=n;
 }
 void display() {
		 System.out.println(rollno+" "+name+" "+college);
	 }
	 public static void main(String[] args) {
		Student s1 = new Student(11,"rishi");
		Student s2 = new Student(12,"dinesh");
		Student s3 = new Student(13,"rishika");
		s1.display();
		s2.display();
		s3.display();
		//we can change the college name of all objects in one line only
		//classname.methodname()
		Student.college="Gujarat University";
		s3.display();
	}
	 
 }


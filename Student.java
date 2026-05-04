package com.constructorchaining.java;

public class Student {
int rollno;
String name;
//this refers current class variables
  public Student(int r,String n) {
	this.rollno=r;
	this.name=n;//Constructor with parameters example
}
 
 void displayInforamtion() {
	System.out.println("rollno"+rollno+" ");
	System.out.println("name:"+name+" "); 
 }
public static void main(String[] args) {
	
	Student s1= new Student(1,"deva");
	s1.displayInforamtion();
	
	
	Student s2 =new Student(2,"riva");
	s2.displayInforamtion();
	
	
}
}

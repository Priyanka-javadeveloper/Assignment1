package com.staticusages.java;
//static method example
public class StudentPractice {
	int rollno;
	 String name;
	static String college ="AIS";
	
static	void  change(){//static method to change the value of static variable
	college ="Gujarat University";
	}
	
	StudentPractice (int r,String n){
		 rollno=r;
		 name=n;
	 }
	 void display() {
			 System.out.println(rollno+" "+name+" "+college);
		 }
		 public static void main(String[] args) {
			 StudentPractice.change();
			StudentPractice s1 = new StudentPractice(11,"rishi");
			StudentPractice s2 = new StudentPractice(12,"dinesh");
			StudentPractice s3 = new StudentPractice(13,"rishika");
			//to call static method ,syntax is classname.methodname()
			
						
			s1.display();
			s2.display();
			s3.display();
			
			
			
		}
	 }




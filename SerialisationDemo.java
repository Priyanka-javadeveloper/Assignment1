package com.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 class Student implements Serializable{
int rollNo;
String sName;
double percentage;

public Student(int rNo, String n, double per) {
	this.rollNo = rNo;
	sName = n;
	this.percentage = per;
}
public String  toString() {
		return "Student[rNo="+rollNo+","+"name="+sName+",per="+ percentage+"]";
	}
 }
public class SerialisationDemo{
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Student s1 = new Student(1,"priya",80);
		
		FileOutputStream fos = new FileOutputStream("ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.flush();
		oos.close();
		
		FileInputStream fir = new FileInputStream("ser");
		ObjectInputStream ois = new ObjectInputStream(fir);
		Student s2 =(Student) ois.readObject();
		System.out.println(s2);
		ois.close();
	}
}


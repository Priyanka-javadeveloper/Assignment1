package com.constructors.java;

public class CopyConstructor {
int id;
String name;
 CopyConstructor(int i,String n) {
	id=i;
	name=n;
 }
 //(classname obj)
  public CopyConstructor(CopyConstructor t){
	 id=t.id;
	 name=t.name;
 }
  void display() {
	 System.out.println(id+" " +name+" ");
 }
 public static void main(String[] args) {
	 CopyConstructor c = new CopyConstructor(101, "puja");
	 CopyConstructor c2 = new CopyConstructor(102,"deepa");
	//calling copy constructor
	 CopyConstructor obj =new CopyConstructor(c2);
	obj.display();
	
	
	//without using constructors calling 
//	c.id=c2.id;(1st obj. =2nd obj.
 
//	c.name=c2.name;
//	
//	c2.display();
	c.display();
	
}
}

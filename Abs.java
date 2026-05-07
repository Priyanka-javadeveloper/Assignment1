package com.core.java;
abstract class Abs1{
	void math1() {
		System.out.println("math1");//normal method 
	}
	abstract void  math2() ;//abstract method
		
	//abstract and a normal method is here in Abstract class, so it is called partial abstraction
}

class Abs2 extends Abs1{
   void math2() {
		System.out.println("Math2");
		
	}
	
}
public class Abs{
	public static void main(String[] args) {
		Abs2 a = new Abs2();
		a.math2();
		a.math1();
	}
}//abstraction means hiding implementing details.
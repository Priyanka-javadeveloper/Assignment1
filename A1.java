package com.examplesofinheritance.java;

public class A1 {
	A1(){
		System.out.println("this is default constructor");
	}
	void show() {
		System.out.println("show from A1");
	}
}
	 class B1 extends A1{
		B1(){
			System.out.println("this is default constructor");
		}
		void show() {
			System.out.println("show from B1");
		}
	 }
	 class C1 extends B1 {
			C1(){
				System.out.println("this is default constructor");
			}
			void show() {
				super.show();
				System.out.println("show from C1");
			}
	 public static void main(String[] args) {
	C1  c= new C1();
	c.show();
}
}

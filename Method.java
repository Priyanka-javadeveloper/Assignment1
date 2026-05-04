package com.constructorchaining.java;

public class Method {
 static void greet1() {
	 System.out.println("it is a static method calling");
 }
 void greet() {
	 System.out.println("itis a non static method calling");
 }
 public static void main(String[] args) {
	Method m= new Method();
	m.greet();//nonstatic kabatti obj creat chesi call chesem
	Method.greet1();//calling static method by classname.obj
}
}

package com.staticusages.java;

public class Cube {
 static int cube(int x) {
	 return x*x*x;
 }
 public static void main(String[] args) {
	int result = Cube.cube(132);//classname.methodname()
	System.out.println(result);
}
}
//........clear
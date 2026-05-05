package com.staticusages.java;

public class Counter {
//int count =0;//will get memory each time when instance is created
   static int count=90;//will memory get once and retain its value
Counter() {
	 count++;
	System.out.println(count);
	
}
public static void main(String[] args) {
	Counter c1 = new Counter();
	Counter c2 = new Counter();
	Counter c3 = new Counter();
	
	
}
}
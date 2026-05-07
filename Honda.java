package com.abstraction.java;
 abstract class Bike{//abstract class having abstract method
	 abstract void run() ;
}
public class Honda extends Bike{//child class override abstract method
void run() {
	System.out.println("Running safely");
}
public static void main(String[] args) {
	Honda h = new Honda();
	h.run();
	
}
}

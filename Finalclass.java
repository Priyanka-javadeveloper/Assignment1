package com.finalusages.java;
//example of final class
   class Vehicle{
	void show() {
		System.out.println("in show1");
	}
}
public  class Finalclass extends Vehicle {
	//we cannot extend it if we kept class as final
void run() {
	System.out.println("in show 2");
}
}

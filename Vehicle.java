package com.constructors.java;

public class Vehicle {
	Vehicle() {
	        System.out.println("This is a Vehicle");
	    }
}

	// Subclass 
	class Car extends Vehicle {
	    	Car() {
	        System.out.println("This Vehicle is Car");
	    }
	}
	class Bus extends Vehicle {
	    	    Bus() {
	    	        System.out.println("This Vehicle is Bus");
	    	    }
	    	
	

	
	    public static void main(String[] args) {
	        // Creating object of subclass invokes base class constructor
	        Car  obj = new Car();
	        Bus obj2 = new Bus(); 
	        
	    }
	}


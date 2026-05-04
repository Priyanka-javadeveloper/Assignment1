package com.core.java;

public class TpyeCasting {
	public static void main(String[] args) {
		
	
	 //Implicit Type Casting  
    // Smaller data type is automatically converted to a larger data type
    int intVal = 100;
    double doubleVal = intVal; // int -> double (automatic)
    
    //System.out.println("=== Implicit Type Casting (Widening) ===");
    System.out.println("Integer value: " + intVal);
    System.out.println("Converted to double: " + doubleVal);

    // Explicit Type Casting 
    // Larger data type is manually converted to a smaller data type
    double originalDouble = 99.99;
    int narrowedInt = (int) originalDouble; // double -> int (manual)
    
    System.out.println("\n=== Explicit Type Casting (Narrowing) ===");
    System.out.println("Double value: " + originalDouble);
    System.out.println("Converted to int: " + narrowedInt);

    // Potential Data Loss Example
    long largeLong = 123456789L;
    short smallShort = (short) largeLong; // May cause overflow
    
    System.out.println(" Data Loss Example in Narrowing");
    System.out.println("Original long value: " + largeLong);
    System.out.println("Converted to short: " + smallShort);
}
}


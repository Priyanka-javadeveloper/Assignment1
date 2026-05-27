package com.collections.java;

public class GenricDemo {
//	public static <E> void printArray(E[] inputArray) {
//	for(E e:inputArray) {
//		System.out.println(e+" ");
//	}
//	System.out.println();
//}
//public static void main(String[] args) {
//	Integer intArray[] = {1,2,3,4,5};
//	Double doubleArray[] = {12.2222,13.111,4.5};
//	String strArray[] = {"java","python"};
//	Character charArray[] = {'t','o','p'};
//	
//	printArray(intArray);
//	printArray(doubleArray);
//	printArray(strArray);
//	printArray(charArray);
//}
//}

	
	public static<E> void printArray(E[] inputArray) {
			for(E e:inputArray) {
				System.out.println(e);
			}
		}
	public static void main(String[] args) {
		Integer intArray[]= {1,2,3};
		Double doubleArray[]= {1.222,13.222};
		Character charArray[]= {'c','h','a','r'};
	    String stringArray[]= {"java","python"};
	   printArray(intArray);
	   printArray(doubleArray);
	   printArray(stringArray);
	   printArray(charArray);
	}		
	}
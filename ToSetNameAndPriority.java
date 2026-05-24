package com.treads;

class A extends Thread{
	A(String name, int priority) {  
    super(name);          // Set thread name  
    setPriority(priority); // Set thread priority (1 to 10)  
}  

public void run() {  
    System.out.println(getName() + " with priority " + getPriority() + " is running.");  
} 
}
public class ToSetNameAndPriority{
public static void main(String[] args) {  
    A t1 = new A("Thread 1", 3);  
    A t2 = new A("Thread 2", 7);  
    A t3 = new A("Thread 3", 5);  
    A t4 = new A("Thread 4", 7);  
    A t5 = new A("Thread 5", 2);  

    t1.start();  
    t2.start();  
    t3.start();  
    t4.start();  
    t5.start(); 
   
}  
}

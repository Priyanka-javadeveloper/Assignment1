package com.program.java;

import java.util.Scanner;

public class ScanerFibonacci {
	public static void main(String[] args) {
		
	 long first=0;
	 long second=1;
	long n;
	
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter number of terms in fibonacci series:");
 n=sc.nextLong();
 if(n<=0) {
 System.out.println("Numbers must be greater than zero");
}
 for(int i=0;i<=n;i++) {
	 System.out.print(first+(i<n ? ",":" "));
	 long next =first+second;
	 first=second;
	 second= next;
 }
 sc.close();
}
}
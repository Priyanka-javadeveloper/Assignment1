package com.methooverloading;

public class OverrloadingCalculation {
int sum(int a,int b){
	
	return a+b;
	
}
 String sum(String a,String b){
	 
	return  a+b;
}
 public static void main(String[] args) {
	 OverrloadingCalculation obj = new OverrloadingCalculation();
	System.out.println(obj.sum("priya", "ram"));
	 System.out.println(obj.sum(1, 3));
 }
}
	  
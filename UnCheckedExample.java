package com.exceptionexercise.java;

public class UnCheckedExample {
	public static void main(String[] args) {
		
	
  String str = null;
try {
	System.out.println(str.length());
}catch(Exception e){
	System.out.println("Nullpointer exception"+e);
}

try {
int arr[]= new int [2];
System.out.println(arr[4]);//exception may occur

}catch(Exception e) {
	System.out.println("Array index out of bound exception"+e);
}

try{
	int result =10/0;
	
}catch(Exception e) {
	System.out.println("Arithmetic Exception"+e);
	
}
}
}


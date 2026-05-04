package com.arrays.java;

import java.util.Scanner;

public class MultiplicationMatrix{

public static void main(String[] args) {
	int r1,r2,col1,col2;
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter row and cols of 1st matrix:");
	System.out.print("enter rows1:");
	r1=sc.nextInt();
	System.out.print("Enter cols1:");
	col1=sc.nextInt();
	
	System.out.println("Enter rows and colsof second matrix:");
	System.out.print("enter rows2:");
	r2=sc.nextInt();
	System.out.print("Enter cols2:");
	col2=sc.nextInt();
	
	
	int[][] matrixa=new int[r1][col1];
	int[][] matrixb=new int[r2][col2];
	
	
	System.out.println("enter rows and coloumns of ist matrix:");
	for(int i=0;i<r1;i++) {
		 for(int j=0;j<col1;j++) {
			 System.out.print("A["+i+"]["+j+"]"+"elements:"+matrixa[i][j]);
			 matrixa[i][j]=sc.nextInt();
		 }	 
	 }
	System.out.println("enter rows and coloumns of second matrix:");
		 for(int i=0;i<r2;i++) {
			 for(int j=0;j<col2;j++) {
				 System.out.print("B["+i+"]["+j+"]"+"elements:"+matrixb[i][j]);
				 matrixb[i][j]=sc.nextInt();//input from user
				 }
		 }
		if(col1!=r2) {
			System.out.println("matrix multiplication is not possible");
		}
//Perform multiplication
int[][] result=new int[r1][col2];


for ( int i=0;i<r1;i++) {
for (int j=0;j<col2;j++) {
       for (int  k = 0; k < r2; k++) {
result[i][j] += matrixa[i][k] * matrixb[k][j];
}
}
}

//Display result
System.out.print("Resultant Matrix:");

for(int i=0;i<r1;i++) {
for(int j=0;j<col2;j++) {
System.out.print(result[i][j]+" ");
}
}
System.out.println();
sc.close();
}
}




//doubt

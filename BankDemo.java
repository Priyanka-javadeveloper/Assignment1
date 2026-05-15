package com.exceptionexercise.java;

import java.util.Scanner;

public class BankDemo {
public static void main(String[] args) {
	CheckingAccount cm = new CheckingAccount(2402, "priya", 100);
	Scanner sc = new Scanner(System.in);
	double amount;
	int choice;
	while(true) {
		System.out.println("***************************");
		System.out.println("1.Deposite");
		System.out.println("2.withdraw");
		System.out.println("3.checkbalance");
		System.out.println("4.exit");
		System.out.println("***************************");
		System.out.println("Enter your choice:");
		choice=sc.nextInt(); 
		System.out.println("***************************");
		
		 if(choice == 1) {
			 amount= sc.nextDouble();
			 cm.deposite(amount);
		 }
		 else if(choice==2) {
				 amount=sc.nextDouble();
				 try {
					 cm.withdraw(amount);
				 }catch(InSufficientFund e) {
				 System.out.println("sorry you need another"+e.getAmount()+"rs");
				 break;
			     }
		      }
		 else if(choice==3) {
			cm.checkBalance();	
		     }
		 else if(choice ==4) {
			System.out.println("Thank you for using our services");
			System.out.println("********************************");
			break;
		}
		 else {
			 System.out.println("invalid choice");
			System.out.println("*********************************");
			
		 }
	}
}
}
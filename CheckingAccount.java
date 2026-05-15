package com.exceptionexercise.java;

public class CheckingAccount{
 int acno;
 String cname;
 double balance;
 public CheckingAccount(int acno, String cname, double balance) {
	this.acno = acno;
	this.cname = cname;
	this.balance = balance;	
	System.out.println("Hello"+" "+cname +", your account no"+" "+acno+" "+"is opened with"+" "+"rs."+this.balance);
 } 
 public void deposite(double amnt) {
	 this.balance=this.balance+amnt;
 }
public void withdraw(double amnt) throws InSufficientFund {
	if(amnt<=this.balance) {
		this.balance=this.balance-amnt;
	}else {
		throw new InSufficientFund(amnt);
	}
}
public void checkBalance() {
	System.out.println("current balance"+this.balance);
}
}